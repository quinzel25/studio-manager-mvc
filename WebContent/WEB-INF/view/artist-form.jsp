<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>Save Gear</title>

	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/index.css">
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

		
		  <div class="card bg-dark" id="priceForm">
        <div class="card-header">
            <h2 id="white">New Artist</h2>
            
  
            
        </div>
        <div class="card-body">
            <form:form action="saveArtist" modelAttribute="artist" method="POST" id="white">
                <div class="box-body">
                    <form:hidden path="id" />
                    
                    
                    <div class="form-group">
                    
                    
                    
                    <label for="name" >Name</label>
                    <form:input path="name" cssClass="form-control" placeholder="Project Name..."/>
                    </div>
                    
                    <div class="form-group">
                    <label for="email">Email</label>
                    <form:input path="email" cssClass="form-control" placeholder="Email..." type="email"/>
                    </div>
                    
                    <div class="form-group">
                    <label for="bio">Bio</label>
                    <form:input path="bio" cssClass="form-control" placeholder="Who are you?..." />
                    </div>
                    
                     <div class="form-group">
                    <label for="">Image</label>
                    <form:input path="photo" cssClass="form-control" placeholder="Enter wiki link..." />
                    </div>
                    
                    
                </div>
  


                <button type="submit" value="Save" class="btn btn-primary">Save</button>
                
                </form:form>
		
		 </div>
	
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/artist/list" class="btn-btn-info" role="button">Back to List</a>
		</p>
	
	</div>

</body>

</html>










