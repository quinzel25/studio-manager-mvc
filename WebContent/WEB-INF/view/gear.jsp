<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Gear List</title>
	
	<!-- reference our style sheet -->

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    
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
                <a class="nav-link" aria-current="page" href="../underground-pine/home">Home</a>
                </li>
               
                <li class="nav-item">
                <a class="nav-link" href="../artist/list">Artists</a>
                </li>
               
                <li class="nav-item">
                <a class="nav-link active" href="../gear/list">Gear</a>
                </li>
                
                
                
                <li class="nav-item">
                <a class="nav-link" href="../employee/about">About</a>
                </li>
                
                 <li class="nav-item">
                <a class="nav-link" href="../contact/addContactForm">Contact</a>
                </li>

	  		
            </ul>
            
            <ul class="navbar-nav ms-auto">
            	<li class="nav-item">
                <a class="nav-link" href="http://localhost:8081/spring-crm-rest/api/gears" target="_blank">B2B</a>
                </li>
                
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
            <h2 id="white">Gear</h2>
            <a href="addGearForm" class="btn btn-info" role="button">Add Gear</a>
            <!-- add search -->
        </div>
        <div class="card-body">

            <table class="table table-hover table-dark">
                <thead>
                    <tr>
                        <th>Model</th>
                        <th>Manufacturer</th>
                        <th>Type</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="tempGear" items="${gears}">
					
					<!-- construct an "update" link with customer id -->
						<c:url var="updateLink" value="/gear/updateGearForm">
							<c:param name="gearId" value="${tempGear.id}" />
						</c:url>					
	
						<!-- construct an "delete" link with customer id -->
						<c:url var="deleteLink" value="/gear/delete">
							<c:param name="gearId" value="${tempGear.id}" />
						</c:url>		
						
						<tr>
							<td> ${tempGear.name} </td>
							<td> ${tempGear.manufacturer} </td>
							<td> ${tempGear.type} </td>
							
							<td>
							<!-- display the update link -->
							<a href="${updateLink}" class="btn btn-info" role="button">Update</a>
							|
							<a href="${deleteLink}"
							   onclick="if (!(confirm('Are you sure you want to delete this piece of gear?'))) return false" class="btn btn-danger" role="button">Delete</a>
						</td>
							
						</tr>
					
				</c:forEach>
                </tbody>
            </table>    



        </div>
    </div>









	

</body>

</html>









