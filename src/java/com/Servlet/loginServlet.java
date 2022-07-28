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

public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet loginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String email = request.getParameter("uemail");
            String password = request.getParameter("upassword");
            
            UserDAO dao = new UserDAO(DBConnection.getConn());
            
            UserDetails us = dao.loginUser(email,password);
            
            if(us==null)
            {
               HttpSession session = request.getSession();
                session.setAttribute("login-failed", "Invalid User E-mail or Password ..");    // we give login-failed is name of session
                response.sendRedirect("login.jsp");
                
            }
            else
            {
                HttpSession s = request.getSession();
                s.setAttribute("userD", us);
                response.sendRedirect("home.jsp");
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }
}
