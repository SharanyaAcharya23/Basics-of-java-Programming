<%@ page import="java.sql.*" %>
<html>
<head><title>Insert Employee</title></head>
<body>
<h2>Enter Employee Details</h2>
<form method="post" action="insertEmp.jsp">
    Emp No: <input type="number" name="empno" required><br/>
    Name: <input type="text" name="empname" required><br/>
    Basic Salary: <input type="number" name="salary" required><br/>
    <input type="submit" value="Add Employee">
</form>

<%
String empno = request.getParameter("empno");
String empname = request.getParameter("empname");
String salary = request.getParameter("salary");

if (empno != null && empname != null && salary != null) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");
        PreparedStatement ps = con.prepareStatement("INSERT INTO Emp VALUES (?, ?, ?)");
        ps.setInt(1, Integer.parseInt(empno));
        ps.setString(2, empname);
        ps.setInt(3, Integer.parseInt(salary));
        ps.executeUpdate();
        out.println("<p style='color:green;'>Employee added!</p>");
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    }
}
%>

<h3>Salary Report</h3>
<pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
int total = 0;
try {
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM Emp");
    while (rs.next()) {
        int empNo = rs.getInt("empno");
        String empName = rs.getString("empname");
        int basic = rs.getInt("basicsalary");
        total += basic;
%>
Emp_No   : <%= empNo %>
Emp_Name : <%= empName %>
Basic    : <%= basic %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
    }
    rs.close(); st.close(); con.close();
} catch (Exception e) { out.println("Error: " + e.getMessage()); }
%>
Grand Salary : <%= total %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
</pre>
</body>
</html>
