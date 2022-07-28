<%@page import="java.util.List"%>
<%@page import="com.User.Post"%>
<%@page import="com.DAO.PostDAO"%>
<%@page import="com.Db.DBConnection"%>
<%
    UserDetails user3 = (UserDetails) session.getAttribute("userD");   //we cant use variable user bcoz we import navbar page and in navbar page already take this variable .
    
    if(user3==null)
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
        <title>Show Notes</title>
        
        <%@include file="all_component/allcss.jsp" %>
        
    </head>
    <body>
        
        <%@include file="all_component/navbar.jsp" %>
        
        <%
            String succMsg = (String) session.getAttribute("UpdateSucc");
            
            if(succMsg!=null)
            {
        %>
        
        <div class="alert alert-success text-center" role="alert"> <%= succMsg %> </div>
        
        <%
            session.removeAttribute("UpdateSucc");
            }
        %>
        
        <div class="container">
            
            <h2 class="text-center">All Notes :</h2>
            
            <div class="row">
                
                    
                    <%
                                if(user3!=null)
                                {
                                    PostDAO ob = new PostDAO(DBConnection.getConn());
                                    List<Post> post = ob.getData(user3.getId());
                                    
                                    for(Post po : post)   //  type  variable : name
                                    {
                                    
                         %>
                <div class="col-md-6">
                    
                    <div class="card mt-3">
                        
                        <img src="img/enote2.jpg" class="card-img-tp mt-2 mx-auto" style="max-width: 150px">
                        
                        <div class="card-body p-4">
                            
                            
                            
                            <h5 class="cart-title"><%= po.getTitle() %> </h5>
                            <p><%= po.getContent()%></p>
                            
                            <p>
                                <b class="text-success">Published By : <%= user3.getName()%> </b>
                                <br>
                                <b class="text-primary"></b> 
                            </p>
                            
                            <p>
                                <b class="text-success">Published Date :  <%= po.getPdate()%></b>
                                <br>
                                <b class="text-success"></b> 
                            </p>
                            
                            <div class="container text-center mt-2">
                                <a href="deleteServlet?note_id=<%= po.getId() %>" class="btn btn-danger">Delete</a>
                                <a href="edit.jsp?note_id=<%= po.getId() %>" class="btn btn-primary"> Edit</a>
                            </div>
                            
                        </div>
                        
                        
                    </div>    <!-- card end -->
                    
                </div>  <!-- col end -->    
                    <%
                                  }
                            }
                    %>
                    
                
            </div>  <!-- Row end -->
            
            
        </div>  <!-- container end -->
        
        <br>
        <br>
        
        <%@include file="all_component/footer.jsp" %>
        
    </body>
</html>
