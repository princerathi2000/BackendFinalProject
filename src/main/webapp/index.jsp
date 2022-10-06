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
  float:   left  ;
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
</style>

</head>
<body>
<div class="topnav">
		<ul>
			<li><a href="ServletGetAllClasses">CLASSESS</a> </li>
			<li><a href="ServletGetAllSubject">SUBJECTS</a></li>
			<li><a href="ServletGetAllTeacher">TEACHERS</a></li>
			<li><a href="ServletGetAllStudent">STUDENT</a></li>
			<li><a href="ServletGetAllAssign">ASSIGN</a></li>
		</ul>
	</div>
	
<div align="center">
		<h2>WELCOME TO LEARNERS ACADEMY</h2>
		<%
			//String msg=(String)request.getAttribute("msg");
			//if(msg!=null)
			//{
			//	out.println(msg);
			//}
		%>
</div>

</body>
</html>