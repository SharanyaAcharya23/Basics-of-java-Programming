<%@ page import="jakarta.servlet.http.Cookie" %>

<%
    Cookie[] cookies = request.getCookies();
%>
<html>
<head><title>Active Cookies</title></head>
<body>
    <h2>Active Cookies:</h2>
    <ul>
    <%
        if (cookies != null) {
            for (Cookie c : cookies) {
    %>
                <li><strong><%= c.getName() %></strong>: <%= c.getValue() %></li>
    <%
            }
        } else {
    %>
            <li>No active cookies found.</li>
    <%
        }
    %>
    </ul>
    <a href="addcookie.jsp">Back to Add Cookie</a>
</body>
</html>
