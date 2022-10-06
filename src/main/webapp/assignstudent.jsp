<%@page import="com.softwareacademy.dto.Subject"%>
<%@page import="com.softwareacademy.dto.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<style>
		/*Styling for navigation bar*/
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
        /* Styling the Body element i.e. Color,
        Font, Alignment */
        body {
            background-color: #05c46b;
            font-family: Verdana;
            text-align: center;
        }
 
        /* Styling the Form (Color, Padding, Shadow) */
        form {
            background-color: #fff;
            max-width: 500px;
            margin: 50px auto;
            padding: 30px 20px;
            box-shadow: 2px 5px 10px rgba(0, 0, 0, 0.5);
        }
 
        /* Styling form-control Class */
        .form-control {
            text-align: left;
            margin-bottom: 25px;
        }
 
        /* Styling form-control Label */
        .form-control label {
            display: block;
            margin-bottom: 10px;
        }
 
        /* Styling form-control input,
        select, textarea */
        .form-control input,
        .form-control select,
        .form-control textarea {
            border: 1px solid #777;
            border-radius: 2px;
            font-family: inherit;
            padding: 10px;
            display: block;
            width: 95%;
        }
 
        /* Styling form-control Radio
        button and Checkbox */
        .form-control input[type="radio"],
        .form-control input[type="checkbox"] {
            display: inline-block;
            width: auto;
        }
 
        /* Styling Button */
        button {
            background-color: #05c46b;
            border: 1px solid #777;
            border-radius: 2px;
            font-family: inherit;
            font-size: 21px;
            display: block;
            width: 100%;
            margin-top: 50px;
            margin-bottom: 20px;
        }
        .div-left{
		    float:left;
		    padding-left:10px;
		}
		.div-left-2{
		    float:left;
		    padding-left:70px;
		}
		.div-right{
		    float:none;
		    padding-right:10px;
		}
    </style>
</head>

<body>
  	<div class="topnav">
		<ul>
		  <li><a href="assignteacher.jsp">ASSIGN TECHER</a><li>
						  <li><a href="ServletGetAllAssign">SHOW STUDENT</a><li>
		  <li><a href=index.jsp>INDEX PAGE</a><li>
		</ul>
	</div>

 <h1>ASSIGN STUDENT</h1>
<div >  
  
  <div class="div-left">
  STUDENT
		<table border=1>
			<tr>
				<th>ID</th>
				<th>NAME</th>
			</tr>
				
		
			<%
				//Classes classes=(Classes) request.getAttribute("classes");
				//out.println(classes);
				
				List<Student> allStudent=(List<Student>)request.getAttribute("allStudent");
				for(Student std : allStudent)
				{
					out.println("<tr><td>"+std.getStudentId()+"</td><td>"+std.getStudentName()+"</td></tr>");
				}
			%>
		</table>
		

	</div>	
	<div class="div-left-2">
		  SUBJECT
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
	<div class="div-right">	
	    <!-- Create Form -->
	    <form id="form" action="ServletAddAsignStudent" method="post">
	 
	        <!-- Details -->
	        <div class="form-control">
	            <label>Student Name : </label>   <br>
	            <input type="text" id="name" placeholder="Enter Student Name" name="studentid" required><br>
	 
	        </div>
	  
	        <div class="form-control">
	            <label>Subject Name : </label>   <br>
	            <input type="text" id="name" placeholder="Enter Subject Name" name="classname" required><br>  
		   </div>
  
  		<%
			String msg=(String)request.getAttribute("msg");
			if(msg!=null)
			{
				out.println(msg);
			}
		%>
          
        <!-- Multi-line Text Input Control -->
        <button type="submit" value="submit">
            ASSIGN STUDENT
        </button>
    	</form>
    </div>
</div>


<!--   <div align="center">
	<form action="ServletAddClasses" method="post">  
         
			<label>Class Id : </label>   <br>
            <input type="text" placeholder="Enter Id" name="classid" required><br>  
           
            <label>Class Name : </label>   <br>
            <input type="text" placeholder="Enter Name" name="classname" required><br>  
            <button type="submit">Add Class</button>                	 
    </form>
</div>  -->

</body>
</html>

