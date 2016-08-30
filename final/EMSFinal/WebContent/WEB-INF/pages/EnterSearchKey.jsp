<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Search Details</title>
</head>
<body>
			<h2 align="center">Search an Employee Data</h2>
  			<form method="GET" action="searchEmployee?id=${id}?name=${name}?email_id=${email_id}">
  			 <input type="hidden" name="action" value="searchEmployee"/>

		<table align="center">
       <tr>
          <td>Employee Kin_id: </td>
      	  <td><input type="text" name="id" value=""/></td>
       </tr>
       <tr>
          <td>Employee Name:</td>
      	  <td><input type="text" name="name" value="" /></td>
       </tr>
       <tr>
          <td>Employee Email</td>
      	  <td><input type="text" name="email_id" value=""/></td>
       </tr>
       <tr>
         <td colspan="2"><input align="middle" type="submit" value="Search"/></td>
        </tr>
       </table>

</form>

</body>
</html>