package com.Servlet;

import com.DAO.PostDAO;
import com.Db.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@MultipartConfig
public class addNotesServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            
            int uid = Integer.parseInt(request.getParameter("uid"));
            String title = request.getParameter("title");
            String content = request.getParameter("content");
            
            
            PostDAO po = new PostDAO(DBConnection.getConn());
            
            
            boolean f = po.AddNotes(title, content, uid);
            
            if(f)
            {
                System.out.print("\n\ndone\n\n");
                response.sendRedirect("showNotes.jsp");
            }
            else
            {
                 System.out.print("\n\n data of add notes not inserted . \n\n");
            }
            
        
    }

}
