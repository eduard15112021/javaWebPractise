package conter;

import java.sql.*;

public class Connect {
    java.sql.Connection dbConnection;

    public java.sql.Connection getDbConnection()
            throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        try {
            dbConnection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/a1", "root", "123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dbConnection;
    }

    public static boolean checkUser(String login,String pass)
    {
        boolean st =false;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/a1","root","123456");
            PreparedStatement ps = conn.prepareStatement("select * from a1.register where login=? and pass=?");
            ps.setString(1, login);
            ps.setString(2, pass);
//
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                st = true;
            }


        }
        catch(Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return st;
    }
}
