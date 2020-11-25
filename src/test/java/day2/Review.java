package day2;

import java.sql.*;

public class Review {
    public static void main(String[] args) throws SQLException {
        String connectionStr = "jdbc:oracle:thin:@54.157.171.44:1521:XE";
        String username = "hr" ;
        String password = "hr" ;
        Connection conn = DriverManager.getConnection(connectionStr,username,password) ;
        Statement stmnt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs   =   stmnt.executeQuery("SELECT * FROM JOBS") ;
        rs.next(); // currently we are at the very first row
        //
        rs.next();
        System.out.println("First column value in jobs " +rs.getString(1));
        System.out.println("Second column value in jobs " +rs.getString(2));
        //
        rs.absolute(7);
        System.out.println("First column value in Row 7 " +rs.getString(1));
        System.out.println("Second column value in Row 7 " +rs.getString(2));
        rs.last();
        System.out.println("First column value in last row " + rs.getString(1));
        System.out.println("Second column value in last row " + rs.getString(2));

        rs.previous();
        System.out.println("First column value in 2nd row from last " + rs.getString(1));
        System.out.println("Second column value in 2nd row from last " + rs.getString(2));

        System.out.println("--------Loop from last row till first row get MIN_SALARY COLUMN AS NUMBER--------");

       // rs.beforeFirst();
        //while( rs.next()){
           // System.out.println("Loop First Column " +rs.getString("JOB_ID"));
        rs.afterLast();
        while( rs.previous()){
            System.out.println("MIN SALARY COLUMN AS NUMBER $ " +rs.getDouble("MIN_SALARY"));
        }
        // clean up the connection, result, and statement
        rs.close();
        stmnt.close();
        conn.close();



    }
}
