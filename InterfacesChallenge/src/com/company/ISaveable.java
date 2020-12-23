package com.company;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    //returns List containing objects of type String
    public List<String> write();

    //stores values in List
    public void read(List<String> listValues);
}
