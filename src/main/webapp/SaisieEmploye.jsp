<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
<%@include  file="navbar.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Titel</title>
<!-- Links -->
<%@include file="links.jsp" %>

<!-- style -->
<link rel="stylesheet" type="text/css" href="css/style.css">

</head>

<body>



  <div class="container-sm text-center  " >

    <div class="row align-items-center m-5 ">
  
       <div class="col-12 align-items-center ">
 

         
			<form action="TritementEmploye"  method="post" class="needs-validation" novalidate>
					
				<h4 class="mb-3 h4 p-2">ajouter un employeur </h4>
				
					<div class="input-group mb-3">  
					  <input
					    type="text"
					    id="nameEmp"
					    name="nameEmp"
					    class="form-control rounded"
					    placeholder="Nom"
					    aria-label="Nom"
					    aria-describedby="basic-addon1"
					    required
					  />
					  <div class="valid-feedback"></div>
					</div>
	
					<div class="input-group mb-3">
					  <input 
					    type="text"
					    id="ageEmp"
					    name="ageEmp"
					    class="form-control rounded"
					    placeholder="Age"
					    aria-label="Age"
					    aria-describedby="basic-addon1"
					    required
					  />
					 <div class="valid-feedback"></div>
					</div>
					
					
					<div class="input-group mb-3">
					  <input
					    type="text"
					    id="jobEmp"
					    name="jobEmp"
					    class="form-control rounded"
					    placeholder="Fonction"
					    aria-label="Fonction"
					    aria-describedby="basic-addon1"
					    required
					  />
					  <div class="valid-feedback"></div>
					</div>
					
					
					<div class="input-group mb-3">
					
					  <input
					    type="text"
					    id="salEmp"
					    name="salEmp"
					    class="form-control rounded"
					    placeholder="Salaire"
					    aria-label="Salaire"
					    aria-describedby="basic-addon1"
					    required
					  />
					   
                       <div class="invalid-feedback"></div>
					  
					</div>
					  
					  
					 <div class="input-group mb-3">
					   <select class="select form-control rounded"  id="service" name="service" required>
					      <option value="ACCOUNTING">ACCOUNTING</option>
					      <option value="RESEARCH">RESEARCH</option>
					      <option value="SALES">SALES</option>
					      <option value="OPERATIONS">OPERATIONS</option>
					  </select>
					   <div class="valid-feedback"></div>
					</div>


					  <input type="submit" class="btn btn-primary" id="sub" value="Envoyer"><br>
					  
				  </form>
				  
             </div>
         </div>
    </div>

 </body>





<!-- javaScript -->
<script type="text/javascript" src="js/formValidation.js" ></script>

</html>