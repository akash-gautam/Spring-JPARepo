<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript" src="scripts/validation.js"></script>
			<h2 align="center"> Update Employee Data </h2>
  			<form:form name="add" method="POST" action="updateEmployeeData?id=${id}" onsubmit="return validateform()" commandName="employee">
  			 <input type="hidden" name="action" value="updateEmployeeData?id=${id}"/>
       <table align="center">
       <tr>
           <td><form:label path="Kin_id">Kin_id:</form:label></td>
           <td><form:input path="Kin_id" placeholder="${emp.kin_id}" value="${emp.kin_id}" readonly="true"/></td>
           <tr>   
       </tr>
        <tr>
           <td><form:label path="Name">Employee Name:</form:label></td>
           <td><form:input path="Name" placeholder="${emp.name}" value="${employee.name}"/></td>
        </tr>
      
       
       <tr>
           <td><form:label path="Email_id">Employee Email:</form:label></td>
           <td><form:input path="Email_id" placeholder="${emp.email_id}" value="${employee.email_id}"/></td>
       </tr>
       <tr>
           <td><form:label path="Phone_no">Employee Mobile:</form:label></td>
           <td><form:input path="Phone_no" placeholder="${emp.phone_no}" value="${employee.phone_no}"/></td>
       </tr>
       <tr>
           <td><form:label path="address">Employee Address:</form:label></td>
                    <td><form:input path="address" placeholder="${emp.address}" value="${employee.address}"/></td>
       </tr>
        <tr>
           <td><form:label path="Dob">Employee Dob:</form:label></td>
                    <td><form:input path="Dob"  placeholder="${emp.dob}" value="${employee.dob}"/></td>
       </tr>
       
         <tr>
           <td><form:label path="Doj">Employee Doj:</form:label></td>
                    <td><form:input path="Doj" placeholder="${emp.doj}" value="${employee.doj}"/></td>
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
			</td>
                    
                    
                    
       </tr>
       
        <tr>
           <td><form:label path="Project_id">Employee Project:</form:label></td>
                    <td><form:input path="Project_id" placeholder="${emp.project_id}" value="${employee.project_id}"/></td>
       </tr>
        <tr>
           <td><form:label path="Role_id">Employee role:</form:label></td>
                       <td>
			<c:if test="${!empty roles }">
				<form:select path="Role_id">
					<c:forEach var="rol" items="${roles}">
						<form:option value="${rol}">${rol}</form:option>
					</c:forEach>
				
				</form:select>
			</c:if>
			</td>   
       </tr>
       
          <tr>
         <td colspan="2"><input type="submit" align="middle" value="UPDATE"/></td>
        </tr>
   </table> 
  </form:form>
</body>
</html>