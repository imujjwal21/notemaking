<%-- 
    Document   : login.jsp
    Created on : 1 Jan, 2022, 3:40:56 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        
        <%@include file="all_component/allcss.jsp" %>
        
    </head>
    <body>
        <%@include file="all_component/navbar.jsp" %>
       
        
        <div class="container-fluid div_color pt-5" style=" background-image: linear-gradient(to right top, #ed6700, #ec9000, #e5b500, #d9d828, #c8f95a); height: 542px">
            <div class="row">
                <div class="col-md-4 offset-md-4">
                    
                    <div class="card" >
<!--                        <div class="card-header">
                            
                        </div>-->
                        <div class="card-header text-center bg-custom text-white">
                            <i class="fa fa-user-circle-o fa-3x"></i>
                            <br>
                            <h4>Login Page</h4>    
                        </div>

<%
      String invalidMsg = (String) session.getAttribute("login-failed");
      
      if(invalidMsg!=null)
      {
          
  %>
       <div class="alert alert-danger" role="alert">
           <%=invalidMsg%>
       </div>
  <%
          session.removeAttribute("login-failed");
      }
  %>
  
  <%
      String lgMsg = (String) session.getAttribute("logoutSucc");
      
      if(lgMsg!=null)
      {
          
  %>
       <div class="alert alert-success" role="alert">
           <%=lgMsg%>
       </div>
  <%
          session.removeAttribute("logoutSucc");
      }
  %>
  

                        <div class="card-body">
                            
                            <form action="loginServlet" method="post">
                                
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Email address</label>
    <input type="email" name="uemail" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" required>
    
  </div>
                                
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" name="upassword" class="form-control" id="exampleInputPassword1" placeholder="Password" required>
  </div>
  
  <button type="submit" class="btn btn-primary badge-pill btn-block m-2 p-2">Login</button>
</form>
                            
                        </div>
                        
                    </div>
                    
                    
                </div>
            </div>
        </div>
        
        <%@include file="all_component/footer.jsp" %>
        
    </body>
</html>
