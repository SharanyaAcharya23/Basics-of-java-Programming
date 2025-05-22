<%@ page import="java.sql.*" %>
<html>
<head><title>Coffee Names Starting with D</title></head>
<body>
<h2>Coffee Names Starting with 'D'</h2>
<table border="1">
<tr><th>ID</th><th>Name</th><th>Price</th></tr>
<%
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM coffee WHERE coffee_name LIKE 'D%'");

    while (rs.next()) {
%>
<tr>
    <td><%= rs.getInt("id") %></td>
    <td><%= rs.getString("coffee_name") %></td>
    <td><%= rs.getInt("price") %></td>
</tr>
<%
    }
    rs.close(); st.close(); con.close();
} catch (Exception e) { out.println(e); }
%>
</table>
</body>
</html>
