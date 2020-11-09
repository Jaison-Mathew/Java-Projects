package com.company;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    //adds items in groceryList
    public void addGroceryItem(String item){
        groceryList.add(item);

    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    //prints items in groceryList
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your list");
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    //modifies item of the index that has the currentItem value in groceryList
    public void modifyGroceryItem(String currentItem, String newItem){

        int postion = finditem(currentItem);
        if (postion >= 0){
            modifyGroceryItem(postion, newItem);
        }
    }

    //modifies item in the position index of groceryList
    private void modifyGroceryItem(int position, String groceryItem){
        groceryList.set(position, groceryItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(String item){
        int postion = finditem(item);
        if (postion >= 0){
            removeGroceryItem(postion);
        }
    }

    //removes items from groceryList
    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    private int finditem(String searchitem){
        return groceryList.indexOf(searchitem);
    }

    //checks if the item is in the array list
    public boolean onFile(String searchItem){
        int position = finditem(searchItem);
        if (position >= 0){
            return true;
        }
        return false;
    }
}
