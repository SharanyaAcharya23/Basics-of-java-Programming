<%@ page import="java.sql.*" %>
<html>
<head><title>Delete Coffee</title></head>
<body>
<h2>Delete Coffee by ID</h2>
<form method="post" action="deleteCoffee.jsp">
    Enter ID to Delete: <input type="number" name="id" required>
    <input type="submit" value="Delete">
</form>

<%
String id = request.getParameter("id");

if (id != null) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        PreparedStatement ps = con.prepareStatement("DELETE FROM coffee WHERE id = ?");
        ps.setInt(1, Integer.parseInt(id));
        ps.executeUpdate();
        out.println("<p style='color:green;'>Deleted successfully!</p>");
        ps.close();
        con.close();
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
