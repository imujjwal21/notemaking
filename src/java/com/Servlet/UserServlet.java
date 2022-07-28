package com.Servlet;

import com.DAO.UserDAO;
import com.Db.DBConnection;
import com.User.UserDetails;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */
public class UserServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UserServlet</title>");            
            out.println("</head>");
            out.println("<body>");
           
            String name = request.getParameter("fname");
            String email = request.getParameter("uemail");
            String password = request.getParameter("upassword");
            
       
            UserDetails us = new UserDetails(name ,email ,password);
            
            UserDAO dao = new UserDAO(DBConnection.getConn());
            
            boolean f = dao.addUser(us);
            
            if(f){
                HttpSession session = request.getSession();
                session.setAttribute("reg-success", "Registeration Successfully ..");   // we give reg-success is name of session
                response.sendRedirect("register.jsp");
            }
            else
            {
                HttpSession session = request.getSession();
                session.setAttribute("failed-msg", "Something went wrong on Server ..");
                response.sendRedirect("register.jsp");
            }
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

}
