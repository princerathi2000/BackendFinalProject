<%@page import="com.softwareacademy.dto.AssignTeacher"%>
<%@page import="com.softwareacademy.dto.AssignStudent"%>
<%@page import="java.util.List"%>
<%@page import="com.softwareacademy.dto.Classes"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
	li {
  display: inline;
  float: left;
}


li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
    border-right: 1px solid #bbb;

}

li:last-child {
  border-right: none;
}

/* Change the link color to #111 (black) on hover */
li a:hover {
  background-color: #111;
}

ul{
list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: gray;
  }
  
  .active {
  background-color: #04AA6D;
}

	.div-center-1{
		    float:left;
		    padding-left:100px;
		}
		
	.div-center-2{
		    float:right;
		    padding-right:100px;
		}	
</style>

</head>
<body>
<div class="topnav">
		<ul>
		  <li><a href="ServletGetAllAssignTeacher">ASSIGN TECHER</a><li>
		  <li><a href="ServletGetAllAssignStudent">ASSIGN STUDENT</a><li>
		  <li><a href=index.jsp>INDEX PAGE</a><li>
		</ul>
</div>

<div>
		<div class="div-center-1">
			<table border=1>
				STUDENT
				<tr>
					<th>ID</th>
					<th>STUDENT</th>
					<th>SUBJECT</th>
				</tr>
					
			
				<%
					//AssignStudent assignStudent=(AssignStudent) request.getAttribute("allstudent");
					//out.println(assignStudent);
					
					List<AssignStudent> assStudent=(List<AssignStudent>)request.getAttribute("allStudent");
					for(AssignStudent std : assStudent)
					{
						out.println("<tr><td>"+std.getAssignStudentId()+"</td><td>"+std.getStudentId()+"</td><td>"+std.getSubjectId()+"</td></tr>");
					}
				%> 
				
			</table>
		</div>
		
		<div class="div-center-2">
			<table border=1>
				TEACHER
				<tr>
					<th>ID</th>
					<th>STUDENT</th>
					<th>SUBJECT</th>
				</tr>
					
			
				<%
					//AssignStudent assignStudent=(AssignStudent) request.getAttribute("allstudent");
					//out.println(assignStudent);
					
					List<AssignTeacher> assTeacher=(List<AssignTeacher>)request.getAttribute("allTeacher");
					for(AssignTeacher teacher : assTeacher)
					{
						out.println("<tr><td>"+teacher.getAssignTeacherId()+"</td><td>"+teacher.getAssignTeacherName()+"</td><td>"+teacher.getStudentName()+"</td><td>"+teacher.getSubjectName()+"</td></tr>");
					}
				%> 
				
			</table>
		</div>
</div>
	    
</body>
</html>