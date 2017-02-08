<%@ page import="com.pluralsight.User" %>
<html>
<head>
    <style ="text/css">
        .blueUser {
            background: blue;
        }
        .redUser {
            background: red;
        }
    </style>
</head>
<body>
    <form action="home" method="post" class="${app.formCssClass.name}">
        Name: <input type="text" name="name" /><input type="submit" value="Enter name" />
    </form>

    <p>Welcome ${user.name}!</p>

    ${app.tabNames[0]}:${app.tabNames[1]}:${app.tabNames[2]}
</body>
</html>
