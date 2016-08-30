<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Display All The Employees </title>
</head>
<body>

<h1>List Employees</h1>
<h3><a href="index">Back to home</a></h3>

<c:if test="${!empty employees}">
 <table align="left" border="1">
  <tr>
   <th>Employee ID</th>
   <th>Employee Name</th>
   <th>Employee Email</th>
   <th>Employee Phone</th>
   <th>Employee Address</th>
   <th>Employee DOB</th>
   <th>Employee DOJ</th>
   <th>Employee Department</th>
   <th>Employee project</th>
   <th>Employee role</th>
  </tr>

  <c:forEach items='${employees}' var='employee'>
   <tr>
    <td>"${employee.kin_id}"</td>
    <td>"${employee.name}"</td>
    <td>"${employee.email_id}"</td>
    <td>"${employee.phone_no}"</td>
    <td>"${employee.address}"</td>
    <td>"${employee.dob}"</td>
    <td>"${employee.doj}"</td>
    <td>"${employee.department_id}"</td>
    <td>"${employee.project_id}"</td>
    <td>"${employee.role_id}"</td>
    <td align="center"><a href="updateEmployee?id=${employee.kin_id}">Edit</a>
     | <a href="deleteEmployee?id=${employee.kin_id}">Delete</a></td>
   </tr>
  </c:forEach>
 </table>
</c:if>
</body>
</html>