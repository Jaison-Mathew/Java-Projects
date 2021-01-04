package com.company;

public abstract class ListItem {
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();           //returns next entry
    abstract ListItem setNext(ListItem item);        //saves item
    abstract ListItem previous();          //returns previous entry
    abstract ListItem setPrevious(ListItem item);        //saves previous item

    abstract int compareTo(ListItem item);       //compares item to see if its the same

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }


}
