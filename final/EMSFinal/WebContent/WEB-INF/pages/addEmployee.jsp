<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Spring MVC Form Handling</title>
 </head>
 <body  bgcolor="">
 			<script type="text/javascript" src="scripts/validation.js"></script>
			<h2 align="center">Add Employee Data</h2>
  			<form:form name="add" method="POST" action="submitEmployee" onsubmit="return validateform()" commandName="employee">
  			 <input type="hidden" name="action" value="submitEmployee" />
       <table align="center">
       <tr>
           <td><form:label path="Kin_id">Kin_id:</form:label></td>
           <td><form:input path="Kin_id" placeholder="5 Digits" value="${employee.kin_id}" readonly="false"/></td>
           <tr>   
       </tr>
        <tr>
           <td><form:label path="Name">Employee Name:</form:label></td>
           <td><form:input path="Name"  placeholder="AlphaNumeric" value="${employee.name}"/></td>
             <tr>
        </tr>
		      
       
       <tr>
           <td><form:label path="Email_id">Employee Email:</form:label></td>
           <td><form:input path="Email_id"  placeholder="abc@xyz.com" value="${employee.email_id}"/></td>
            <tr>
       </tr>
       <tr>
           <td><form:label path="Phone_no">Employee Mobile:</form:label></td>
           <td><form:input path="Phone_no"  placeholder="10-Digits" value="${employee.phone_no}"/></td>
            <tr>   
       </tr>
       <tr>
           <td><form:label path="address">Employee Address:</form:label></td>
                    <td><form:input path="address" value="${employee.address}"/></td>
                     <td>    
           </td>
       </tr>
        <tr>
           <td><form:label path="Dob">Employee Dob:</form:label></td>
                    <td><form:input path="Dob"  placeholder="dd-mmm-yyyy" value="${employee.dob}"/></td>
                      <tr>
       </tr>
       
         <tr>
           <td><form:label path="Doj">Employee Doj:</form:label></td>
                    <td><form:input path="Doj" placeholder="dd-mmm-yyyy" value="${employee.doj}"/></td>
                      <tr>
       </tr>
         <tr>
           <td><form:label path="Department_id">Employee Department:</form:label></td>
                    <%-- <td><form:input path="Department_id" value="${employee.department_id}"/></td> --%>
                    <td>
			<c:if test="${!empty deps }">
				<form:select path="Department_id">
					<c:forEach var="depart" items="${deps}">
						<form:option value="${depart}">${depart}</form:option>
					</c:forEach>
				
				</form:select>
			</c:if>
			 <tr>
           </td>   
                    
                    
       </tr>
       
        <tr>
           <td><form:label path="Project_id">Employee Project:</form:label></td>
                    <td><form:input path="Project_id" value="${employee.project_id}"/></td>
       </tr>
        <tr>
           <td><form:label path="Role_id">Employee role:</form:label></td>
                    <%-- <td><form:input path="Role_id" value="${employee.role_id}"/></td> --%>
                       <td>
			<c:if test="${!empty roles }">
				<form:select path="Role_id">
					<c:forEach var="rol" items="${roles}">
						<form:option value="${rol}">${rol}</form:option>
					</c:forEach>
				
				</form:select>
			</c:if>
			 <tr>    
           </td>   
       </tr>
       
          <tr>
         <td colspan="2"><input type="submit" value="Submit" align="middle"/></td>
        </tr>
   </table> 
  </form:form>
  </body>
  </html>