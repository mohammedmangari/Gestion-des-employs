<%@page import="med.model.*" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="navbar.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- links -->
<%@include file="links.jsp" %>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body class="bg-info">

		<%
		
		   ListEmployes Lemp = (ListEmployes) request.getAttribute("md");
		   ListServices ls  =(ListServices) request.getAttribute("ls");
		   String a="";
		   int i = 0;
		%>



<div class="container m-5">
		
		<h2 class="mb-3 h2 p-2">liste des employés</h2>

		<table class="table align-middle mb-0 bg-white">
			  
			<thead class="bg-light">
			    <tr>
			      <th scope="col">#</th>
			      <th scope="col">Name</th>
			      <th scope="col">Age</th>
			      <th scope="col">Fonction</th>
			      <th scope="col">Saliare</th>
			      <th scope="col">Service</th>
			    </tr>
			</thead>
		  
		    <tbody>
		  
			   <%
			 if(Lemp != null && ls != null){
			   for(Employe e: Lemp.getEmployes()){ 
				   i++;
			 %>
		 
			    <tr>
			      <th scope="row"><%=i %></th>
			      <td><%=e.getName() %></td>
			      <td><%=e.getAGE() %></td>
			      <td><%=e.getJOB() %></td>
			      <td><%=e.getSalaire() %></td>
		 
				    <%
				     for(Service sr : ls.getServices() ){
				      if(sr.getIdDept() == e.getRefdept()){
				   %>
		     	<td>
		  			 <%=sr.getSerNAme() %>
		   		</td>
		   
		   <%
		     }
				      
          }
	  %>
		 
		 </tr>
		 
		
		  <%
		     }
				      
          }
	  %>
		 
			  </tbody>
			  
		</table>
	 </div>

 </body>
</html>