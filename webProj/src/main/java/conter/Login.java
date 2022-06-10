package conter;



import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/*
 * дописать реализацию регистрации пользователей новая колонка исадмин
 * админ видит всех пользователей (обязательно, серега будет проверять!)
 */

@WebServlet("/Login")
public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String login = request.getParameter("login");
        String pass = request.getParameter("pass");

        if (DAO.checkUser(login, pass)) {
            out.println("Welcome " + login);

                if (DAO.checkIsadmin(login)) {
                    String path = "/adminpage.jsp";
//                    ServletContext servletContext = getServletContext();
//                    RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher(path);
//                    requestDispatcher.forward(request, response);
                    List<User> users;
                    users=DAO.getUsers();
                    request.setAttribute("users", users);
                    request.getRequestDispatcher(path).forward(request, response);
//                    Connection conn = DAO.getDbConnection();
//                    out.println("All registers:");
//                    PreparedStatement ps = conn.prepareStatement("select * from a1.register;");
//                    ResultSet resultSet = ps.executeQuery();
//                    while (resultSet.next()) {
//                        out.print("login: "+resultSet.getString(1)+"\t"+"password: ");
//                        out.println(resultSet.getString(2));
//                    }

                }
          //  }catch (SQLException e){

           // }
           // RequestDispatcher rs = request.getRequestDispatcher("index.html");
          //  rs.include(request, response);
        } else {
            out.println("Username or Password incorrect");
            RequestDispatcher rs = request.getRequestDispatcher("index.html");
            rs.include(request, response);
        }
    }


}
