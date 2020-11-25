package day1;

import java.sql.*;

public class LoopingResultSet {

    public static void main(String[] args) throws SQLException {
        // REPLACE THIS IP ADDRESS WITH YOUR OWN THAT WORKING IN SQL DEVELOPER
        String connectionStr = "jdbc:oracle:thin:@54.157.171.44:1521:XE";
        String username = "hr";
        String password = "hr";
        Connection conn = DriverManager.getConnection(connectionStr, username, password);
        Statement stmnt = conn.createStatement();
        ResultSet rs = stmnt.executeQuery("SELECT * FROM REGIONS");

        while(rs.next()){
            System.out.println("Region_ID " + rs.getString("Region_ID"));
            System.out.println("Region_Name " + rs.getString("Region_Name"));

        }
        // iterate over all countries

        rs = stmnt.executeQuery("SELECT * FROM COUNTRIES");
        //rs.next();
        //System.out.println(rs.getString(1));

        while(rs.next()){
            System.out.println(rs.getString(1) + "\t");
            System.out.println(rs.getString(2) + "\t");
            System.out.println(rs.getString(3));

        }
       // rs.previous();


    }
}
