

<%
    UserDetails user1 = (UserDetails) session.getAttribute("userD");   //we cant use variable user bcoz we import navbar page and in navbar page already take this variable .
    
    if(user1==null)
    {
        
        session.setAttribute("login-failed", "Please Login First .. ");
        response.sendRedirect("login.jsp"); 
    }
         
%>

<%@page import="com.User.UserDetails"%>
<%@page errorPage="error_page.jsp" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        
        <%@include file="all_component/allcss.jsp" %>
      
        
    </head>
    <body>
       
        <%@include file="all_component/navbar.jsp" %>
        
        <div class="container-fluid">
            
            <div class="card">
                
                <div class="card-body text-center pt-4">
                    <img src="img/enote2.jpg" alt=""  class="img-fluid mx-auto" style="max-width: 550px; "><br><br>
                    <h1>START TAKING YOUR NOTES</h1>
                    <a href="addNotes.jsp" class="btn btn-outline-primary btn-lg">Start Here</a>
                </div>
                
            </div>
            
        </div>
        
        <%@include file="all_component/footer.jsp"%>
        
    </body>
</html>
