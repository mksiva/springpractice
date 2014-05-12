<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="shortcut icon" href="../../assets/ico/favicon.ico">

<title>Kadai</title>

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

<script type="text/javascript">
	$(function() {

		/*
		
		$("#callDevice")
				.click(
						function() {
							$
									.ajax({
										type : "GET",
										url : "http://localhost:9090/storebackend/rest/device/status/DEV333",
										context : document.body,
										success : function(data) {
											$("#deviceData").val(
													data.deviceInfo);
										}
									});
						});
		$("#login").click(function() {
			$.post("http://localhost:9090/storebackend/rest/loginme", {
				username : $("#username").val(),
				password : $("#pwd").val()
			}, function(data, status) {
				$("#deviceData").val(data);
				//alert("Data: " + data + "\nStatus: " + status);
			});
		});

		var Modules = {
			"modules" : {
				"module_id" : "Sales",
				"name_lang_key" : "Sales Module",
				"desc_lang_key" : "Sales Desc",
				"sort" : "20"
			}
		};

		$("#addModuleBtn").click(function() {

			$.ajax({
				url : "http://localhost:9090/storebackend/rest/addModule",
				type : "POST",
				data : {
					module_id : $("#module_id").val(),
					name_lang_key : $("#name_lang_key").val(),
					desc_lang_key : $("#desc_lang_key").val(),
					sort : $("#sort").val()
				}, //Stringified Json Object
				success : function(resposeJsonObject) {
					$("#deviceData").val(resposeJsonObject);
					alert("module Data: " + resposeJsonObject);
				}
			});

		});
		*/ 
	});
</script>
</head>

<body>

	<div class="container">
		<form class="form-signin" role="form" action="login" method="post">
			<h2 class="form-signin-heading">Please sign in</h2>
			<span id="notification" class="label label-warning"
										style="font-size: small;">${loginMsg}</span>
			<input type="text" class="form-control" placeholder="username" required autofocus id="username" name="username"> 
			<input type="password"	class="form-control" placeholder="Password" required id="password" name="password">
			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
		</form>
	</div>
	<!-- /container -->

</body>
</html>
