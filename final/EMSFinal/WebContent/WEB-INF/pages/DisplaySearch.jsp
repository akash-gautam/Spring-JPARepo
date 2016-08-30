<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1>Search Result</h1>
<h3><a href="index">Back to home</a></h3>


<c:choose>
<c:when test="${!empty emps}">
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
  	 <c:forEach items='${emps}' var='emp'>
   <tr>
    <td>"${emp.kin_id}"</td>
    <td>"${emp.name}"</td>
    <td>"${emp.email_id}"</td>
    <td>"${emp.phone_no}"</td>
    <td>"${emp.address}"</td>
    <td>"${emp.dob}"</td>
    <td>"${emp.doj}"</td>
    <td>"${emp.department_id}"</td>
    <td>"${emp.project_id}"</td>
    <td>"${emp.role_id}"</td>
     <td align="center"><a href="updateEmployee?id=${emp.kin_id}">Edit</a>
     | <a href="deleteEmployee?id=${emp.kin_id}">Delete</a></td>
    </c:forEach>
 </table>
</c:when>
<c:when test="${!empty emp}">
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
   <tr>
    <td>"${emp.kin_id}"</td>
    <td>"${emp.name}"</td>
    <td>"${emp.email_id}"</td>
    <td>"${emp.phone_no}"</td>
    <td>"${emp.address}"</td>
    <td>"${emp.dob}"</td>
    <td>"${emp.doj}"</td>
    <td>"${emp.department_id}"</td>
    <td>"${emp.project_id}"</td>
    <td>"${emp.role_id}"</td>
     <td align="center"><a href="updateEmployee?id=${emp.kin_id}">Edit</a>
     | <a href="deleteEmployee?id=${emp.kin_id}">Delete</a></td>
 </table>
</c:when>

    <c:otherwise>
        <h1> SORRY NO RECORD FOUND </h1>
        <br />
    </c:otherwise>
</c:choose>











</body>
</html>