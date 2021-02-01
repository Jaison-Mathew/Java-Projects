package com.timbuchalka;

interface Accessible {          // package private
    int SOME_CONSTANT = 100;    //public, because all interface variables are public static
    public void methodA();  //public
    void methodB();     //public, because all interface methods are automatically public
    boolean methodC();  //public, because all interface methods are automatically public
}
