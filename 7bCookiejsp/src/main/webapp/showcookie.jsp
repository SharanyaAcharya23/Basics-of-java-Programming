<%@ page import="jakarta.servlet.http.Cookie" %>

<%
    String name = request.getParameter("name");
    String domain = request.getParameter("domain");
    int maxAge = Integer.parseInt(request.getParameter("maxage"));

    Cookie cookie = new Cookie(name, "CookieValue");
    cookie.setMaxAge(maxAge);
    cookie.setPath("/"); // optional
    cookie.setDomain(domain); // optional, remove if testing locally
    response.addCookie(cookie);
%>
<html>
<head><title>Cookie Added</title></head>
<body>
    <h2>Cookie has been set:</h2>
    <ul>
        <li>Name: <%= name %></li>
        <li>Domain: <%= domain %></li>
        <li>Max Age: <%= maxAge %> seconds</li>
    </ul>
    <a href="listcookies.jsp">Go to active cookie list</a>
</body>
</html>
