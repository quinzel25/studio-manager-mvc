<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>About</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <link rel="stylesheet" href="../Styles/index.css">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/index.css" />
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="../underground-pine/home">Underground Pine Studios</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
                <li class="nav-item">
                <a class="nav-link " aria-current="page" href="../underground-pine/home">Home</a>
                </li>
               
                <li class="nav-item">
                <a class="nav-link" href="../artist/list">Artists</a>
                </li>
               
                <li class="nav-item">
                <a class="nav-link" href="../gear/list">Gear</a>
                </li>
                
                
                
                <li class="nav-item">
                <a class="nav-link active" href="../employee/about">About</a>
                </li>
                
                 <li class="nav-item">
                <a class="nav-link" href="../contact/addContactForm">Contact</a>
                </li>

            </ul>
            
            <ul class="navbar-nav ms-auto">
   
                 <li class="nav-item">
                <a class="nav-link" href="http://localhost:8880/login" target="_blank">Admin</a>
                </li>
            </ul>
            
            </div>
        </div>
    </nav>
<!-- end of nav -->

   <div class="card bg-dark" id="gearList">
        <div class="card-header">
            <h2 id="white">Studio Employees</h2>
           
        </div>
        <div class="card-body">

            <table class="table table-hover table-dark">
                <thead>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Email</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="tempEmployee" items="${employees}">
				
						<tr>
							<td> ${tempEmployee.firstName} </td>
							<td> ${tempEmployee.lastName} </td>
							<td> ${tempEmployee.email} </td>
						</tr>
				
					</c:forEach>
                </tbody>
            </table>    
        </div>
    </div>
		
		

    <div class="col-sm-6" id="about" style="float:none;margin:auto;" id="gearList">
        <div class="card bg-dark">
        <img class="card-img" src="${pageContext.request.contextPath}/resources/Images/kiwis.jpg" alt="Card image cap">
            <div class="card-body">
                <h5 class="card-title">About</h5>
                <p id="white" class="card-text">Underground Pine Studios was created by a group of friends that just liked making music for fun.
                    They wanted to get their music out there for people to hear it but frankly, they were all broke as shit. 
                    Studio time was just not going to happened. So they decided to start learning about audio production. 
                    They slowly grew their gear and knowledge to what it is today. Keep rocking and stay humble.  </p>
               
            </div>
        </div>
    </div>
    
    
    
       
    
    
    
</body>
</html>