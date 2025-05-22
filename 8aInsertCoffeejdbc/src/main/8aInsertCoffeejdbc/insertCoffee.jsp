<%@ page import="java.sql.*" %>
<html>
<head><title>Insert Coffee</title></head>
<body>
<h2>Add New Coffee Product</h2>
<form method="post" action="insertCoffee.jsp">
    Name: <input type="text" name="name" required><br/>
    Price: <input type="number" name="price" required><br/>
    <input type="submit" value="Insert">
</form>

<%
String name = request.getParameter("name");
String price = request.getParameter("price");

if (name != null && price != null) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        PreparedStatement ps = con.prepareStatement("INSERT INTO coffee(coffee_name, price) VALUES (?, ?)");
        ps.setString(1, name);
        ps.setInt(2, Integer.parseInt(price));
        ps.executeUpdate();
        out.println("<p style='color:green;'>Inserted successfully!</p>");
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    }
}
%>

<h3>Coffee Table</h3>
<table border="1">
<tr><th>ID</th><th>Name</th><th>Price</th></tr>
<%
try {
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM coffee");
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
