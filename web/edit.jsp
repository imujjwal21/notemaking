<%@page import="com.User.Post"%>
<%@page import="com.DAO.PostDAO"%>
<%@page import="com.Db.DBConnection"%>
<%
    UserDetails user1 = (UserDetails) session.getAttribute("userD");   //we cant use variable user bcoz we import navbar page and in navbar page already take this variable .
    
    if(user1==null)
    {
        response.sendRedirect("login.jsp"); 
        session.setAttribute("login-failed", "Please Login First .. ");
    }
         
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Page</title>
        
        <%@include file="all_component/allcss.jsp" %>
        
    </head>
    <body>
        
        <%@include file="all_component/navbar.jsp" %>
        
        <%
            int noteid = Integer.parseInt(request.getParameter("note_id"));
           
            PostDAO post = new PostDAO(DBConnection.getConn());
            
            Post p = post.getDataById(noteid);
            
        %>
        
        
        <h1 class="text-center mt-4">Add Your Notes</h1>
        
<div class="container-fluid mt-4">
            
    <div class="container">
                
        <div class="row">
                    
            <div class="col-md-12">
                
 <form action="NoteEditServlet" method="post">
     
     <input type="hidden" value="<%=noteid %>" name="noteid" >
     
 <div class="form-group">
    
     
    <label for="exampleInputEmail1">Enter Title</label>
    <input type="text" name="title" value="<%= p.getTitle() %>" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Title of Notes" required>
   
  </div>
                    
  <div class="form-group">
    <label for="exampleInputPassword1" class="large">Enter Content</label>
    <textarea rows="10" name="content" class="form-control" placeholder="Enter Content" required><%= p.getContent()%></textarea>
  </div>
 
     <div class="container text-center mb-4">
     
  <button type="submit" class="btn btn-primary btn-lg text-center">Save</button>
     </div>
</form>
             
            </div>
        
        </div>
                
    </div>
            
</div>
        <%@include file="all_component/footer.jsp" %>
        
        
    </body>
</html>
