package com.timbuchalka;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
	    try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\databases\\testjava.db");
            //conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("CREATE Table IF NOT EXISTS contacts " + " (name TEXT, phone INTEGER, email TEXT)");
//            statement.execute("INSERT INTO contacts (name, phone, email)" + "VALUES('Tim', 6545678, 'tim@email.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)" + "VALUES('Jane', 4829484, 'jane@somewhere.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)" + "VALUES('Fido', 9038, 'dog@email.com')");
//            statement.execute("UPDATE contacts SET phone=5566789 WHERE name='Jane'");
//            statement.execute("DELETE FROM contacts WHERE name='Tim'");
            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            while (results.next()){
                System.out.println(results.getString("name") + " " + results.getInt("phone") + " " +
                        results.getString("email"));
            }

            results.close();

            //closing database resources
            statement.close();
            conn.close();

        }catch (SQLException e){
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
