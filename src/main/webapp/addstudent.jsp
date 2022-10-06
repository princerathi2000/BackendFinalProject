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
    </style>
</head>

<body>
  	<div class="topnav">
		<ul>
		  <li><a class="active" href="addstudent.jsp">ADD STUDENT</a><li>
		  <li><a href="updatestudent.jsp">UPDATE STUDENT</a><li>
		  <li><a href="deletestudent.jsp">DELETE STUDENT</a><li>
		  <li><a href="ServletGetAllStudent">SEARCH STUDENT</a><li>
		  <li><a href="ServletGetAllStudent">SHOW STUDENT</a><li>
		  <li><a href=index.jsp>BACK</a><li>
		</ul>
	</div>

 <h1>ADD STUDENT</h1>
  
  
    <!-- Create Form -->
    <form id="form" action="ServletAddStudent" method="post">
 
        <!-- Details -->
        <div class="form-control">
            <label>STUDENT ID : </label>   <br>
            <input type="text" id="name" placeholder="Enter Id" name="studentid" required><br>
 
        </div>
  
        <div class="form-control">
            <label>STUDENT NAME : </label>   <br>
            <!-- Input Type Text -->
            <input type="text" id="name" placeholder="Enter Name" name="studentname" required><br>  
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
            ADD STUDENT
        </button>
    </form>



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

