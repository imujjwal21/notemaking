/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

public class NoteEditServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NoteEditServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            int id = Integer.parseInt(request.getParameter("noteid"));
            String title = request.getParameter("title");
            String content = request.getParameter("content");
            
            PostDAO dao = new PostDAO(DBConnection.getConn());
            
            boolean f = dao.PostUpdate(id, title, content);
            
            if(f)
            {
                HttpSession s = request.getSession();
                s.setAttribute("UpdateSucc","Notes Update Successfully ..");
                
                response.sendRedirect("showNotes.jsp");
            }
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }

}
