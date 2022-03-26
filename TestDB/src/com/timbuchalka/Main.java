package com.timbuchalka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
	    try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\databases\\testjava.db");
            Statement statement = conn.createStatement();
            statement.execute("CREATE Table contacts (name TEXT, phone INTEGER, email TEXT)");

            //closing database resources
            statement.close();
            conn.close();

        }catch (SQLException e){
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
