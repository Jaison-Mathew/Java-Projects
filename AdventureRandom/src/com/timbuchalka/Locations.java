package com.timbuchalka;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new LinkedHashMap<Integer, Location>();
    private static Map<Integer, IndexRecord> index = new LinkedHashMap<>();
    private static RandomAccessFile ra;

    public static void main(String[] args) throws IOException {
        /*
        try(BufferedWriter locFile = new BufferedWriter(new FileWriter("locations.txt"));
            BufferedWriter dirFile = new BufferedWriter(new FileWriter("directions.txt"))){
            for (Location location : locations.values()){
                locFile.write(location.getLocationID() + ", " + location.getDescription() + "\n");
                for (String direction : location.getExits().keySet()){
                    if (!direction.equalsIgnoreCase("Q")){
                        dirFile.write(location.getLocationID() + ", " + direction + ", " + location.getExits().get(direction) + "\n");
                    }
                }
            }
        }

        FileWriter locFile = null;
        try {
            locFile = new FileWriter("locations.txt");
            for (Location location : locations.values()){
                locFile.write(location.getLocationID() + ", " + location.getDescription() + "\n");
            }
        }finally {
            System.out.println("In finally block");
            if (locFile != null) {
                System.out.println("Attempting to close locFile");
                locFile.close();
            }
        }

        try(DataOutputStream locFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("locations.dat")))){
            for (Location location : locations.values()){
                locFile.writeInt(location.getLocationID());
                locFile.writeUTF(location.getDescription());
                System.out.println("Writing location " + location.getLocationID() + " : " + location.getDescription());
                System.out.println("Writing " + (location.getExits().size() -1) + " exits.");
                locFile.writeInt(location.getExits().size() - 1);
                for (String direction : location.getExits().keySet()){
                    if (!direction.equalsIgnoreCase("Q")){          // If the key selected is not quit, then print direction
                        System.out.println("\t\t" + direction + ", " + location.getExits().get(direction));
                        locFile.writeUTF(direction);
                        locFile.writeInt(location.getExits().get(direction));
                    }
                }
            }
        }
*/
        try(RandomAccessFile rao = new RandomAccessFile("locations_rand.dat", "rwd")){
            rao.writeInt(locations.size());
            int indexSize = locations.size() * 3 * Integer.BYTES;
            int locationStart = (int) (indexSize + rao.getFilePointer() + Integer.BYTES);       // Accounts for the value that is already written to the file.
            rao.writeInt(locationStart);
            long indexStart = rao.getFilePointer();

            int startPointer = locationStart;
            rao.seek(startPointer);

            for (Location location : locations.values()){
                rao.writeInt(location.getLocationID());
                rao.writeUTF(location.getDescription());
                StringBuilder builder = new StringBuilder();
                for (String direction : location.getExits().keySet()){
                    if (!direction.equalsIgnoreCase("Q")){
                        builder.append(direction);
                        builder.append(",");
                        builder.append(location.getExits().get(direction));
                        builder.append(",");
                    }
                }
                rao.writeUTF(builder.toString());
                IndexRecord record = new IndexRecord(startPointer, (int) (rao.getFilePointer() - startPointer));        // creates index record of location
                index.put(location.getLocationID(), record);

                startPointer = (int) rao.getFilePointer();
            }

            rao.seek(indexStart);       // seeking offset of indexStart
            for (Integer locationID : index.keySet()){      // looping through index records
                rao.writeInt(locationID);
                rao.writeInt(index.get(locationID).getStartByte());
                rao.writeInt(index.get(locationID).getLength());
            }
        }

    }

    // 1.  This first four byte will contain the number of locations (bytes 0-3)
    // 2.  The next four bytes will contain the start offset of the locations section (bytes 4-7)
    // 3.  The next section of the file will contain the index (the index is 1692 bytes long. It will start at byte 8 and end at byte 1699)
    // 4.  The final section of the file will contain the location records (the data). It will start at byte 1700.

    static {
        try{
            ra = new RandomAccessFile("locations_rand.dat", "rwd");         //open locations.rand.dat file
            int numLocations = ra.readInt();            // reads number of locations from file into a variable
            long locationStartPoint = ra.readInt();     // reads offset of the location section

            while (ra.getFilePointer() < locationStartPoint){       // loops until the file pointer reaches the locations offset
                // reads the index and creates the records
                int locationId = ra.readInt();
                int locationStart = ra.readInt();
                int locationLength = ra.readInt();

                IndexRecord record = new IndexRecord(locationStart, locationLength);       // creating new index record
                index.put(locationId, record);      // saving new index record
            }

        }catch (IOException e){
            System.out.println("IOException in static initializer: " + e.getMessage());
        }

/*
            while (!eof){
                try {
                    Map<String, Integer> exits = new LinkedHashMap<>();
                    int locID = locFile.readInt();
                    String description = locFile.readUTF();
                    int numExits = locFile.readInt();
                    System.out.println("Read location " + locID + " : " + description);
                    System.out.println("Found " + numExits + " exits");
                    for (int i=0; i<numExits; i++){
                        String direction = locFile.readUTF();
                        int destination = locFile.readInt();
                        exits.put(direction, destination);
                        System.out.println("\t\t" + direction + "," + destination);
                    }
                    locations.put(locID, new Location(locID, description, exits));
                }catch (EOFException e){
                    eof = true;
                }
            }

        // Scanner scanner = null;
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("locations_big.txt")))) {               //provides same output but without using finally block.
            //scanner = new Scanner(new FileReader("locations_big.txt"));
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()){
                int loc = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String description = scanner.nextLine();
                System.out.println("Imported loc: " + loc + ": " + description);
                Map<String, Integer> tempExit = new HashMap<>();
                locations.put(loc, new Location(loc, description, tempExit));
            }
        }catch (IOException e){
            e.printStackTrace();
        }


        finally {
            if (scanner != null){
                scanner.close();
            }
        }



        // Now read the exits
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("directions_big.txt")))) {      //provides same output but without using finally block.
            //scanner = new Scanner(new BufferedReader(new FileReader("directions_big.txt")));
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()){

                int loc = scanner.nextInt();
                String direction = scanner.next();
                scanner.skip(scanner.delimiter());
                String dest = scanner.nextLine();
                int destination = Integer.parseInt(dest);

                String input = scanner.nextLine();
                String[] data = input.split(",");
                int loc = Integer.parseInt(data[0]);
                String direction = data[1];
                int destination = Integer.parseInt(data[2]);
                
                System.out.println(loc + ": " + direction + ": " + destination);
                Location location = locations.get(loc);
                location.addExit(direction, destination);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        finally {
            if (scanner != null){
                scanner.close();
            }
        }



        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",null));

        //using immutable classes to add exits
        // adding exits for location 1
        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of the road before a small bridge",tempExit));

        // adding exits for location 2
        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));

        // adding exits for location 3
        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));

        // adding exits for location 4
        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));

        // adding exits for location 5
        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest",tempExit));
*/
    }

    public Location getLocation(int locationId) throws IOException{
        IndexRecord record = index.get(locationId);
        ra.seek(record.getStartByte());     // moving the file pointer to the locations offset
        int id = ra.readInt();      // retrieving location id
        String description = ra.readUTF();
        String exits = ra.readUTF();

        // extracts the various exits
        String[] exitPart = new String(exits).split(",");

        //create new location
        Location location = new Location(locationId, description, null);

        //sends exits to the location
        if (locationId != 0){
            for (int i =0; i< exitPart.length; i++){
                System.out.println("exitPart = " + exitPart[i]);
                System.out.println("exitPart[+1] = " + exitPart[i+1]);
                String direction = exitPart[i];
                int destination = Integer.parseInt(exitPart[++i]);
                location.addExit(direction, destination);
            }
        }
        return location;
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }

    // Closes random access file when the player quits the game
    public void close() throws IOException{
        ra.close();
    }
}
