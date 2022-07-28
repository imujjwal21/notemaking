package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import com.Db.DBConnection;
import com.User.UserDetails;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/all_component/allcss.jsp");
    _jspx_dependants.add("/all_component/navbar.jsp");
    _jspx_dependants.add("/all_component/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

    UserDetails user1 = (UserDetails) session.getAttribute("userD");   //we cant use variable user bcoz we import navbar page and in navbar page already take this variable .
    
    if(user1!=null)
    {
        response.sendRedirect("home.jsp"); 
    
    }
         

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home Page</title>\n");
      out.write("        \n");
      out.write("        ");
      out.write("        \n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>  <!--  my css in css folder  -->\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .back-img{\n");
      out.write("                background: url(\"img/pen-table-note.jpg\");\n");
      out.write("                width: 100%;\n");
      out.write("                height: 110vh;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("                bottom: 50px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-custom\">\n");
      out.write("  <a class=\"navbar-brand\" href=\"index.jsp\"> <i class=\"fa fa-book\" aria-hidden=\"true\"></i> ENotes</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("        \n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("          <a class=\"nav-link\" href=\"home.jsp\"> <i class=\"fa fa-home\" aria-hidden=\"true\" ></i>Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"addNotes.jsp\"> <i class=\"fa fa-plus-circle\" aria-hidden=\"true\"></i> Add Notes</a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link  \" href=\"showNotes.jsp\"> <i class=\"fa fa-address-book-o\" aria-hidden=\"true\"></i> Show Notes</a>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");

    UserDetails user = (UserDetails) session.getAttribute("userD");
    
    if(user!=null)
    {


      out.write("\n");
      out.write("\n");
      out.write("<a href=\"#!\" data-toggle=\"modal\" data-target=\"#exampleModal\" class=\"btn btn-light my-2 my-sm-0 mr-2\" type=\"submit\"> <i class=\"fa fa-user-circle-o\" aria-hidden=\"true\"></i> ");
      out.print( user.getName());
      out.write("</a>\n");
      out.write("<a href=\"LogoutServlet\" class=\"btn btn-light my-2 my-sm-0 mr-2\" type=\"submit\"> <i class=\"fa fa-share-square\"></i>  Logout</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("\n");
      out.write("<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Modal title</h5>\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("        \n");
      out.write("          <div class=\"container text-center\">\n");
      out.write("              <i class=\"fa fa-user fa-3x\"> </i>\n");
      out.write("              <h5></h5>\n");
      out.write("              \n");
      out.write("                <table class=\"table\">\n");
      out.write("                    <tbody>\n");
      out.write("                       \n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\">User Id</th>\n");
      out.write("                            <td>");
      out.print( user.getId());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\">Name</th>\n");
      out.write("                            <td>");
      out.print( user.getName());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\">Email Id</th>\n");
      out.write("                            <td> ");
      out.print( user.getEmail());
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("              \n");
      out.write("              <button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("                        <!-- Model End -->\n");
      out.write("\n");

    }
    else
    {

      out.write("\n");
      out.write(" \n");
      out.write("<a href=\"login.jsp\" class=\"btn btn-light my-2 my-sm-0 mr-2\" type=\"submit\"> <i class=\"fa fa-user-circle-o fa-spin\" aria-hidden=\"true\"></i> Login</a>\n");
      out.write("<a href=\"register.jsp\" class=\"btn btn-light my-2 my-sm-0 mr-2\" type=\"submit\"> <i class=\"fa fa-user-plus\" aria-hidden=\"true\"></i> Register</a>\n");
      out.write("\n");

    }

      out.write("\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</nav>");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"container-fluid back-img text-center text-white pt-5\">\n");
      out.write("        \n");
      out.write("            <h1 ><i class=\"fa fa-book\" aria-hidden=\"true\"></i>E Notes-Save your Notes . </h1>\n");
      out.write("        <a href=\"login.jsp\" class=\"btn btn-light mt-3 mr-2\"> <i class=\"fa fa-user-circle-o\" aria-hidden=\"true\"></i> Login</a>\n");
      out.write("        <a href=\"register.jsp\" class=\"btn btn-light mt-3 ml-2\"> <i class=\"fa fa-user-plus\" aria-hidden=\"true\"></i> Register</a>\n");
      out.write("    \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");
      out.write("<div class=\"container-fluid bg-dark text-white text-center mb-0 py-1\">\n");
      out.write("    \n");
      out.write("    <p> Note : Any Error Occur then contact on ujjwal151b@gmail.com .  </p>\n");
      out.write("    <p>Design and Developed by Ujjwal .</p>\n");
      out.write("   \n");
      out.write("</div>");
      out.write("\n");
      out.write("<!--        <script>\n");
      out.write("        $(document).ready(function(){\n");
      out.write("        alert(\"hey this is loaded\")\n");
      out.write("        })\n");
      out.write("        </script>-->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
