<%@ page import="java.sql.*" %>
<html>
<head><title>Insert Employee</title></head>
<body>
<h2>Add Employee</h2>
<form method="post" action="insertEmp.jsp">
    Emp No: <input type="number" name="empno" required><br/>
    Name: <input type="text" name="empname" required><br/>
    Basic Salary: <input type="number" name="basicsalary" required><br/>
    <input type="submit" value="Insert">
</form>

<%
String empno = request.getParameter("empno");
String empname = request.getParameter("empname");
String basicsalary = request.getParameter("basicsalary");

if (empno != null && empname != null && basicsalary != null) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");
        PreparedStatement ps = con.prepareStatement("INSERT INTO Emp(empno, empname, basicsalary) VALUES (?, ?, ?)");
        ps.setInt(1, Integer.parseInt(empno));
        ps.setString(2, empname);
        ps.setInt(3, Integer.parseInt(basicsalary));
        ps.executeUpdate();
        ps.close();
        con.close();
        out.println("<p style='color:green;'>Inserted successfully!</p>");
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    }
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
