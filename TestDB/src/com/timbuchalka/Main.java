package com.timbuchalka;

import java.sql.*;

public class Main {
    public static final String DB_Name = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:D:\\databases" + DB_Name;

    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {

	    try{
//            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\databases\\testjava.db");
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
            //conn.setAutoCommit(false);
            Statement statement = conn.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

            statement.execute("CREATE Table IF NOT EXISTS " + TABLE_CONTACTS + " (" + COLUMN_NAME + " text, " +
                    COLUMN_PHONE + " integer, " +
                    COLUMN_EMAIL + " text" + ")");

            insertContact(statement, "Tim", 6545678, "tim@email.com");
            insertContact(statement, "Joe", 45632, "joe@anywhere.com");
            insertContact(statement, "Jane", 4829484, "jane@somewhere.com");
            insertContact(statement, "Fido", 9038, "dog@email.com");

/*          Without using insertContact method:
            statement.execute("INSERT INTO " + TABLE_CONTACTS + " (" + COLUMN_NAME + ", " +
                   COLUMN_PHONE + ", " + COLUMN_EMAIL + " ) " + "VALUE('Tim', 6545678, 'tim@email.com')");

            statement.execute("INSERT INTO " + TABLE_CONTACTS + " (" + COLUMN_NAME + ", " +
                    COLUMN_PHONE + ", " + COLUMN_EMAIL + " ) " + "VALUE('Joe', 45632, 'joe@anywhere.com')");

            statement.execute("INSERT INTO " + TABLE_CONTACTS + " (" + COLUMN_NAME + ", " +
                    COLUMN_PHONE + ", " + COLUMN_EMAIL + " ) " + "VALUE('Jane', 4829484, 'jane@somewhere.com')");

            statement.execute("INSERT INTO " + TABLE_CONTACTS + " (" + COLUMN_NAME + ", " +
                    COLUMN_PHONE + ", " + COLUMN_EMAIL + " ) " + "VALUE('Fido', 9038, 'dog@email.com')");
*/

            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " + COLUMN_PHONE + "=5566789" + " WHERE " +
                    COLUMN_NAME + "='Jane'");

            statement.execute("DELETE FROM " + TABLE_CONTACTS + " WHERE " + COLUMN_NAME + "='Joe'");

//            statement.execute("INSERT INTO contacts (name, phone, email)" + "VALUES('Tim', 6545678, 'tim@email.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)" + "VALUES('Jane', 4829484, 'jane@somewhere.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)" + "VALUES('Fido', 9038, 'dog@email.com')");
//            statement.execute("UPDATE contacts SET phone=5566789 WHERE name='Jane'");
//            statement.execute("DELETE FROM contacts WHERE name='Tim'");
//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();
            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while (results.next()){
                System.out.println(results.getString(COLUMN_NAME) + " " + results.getInt(COLUMN_PHONE) + " " +
                        results.getString(COLUMN_EMAIL));
            }

            results.close();

            //closing database resources
            statement.close();
            conn.close();

        }catch (SQLException e){
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS + " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " + COLUMN_EMAIL + " ) " + "VALUE('" + name + "', " + phone + ", '" + email + "')");

    }
}
