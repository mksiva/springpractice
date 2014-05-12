<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="shortcut icon" href="../../assets/ico/favicon.ico">

<title>Signin Template for Bootstrap</title>

<!-- Bootstrap core CSS -->
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
	rel="stylesheet">
<!-- 
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script> -->

<script
	src="${pageContext.request.contextPath}/resources/js/jquery-1.10.2.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/jquery-ui-1.10.4.js"></script>


<!-- Custom styles for this template -->
<link href="${pageContext.request.contextPath}/resources/css/signin.css"
	rel="stylesheet">

<link
	href="${pageContext.request.contextPath}/resources/css/jquery-ui-1.10.4.css"
	rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy this line! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<script type="text/javascript">

    $(function() {
		
		$("#callDevice").click(function() {				
			  $.ajax({ type:"GET", 
				  url: "http://localhost:9090/storebackend/rest/device/status/DEV333",
				  context: document.body, success: function(data){					  	               
		              $("#deviceData").val(data.deviceInfo);
			  }});
			});
		$("#login").click(function() {
			$.post("http://localhost:9090/storebackend/rest/loginme",
					  {
					    username: $("#username").val(),
					    password: $("#pwd").val()
					  },
					  function(data,status){
						  $("#deviceData").val(data);
					    //alert("Data: " + data + "\nStatus: " + status);
					  });
			 /*
			$.ajax({ type:"GET", 
				  url: "http://localhost:9090/storebackend/rest/login/"+ $("#username").val() + "/" + $("#pwd").val(),				  
				  context: document.body, success: function(data){					  	               
		              $("#deviceData").val(data);
			  }});*/	
		});	

		//var Modules = {"module_id":"Sales", "name_lang_key":"Sales Module", "desc_lang_key":"Sales Desc", "sort":"20",  };
		//var jsonData = JSON.parse( Modules );   
		
		var Modules = {"modules":{"module_id":"Sales", "name_lang_key":"Sales Module", "desc_lang_key":"Sales Desc", "sort":"20" }} ;
				
		$("#addModuleBtn").click(function() {

			// will pass the form date using the jQuery serialize function
			$.post('http://localhost:9090/storebackend/rest/putModule', 
				{
					module_id:$("#module_id").val(), 
                	name_lang_key:$("#name_lang_key").val(), 
                	desc_lang_key:$("#desc_lang_key").val(), 
                	sort:$("#sort").val()
				}
                	, function(response) {
				alert(response);
			});
/*
			
			 $.ajax({ 
	                url:"http://localhost:9090/storebackend/rest/addModule",    
	                type:"POST", 
	                data: {	                	
	                	module_id:$("#module_id").val(), 
		                	name_lang_key:$("#name_lang_key").val(), 
		                	desc_lang_key:$("#desc_lang_key").val(), 
		                	sort:$("#sort").val()
		                }, //Stringified Json Object
	                //async: false,    //Cross-domain requests and dataType: "jsonp" requests do not support synchronous operation
	               // cache: false,    //This will force requested pages not to be cached by the browser          
	               // processData:false, //To avoid making query String instead of JSON
	                success: function(resposeJsonObject){  
	                	 $("#deviceData").val(resposeJsonObject);
					      alert("module Data: " + resposeJsonObject);           
	        }}); */
	        
		
		});	

		
			
		
		/*
			$.post("http://localhost:9090/storebackend/rest/addModule",
					{"modules":{"module_id":"Sales", "name_lang_key":"Sales Module", "desc_lang_key":"Sales Desc", "sort":"20" }},	
					contentType: "application/json; charset=utf-8",			
					  function(data,status){
						  $("#deviceData").val(data);
					      alert("module Data: " + data + "\nStatus: " + status);
					  });
			 /*
			$.ajax({ type:"GET", 
				  url: "http://localhost:9090/storebackend/rest/login/"+ $("#username").val() + "/" + $("#pwd").val(),				  
				  context: document.body, success: function(data){					  	               
		              $("#deviceData").val(data);
			  }});*/	
		
	});
    </script>
</head>

<body>

	<div class="container">

		<form class="form-signin" role="form" action="">
			<h2 class="form-signin-heading">Please sign in</h2>
			<input type="text" class="form-control" placeholder="username"
				required autofocus id="username"> <input type="password"
				class="form-control" placeholder="Password" required id="pwd">
			<input type="text" class="form-control" placeholder="device data"
				id="deviceData">
			<button class="btn btn-lg btn-primary btn-block" type="button"
				id="callDevice">Get</button>
			<label class="checkbox"> <input type="checkbox"
				value="remember-me"> Remember me
			</label>
			<button class="btn btn-lg btn-primary btn-block" type="button"
				id="login">Sign in</button>



			<input type="text" class="form-control" placeholder="Module ID"
				required autofocus id="module_id"> <input type="text"
				class="form-control" placeholder="Name" required autofocus
				id="name_lang_key"> <input type="text" class="form-control"
				placeholder="Desc" required autofocus id="desc_lang_key"> <input
				type="text" class="form-control" placeholder="Sort" required
				autofocus id="sort">

			<button class="btn btn-lg btn-primary btn-block" type="button"
				id="addModuleBtn">Add Module</button>
		</form>

	</div>
	<!-- /container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
</body>
</html>
