package day1;

import java.sql.*;

public class TestConnection {

    public static void main(String[] args) throws SQLException {
        // REPLACE THIS IP ADDRESS WITH YOUR OWN THAT WORKING IN SQL DEVELOPER
        String connectionStr = "jdbc:oracle:thin:@54.157.171.44:1521:XE";
        String username = "hr" ;
        String password = "hr" ;
        Connection conn = DriverManager.getConnection(connectionStr,username,password) ;
        Statement stmnt = conn.createStatement();
        ResultSet rs   =   stmnt.executeQuery("SELECT * FROM REGIONS") ;
        rs.next(); // currently we are at the very first row

        System.out.println("first column value using index: --> " +  rs.getString(1)   );
        System.out.println("second column value using index: --> " +  rs.getString(2)   );
   // rs.getString (cplumn name)
        System.out.println("Region_ID at this row is: "+ rs.getString("REGION_ID"));
        System.out.println("Region_Name at this row is: "+ rs.getString("REGION_NAME"));
        rs.next();

        System.out.println("Region_ID at this row is: "+ rs.getString("REGION_ID"));
        System.out.println("Region_Name at this row is: "+ rs.getString("REGION_NAME"));
        rs.next();

        System.out.println("Region_ID at this row is: "+ rs.getString("REGION_ID"));
        System.out.println("Region_Name at this row is: "+ rs.getString("REGION_NAME"));
        rs.next();

        // use loop










    }

}

