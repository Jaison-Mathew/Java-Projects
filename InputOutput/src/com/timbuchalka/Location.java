package com.timbuchalka;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Location implements Serializable{
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    private long serialVersionUID = 1L;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if (exits != null){
            this.exits = new LinkedHashMap<String, Integer>(exits);
        }else {
            this.exits = new LinkedHashMap<String, Integer>();
        }
        this.exits.put("Q", 0);
    }

/*
    // stores map info
    public void addExit(String direction, int location){
        exits.put(direction, location);
    }
*/


    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new LinkedHashMap<String, Integer>(exits);         // ensures that nothing outside of this class can change exits
    }

    protected void addExit(String direction, int location){
        exits.put(direction, location);
    }
}
