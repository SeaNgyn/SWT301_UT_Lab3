<%-- 
    Document   : login
    Created on : Mar 5, 2024, 11:38:34 PM
    Author     : Admin
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="loginServlet" method="post">
            <input type="text" placeholder="user" name="username"> <br/>
            <input type="password" placeholder="pass" name="password"><br/>
            <input type="number" placeholder="phone" name="phonenumber"><br/>
            <button type="submit" name="action" value="login">Login</button>
            <button type="submit" name="action" value="register">Register</button>
        </form>
        <%
            if(request.getAttribute("check") != null && !request.getAttribute("check").equals("")) {
            out.println(request.getAttribute("check"));
                }
        %>
    </body>
</html>
