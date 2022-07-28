<%-- 
    Document   : register.jsp
    Created on : 1 Jan, 2022, 3:40:40 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
        
        <%@include file="all_component/allcss.jsp" %>
        
    </head>
    <body>
        <%@include file="all_component/navbar.jsp" %>
        
        <div class="container-fluid div_color pt-4" style=" background-image: linear-gradient(to right top, #ed6700, #ec9000, #e5b500, #d9d828, #c8f95a); height: 560px">
            <div class="row">
                <div class="col-md-4 offset-md-4">
                    
                    <div class="card">
<!--                        <div class="card-header">
                            
                        </div>-->
                        <div class="card-header text-center bg-custom text-white">
                            <i class="fa fa-user-plus fa-3x"></i>
                            <br>
                            <h4>Register Here</h4>    
                        </div>

        <!-- iss ke request  UserServlet par jayegi -->

  <%
      String regMes = (String) session.getAttribute("reg-success");
      
      if(regMes!=null)
      {
  %>
       <div class="alert alert-success" role="alert">
           <%=regMes%> Click Here <a href="login.jsp">Login</a> .
       </div>
  <%
          session.removeAttribute("reg-success");
      }
      
      
      String FailedMsg = (String) session.getAttribute("failed-msg");
      
      if(FailedMsg!=null)
      {
          
  %>
  %>
       <div class="alert alert-danger" role="alert">
           <%=FailedMsg%>
       </div>
  <%
          session.removeAttribute("failed-msg");
      }
  %>
  
  
                        
                        <div class="card-body">
                            
                            <form action="UserServlet" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Full Name</label>
    <input type="text" name="fname" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Name" required>
    
  </div>
                                
  <div class="form-group">
    <label for="exampleInputEmail1">Enter Email address</label>
    <input type="email" name="uemail" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" required>
    
  </div>
                                
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" name="upassword" class="form-control" id="exampleInputPassword1" placeholder="Password" required>
  </div>
  
  <button type="submit" class="btn btn-primary badge-pill btn-block m-2 p-2">Register</button>
  
                    </form>
                            
                        </div>
                        
                    </div>
                    
                    
                </div>
            </div>
        </div>
        
        <%@include file="all_component/footer.jsp" %>
        
    </body>
</html>
