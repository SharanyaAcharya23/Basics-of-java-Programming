<%@ page import="java.sql.*" %>
<%
    // Check if form is submitted
    String method = request.getMethod();
    boolean inserted = false;

    if ("POST".equalsIgnoreCase(method)) {
        String empnoStr = request.getParameter("empno");
        String empname = request.getParameter("empname");
        String basicsalaryStr = request.getParameter("basicsalary");

        if (empnoStr != null && empname != null && basicsalaryStr != null) {
            int empno = Integer.parseInt(empnoStr);
            double basicsalary = Double.parseDouble(basicsalaryStr);

            Connection con = null;
            PreparedStatement pstmt = null;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");

                String insertQuery = "INSERT INTO Emp (empno, empname, basicsalary) VALUES (?, ?, ?)";
                pstmt = con.prepareStatement(insertQuery);
                pstmt.setInt(1, empno);
                pstmt.setString(2, empname);
                pstmt.setDouble(3, basicsalary);

                int rows = pstmt.executeUpdate();
                inserted = (rows > 0);
            } catch (Exception e) {
                out.println("Error while inserting: " + e.getMessage());
            } finally {
                try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
                try { if (con != null) con.close(); } catch (Exception e) {}
            }
        }
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert Employee</title>
</head>
<body>
    <h2>Insert Employee Record</h2>
    <form method="post" action="insertEmp.jsp">
        Emp No: <input type="number" name="empno" required><br><br>
        Emp Name: <input type="text" name="empname" required><br><br>
        Basic Salary: <input type="number" step="0.01" name="basicsalary" required><br><br>
        <input type="submit" value="Add Employee">
    </form>

    <%
        if (inserted) {
            out.println("<p style='color:green;'>Employee record inserted successfully!</p>");
        }
    %>

    <hr>
    <h2>Employee Report</h2>
    <%
        // Display all employees
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Emp");
    %>
    <table border="1" cellpadding="8">
        <tr>
            <th>Emp No</th>
            <th>Emp Name</th>
            <th>Basic Salary</th>
        </tr>
        <%
            while (rs.next()) {
        %>
        <tr>
            <td><%= rs.getInt("empno") %></td>
            <td><%= rs.getString("empname") %></td>
            <td><%= rs.getDouble("basicsalary") %></td>
        </tr>
        <%
            }
        %>
    </table>
    <%
        } catch (Exception e) {
            out.println("Error while fetching data: " + e.getMessage());
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (con != null) con.close(); } catch (Exception e) {}
        }
    %>
</body>
</html>
