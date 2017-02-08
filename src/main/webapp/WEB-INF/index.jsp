<%@ page import="com.pluralsight.User" %>
<html>
<head>
    <style ="text/css">
        .blueUser {
            background: blue;
        }
    </style>
</head>
<body>
    <form action="home" method="post" class="${app.formCssClass}">
        Name: <input type="text" name="name" /><input type="submit" value="Enter name" />
    </form>

    <%
        User user = (User)request.getAttribute("user");
        System.out.println(user.getName());
    %>

    <p>Welcome ${user.name}!</p>
</body>
</html>
