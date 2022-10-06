<%@page import="com.softwareacademy.dto.Subject"%>
<%@page import="java.util.List"%>
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
</style>

</head>
<body>
<div class="topnav">
		<ul>
			  <li><a href="addsubject.jsp">ADD SUBJECT</a></li>
			  <li><a href="updatesubject.jsp">UPDATE SUBJECT</a></li>
			  <li><a href="deletesubject.jsp">DELETE SUBJECT</a></li>
		  	  <li><a href="searchsubject.jsp">SEARCH SUBJECT</a><li>
			  <li><a class="active" href="subject.jsp">SHOW SUBJECT</a></li>
			  <li><a href=index.jsp>INDEX PAGE</a></li>

		</ul>
</div>
	
	<div align="center">
<table border=1>
	<tr>
		<th>ID</th>
		<th>NAME</th>
	</tr>
	<%
		//Classes classes=(Classes) request.getAttribute("classes");
		//out.println(classes);
		List<Subject> allSubject=(List<Subject>)request.getAttribute("allSubject");
		for(Subject sub : allSubject)
		{
			out.println("<tr><td>"+sub.getSubjectId()+"</td><td>"+sub.getSubjectName()+"</td></tr>");
		}
	%>
</table>
</div>
 	<!--  <form action="ServletAddClasses" method="post">  
        <div class="container">   
        	 <label>Class Id : </label>   <br>
            <input type="text" placeholder="Enter Id" name="classid" required><br>  
           
            <label>Class Name : </label>   <br>
            <input type="text" placeholder="Enter Name" name="classname" required><br>  
            <button type="submit">Add Class</button>        
        </div>   
    </form>   -->
	    
</body>
</html>