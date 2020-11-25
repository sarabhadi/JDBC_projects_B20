package day2;

import java.sql.*;

public class GettingMoreInfoAboutResultSetObject {

    public static void main(String[] args) throws SQLException {
        String connectionStr = "jdbc:oracle:thin:@54.157.171.44:1521:XE";
        String username = "hr";
        String password = "hr";
        Connection conn = DriverManager.getConnection(connectionStr, username, password);
        Statement stmnt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmnt.executeQuery("SELECT * FROM JOBS");
    }
}
