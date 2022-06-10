package conter;

import javax.servlet.RequestDispatcher;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    private static Connection dbConnection;

    public static Connection getDbConnection() {
        return dbConnection;
    }

    public static void setDbConnection(Connection dbConnect) {
        dbConnection = dbConnect;
    }
    public static boolean checkUser(String login, String pass) {
        boolean st =false;
        try {
            connect();
            Connection conn = dbConnection;
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

    public static boolean checkIsadmin(String login) {
        boolean st =false;
        try {
            connect();
            Connection conn = dbConnection;
            PreparedStatement ps = conn.prepareStatement("select IsAdmin from a1.register where login=?");
            ps.setString(1, login);

//
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int isAdmin = rs.getInt("IsAdmin");
                if (isAdmin==1)
                st = true;
            }
        }
        catch(Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return st;
    }

    public static List<User> getUsers(){
        List<User> users= new ArrayList<>();
        Connection conn = dbConnection;
        try {
        PreparedStatement ps = conn.prepareStatement("select * from a1.register");
        ResultSet rs = null;
            rs = ps.executeQuery();
        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String suname = rs.getString(3);
            String country = rs.getString(4);
            String login = rs.getString(5);
            String pass = rs.getString(6);
            User user = new User(id,name,suname,country,login,pass);
            users.add(user);
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public static void registr(String name,String suname,String country,String login,String pass) throws SQLException {
        connect();
        Connection con = getDbConnection();

        PreparedStatement ps = con.prepareStatement("INSERT INTO a1.register (`name`, `suname`, `country`, `login`, `pass`) VALUES ('"+name+"', '"+suname+"','"+country+"', '"+login+"','"+pass+"');");
        ps.executeUpdate();
    }


    public static void connect() {
        if (dbConnection==null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                dbConnection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/a1", "root", "123456");
                setDbConnection(dbConnection);
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }


}
