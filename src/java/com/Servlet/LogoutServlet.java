package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LogoutServlet</title>");            
            out.println("</head>");
            out.println("<body>");
      
            HttpSession s = request.getSession();  //servlet mein iss type se session get hoga par apan jsp mein session.getAttribute("name") se he nikal lete hai.
            s.removeAttribute("userD");
            
            s.setAttribute("logoutSucc", "Logout Successfully  .. ");
            
            response.sendRedirect("login.jsp");
           
            out.println("</body>");
            out.println("</html>");
        }
    }
}
