package conter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/Registr")
public class Registr extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String name = request.getParameter("username");
        String surname = request.getParameter("usersurname");
        String country = request.getParameter("country");
        String login = request.getParameter("login");
        String pass = request.getParameter("pass");
        try {
            DAO.registr(name,surname,country,login,pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
