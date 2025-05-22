<%@ page session="true" %>
<%
    // Set session timeout to 1 minute (60 seconds)
    session.setMaxInactiveInterval(60);

    String name = request.getParameter("username");
    if (name != null) {
        session.setAttribute("user", name);
    }
%>
<html>
<head>
    <title>Greeting</title>
</head>
<body>
<%
    String user = (String) session.getAttribute("user");
    if (user != null) {
%>
    <h2 style="color:green;">Hello <%= user %>!</h2>
    <p>(Your session will expire after 1 minute of inactivity)</p>
<%
    } else {
%>
    <h2 style="color:red;">Session expired or no name provided!</h2>
    <a href="index.jsp">Go Back</a>
<%
    }
%>
</body>
</html>
