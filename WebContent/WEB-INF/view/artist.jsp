<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Artist List</title>
	
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
                <a class="nav-link active" href="../artist/list">Artists</a>
                </li>
               
                <li class="nav-item">
                <a class="nav-link" href="../gear/list">Gear</a>
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
                <a class="nav-link" href="http://localhost:8880/login" target="_blank">Admin</a>
                </li>
            </ul>
            
            </div>
        </div>
    </nav>
<!-- end of nav -->


  			<div class="container">
  				
  				<div class="card bg-dark" id="artistList">
        		<div class="card-header">
            	<h2 id="white">Artists</h2>
            	<a href="addArtistForm" class="btn btn-info" role="button">Add Artist</a>
         
        		</div>
        		
  				</div>
  				
  				
  				<div class="container">
					<div class="row">
					
						<c:forEach var="tempArtist" items="${artists}">
			
			
						<!-- construct an "update" link with artist id -->
						<c:url var="updateLink" value="/artist/updateArtistForm">
							<c:param name="artistId" value="${tempArtist.id}" />
						</c:url>					
			
						<!-- construct an "delete" link with artist id -->
						<c:url var="deleteLink" value="/artist/delete">
							<c:param name="artistId" value="${tempArtist.id}" />
						</c:url>		
						
						
				
							<div class="col-sm-4 mb-3 d-flex justify-content-center" >
								<div class="card bg-dark" style="width: 24rem;">
				  					<img class="card-img-top" src="${tempArtist.photo}" alt="">
				  					<div class="card-body">
				    				<h5 class="card-title">${tempArtist.name}</h5>
				    				<p class="card-text" id="white">${tempArtist.bio}</p>
				    				<!-- display the update link -->
									<a href="${updateLink}" class="btn btn-info" role="button">Update</a>
											|
									<a href="${deleteLink}"
									   onclick="if (!(confirm('Are you sure you want to delete this artist?'))) return false" class="btn btn-danger" role="button">Delete</a>
			  						</div>
								</div>
							
							</div>
						</c:forEach>
					
					</div>
				</div>
  				
  				

  				
  			
  		
  			</div>
			
			
			








	

</body>

</html>









