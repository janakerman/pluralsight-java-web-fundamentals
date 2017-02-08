<%@ page import="com.pluralsight.User" %>
<html>
<body>
    <form action="home" method="post">
        Name: <input type="text" name="name" /><input type="submit" value="Enter name" />
    </form>

    <%
        User user = (User)request.getAttribute("user");
        System.out.println(user.getName());
    %>

    <p>Welcome ${user.name}!</p>
</body>
</html>
