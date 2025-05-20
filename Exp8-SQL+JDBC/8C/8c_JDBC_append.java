/*
Develop a JDBC project using JSP to append the fields empno, empname and basicsalary
into the table Emp of the database Employee by getting the fields through keyboard and
Generate the report as follows for the TABLE Emp (Emp_NO , Emp_Name, Basicsalary ) using
HTML and JSP to get the fields and display the results respectively
*/

NOTE :- Both 8c_JDBC_append.java and 8d_JDBC_Update.java are interconnected.
    
---------------------------------------------------------------------------------------------------
index.jsp
---------------------------------------------------------------------------------------------------

<%@ page import="java.sql.*" %>

<html>
<head>
    <title>Update Employee</title>
</head>
<body>

<%
String empnoStr = request.getParameter("empno");
String empname = request.getParameter("empname");
String basicsalaryStr = request.getParameter("basicsalary");

if (empnoStr != null && empname != null && basicsalaryStr != null) {
    try {
        int empno = Integer.parseInt(empnoStr);
        int basicsalary = Integer.parseInt(basicsalaryStr);

        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Employee", "root", "");
             PreparedStatement ps = conn.prepareStatement("UPDATE Emp SET Emp_Name = ?, Basicsalary = ? WHERE Emp_NO = ?")) {

            ps.setString(1, empname);
            ps.setInt(2, basicsalary);
            ps.setInt(3, empno);

            int updated = ps.executeUpdate();
            if (updated > 0) {
                out.println("<h3>Record updated successfully!</h3>");
            } else {
                out.println("<h3>No record found with Emp_No " + empno + ".</h3>");
            }
        }
    } catch (Exception e) {
        out.println("<h3 style='color:red;'>Error: " + e.getMessage() + "</h3>");
    }
}
%>

<h2>Update Employee Details</h2>
<form method="post">
    Emp No: <input type="text" name="empno" required><br><br>
    New Name: <input type="text" name="empname" required><br><br>
    New Basic Salary: <input type="text" name="basicsalary" required><br><br>
    <input type="submit" value="Update">
</form>

<%-- 
    MySQL setup commands (for reference only, not rendered on the webpage):

    CREATE DATABASE IF NOT EXISTS Employee;
    USE Employee;
    CREATE TABLE IF NOT EXISTS Emp (
        Emp_NO INTEGER PRIMARY KEY,
        Emp_Name TEXT NOT NULL,
        Basicsalary INTEGER
    );
--%>

</body>
</html>

--------------------------------------------------------------------------------------------------
insert_emp.jsp
--------------------------------------------------------------------------------------------------

<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>

<html>
<head><title>Insert Employee</title></head>
<body>

<%
String empnoStr = request.getParameter("empno");
String empname = request.getParameter("empname");
String basicsalaryStr = request.getParameter("basicsalary");

if (empnoStr != null && empname != null && basicsalaryStr != null) {
    int empno = Integer.parseInt(empnoStr);
    int basicsalary = Integer.parseInt(basicsalaryStr);

    Connection conn = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/Employee", "root", "");
        String sql = "INSERT INTO Emp (Emp_NO, Emp_Name, Basicsalary) VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, empno);
        ps.setString(2, empname);
        ps.setInt(3, basicsalary);
        ps.executeUpdate();
        out.println("<h3>Record inserted successfully!</h3>");
        ps.close();
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        if (conn != null) conn.close();
    }
}
%>

<h2>Enter Employee Details</h2>
<form method="post">
    Emp No: <input type="text" name="empno" required><br>
    Name: <input type="text" name="empname" required><br>
    Basic Salary: <input type="text" name="basicsalary" required><br>
    <input type="submit" value="Insert">
</form>

</body>
</html>
