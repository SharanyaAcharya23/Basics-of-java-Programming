<%@ page import="java.sql.*" %>
<html>
<head><title>Delete Employees Starting with 'S'</title></head>
<body>
<h2>Delete Employees with Name Starting 'S'</h2>

<%
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");
    PreparedStatement ps = con.prepareStatement("DELETE FROM Emp WHERE empname LIKE 'S%'");
    int rows = ps.executeUpdate();
    out.println("<p style='color:red;'>Deleted " + rows + " employees whose names start with 'S'</p>");
    ps.close(); con.close();
} catch (Exception e) {
    out.println("Error: " + e.getMessage());
}
%>

<h3>Salary Report</h3>
<%
int total = 0;
try {
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM Emp");
    while (rs.next()) {
        int sal = rs.getInt("basicsalary");
        total += sal;
%>
<pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : <%= rs.getInt("empno") %>
Emp_Name: <%= rs.getString("empname") %>
Basic : <%= sal %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
</pre>
<%
    }
    out.println("<pre>Grand Salary : " + total + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</pre>");
    rs.close(); st.close(); con.close();
} catch (Exception e) { out.println(e); }
%>
</body>
</html>
