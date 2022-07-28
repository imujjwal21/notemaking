<%-- 
    Document   : index.jsp
    Created on : 1 Jan, 2022, 3:40:03 PM
    Author     : DELL
--%>

<%
    UserDetails user1 = (UserDetails) session.getAttribute("userD");   //we cant use variable user bcoz we import navbar page and in navbar page already take this variable .
    
    if(user1!=null)
    {
        response.sendRedirect("home.jsp"); 
    
    }
         
%>

<%@page import="java.sql.Connection"%>
<%@page import="com.Db.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        
        <%@include file="all_component/allcss.jsp"    %>
        
        <style type="text/css">
            .back-img{
                background: url("img/pen-table-note.jpg");
                width: 100%;
                height: 110vh;
                background-repeat: no-repeat;
                background-size: cover;
                bottom: 50px;
                
            }
        </style>
        
    </head>
    
    
    
    <body>    
        
        
        <%@include file="all_component/navbar.jsp"%>
        
        <div class="container-fluid back-img text-center text-white pt-5">
        
            <h1 ><i class="fa fa-book" aria-hidden="true"></i>E Notes-Save your Notes . </h1>
        <a href="login.jsp" class="btn btn-light mt-3 mr-2"> <i class="fa fa-user-circle-o" aria-hidden="true"></i> Login</a>
        <a href="register.jsp" class="btn btn-light mt-3 ml-2"> <i class="fa fa-user-plus" aria-hidden="true"></i> Register</a>
    
        </div>
        
        <%@include file="all_component/footer.jsp" %>
<!--        <script>
        $(document).ready(function(){
        alert("hey this is loaded")
        })
        </script>-->
    </body>
</html>
