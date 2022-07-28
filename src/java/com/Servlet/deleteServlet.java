package com.Servlet;

import com.DAO.PostDAO;
import com.Db.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class deleteServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet deleteServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            int id = Integer.parseInt(request.getParameter("note_id"));
            
            PostDAO dao = new PostDAO(DBConnection.getConn());
            boolean f = dao.DeleteNotes(id);
            
            if(f)
            {
                HttpSession s = request.getSession();
                s.setAttribute("UpdateSucc","Note Successfully Delete ..");
                
                response.sendRedirect("showNotes.jsp");
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

}
