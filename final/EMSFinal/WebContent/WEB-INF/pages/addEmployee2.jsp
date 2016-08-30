<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Jsp form to add Employee </title>
</head>
<body>
			<!-- 	<script>  
					function validateform(){  
						var name = document.getElementsByName("Name");   
  
 						if( /[^a-zA-Z0-9]/.test( name ) ) {
                   alert('Name must be alphanumeric only');
       					return false;
 						                    
  														   }  
}  
				 </script> -->
	<script type="text/javascript" src="scripts/validation.js"></script>
			<h2>Add Employee Data</h2>
  			<form name="add" method="POST" action="submitEmployee" onsubmit="return validateform()">
  			 <input type="hidden" name="action" value="submitEmployee" />
  			 
      <table>
       <tr>
          <td>Kin_id<font color="red"><sup>*</sup></font> </td>
      <td><input type="text" name="Kin_id" value="${employee.kin_id}" /></td>
       </tr>
       <tr>
           <td>Name<font color="red"><sup>*</sup></font> </td>
      <td><input type="text" name="Name" value="${employee.name}" /></td>
       </tr>
       <tr>
          <td>Email_id<font color="red"><sup>*</sup></font> </td>
      <td><input type="text" name="Email_id" value="${employee.email_id}" /></td>
       </tr>
       <tr>
           <td>Phone_no<font color="red"><sup>*</sup></font> </td>
      <td><input type="text" name="Phone_no" value="${employee.phone_no}" /></td>
       </tr>
       
       <tr>
           <td>Address<font color="red"><sup>*</sup></font> </td>
      <td><input type="text" name="Address" value="${employee.address}" /></td>
       </tr>
        <tr>
           <td>Dob<font color="red"><sup>*</sup></font> </td>
      <td><input type="text" name="Dob" value="${employee.dob}" /></td>
       </tr>
       <tr>
            <td>Doj<font color="red"><sup>*</sup></font> </td>
      <td><input type="text" name="Doj" value="${employee.doj}" /></td>
       </tr>
       <tr>
       
       
       
            <td>Department_id<font color="red"><sup>*</sup></font> </td>
          	<td>
			<select>
    		<option value=""${country.key}">${country.value}" disabled="disabled" selected="selected">Choose Department</option>
    		<option>1234</option>
    		<option>4567</option>
    		<option>7890</option>
					</select>
			</td>
       </tr>
        <tr>
        <%--  <td>Project_id<font color="red"><sup>*</sup></font> </td>
         <c:if test="${employee.department_id}==1234">
         <td>
			<select>
    		<option value="employee.project_id" disabled="disabled" selected="selected">Choose Project</option>
    		<option>4321</option>
    		<option>3321</option>
					</select>
					</td>
          </c:if>
       	<c:if test="${employee.department_id}==4567">
         <td>
			<select>
    		<option value="employee.project_id" disabled="disabled" selected="selected">Choose Project</option>
    		<option>7654</option>
    		<option>6654</option>
					</select>
					</td>
          </c:if>  
         	<c:if test="${employee.department_id}==7890">
         <td>
			<select>
    		<option value="employee.project_id" disabled="disabled" selected="selected">Choose Project</option>
    		<option>9870</option>
    		<option>1876</option>
					</select>
					</td>
          </c:if>  
           </tr>  --%>
        
        
        
       
           <td>Project_id<font color="red"><sup>*</sup></font> </td>
          <td><input type="text" name="Project_id" value="${employee.project_id}" /></td>
     	<tr>
            <td>Role_id<font color="red"><sup>*</sup></font> </td>
          	<td>
			<select>
    		<option value="${role_id}" disabled="disabled" selected="selected">Choose Department</option>
    		<option>123</option>
    		<option>456</option>
    		<option>789</option>
					</select>
			</td>
     <%--  <td><input type="text" name="Role_id" value="${employee.role_id}" /></td> --%>
       </tr>
          <tr>
         <td colspan="2"><input type="submit" value="Submit"/></td>
        <!--  <td colspan="2"><input type="submit" value="Update"/></td> -->
        </tr>
   </table> 
  </form>

</body>
</html>