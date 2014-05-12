<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Demos</title>


<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/multiple-select.css" />
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/style.css"
	rel="stylesheet">
	<!-- 
	<link href="${pageContext.request.contextPath}/resources/css/select2.css" rel="stylesheet"/>
    <script src="${pageContext.request.contextPath}/resources/js/select2.js"></script> -->
<style>
select {
	width: 300px;
}
</style>
<!--<script src="../jquery.min.js"></script>
	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.0/jquery.min.js"></script>
	
	-->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/scripts.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/jquery.multiple.select.js"></script>
<script>
	$(function() {
		$("#issuesList").multipleSelect({
            filter: true
        });

		/*
			  var progresspump = setInterval(function(){
			    /* query the completion percentage from the server */
			   /* $.post("doretry", function(data){
			      /* update the progress bar width */
			    /*  $("#progress").css('width',data+'%');
			      /* and display the numeric value */
			    /*  $("#progress").html(data+'%');

			      /* test to see if the job has completed */
			      /*if(data > 99.999) {
			        clearInterval(progresspump);
			        $("#progressouter").removeClass("active");
			        $("#progress").html("Done");
			      }
			    })
			  }, 1000); */
		
		//$("#projectKey").searchable();
		//$("#projectKey").select2();
		
		$.ajax({
     xhr: function(){
       var xhr = new window.XMLHttpRequest();
       //Upload progress
       xhr.upload.addEventListener("progress", function(evt){
       if (evt.lengthComputable) {
         var percentComplete = evt.loaded / evt.total;
         //Do something with upload progress
         console.log(percentComplete);
         }
       }, false);
     //Download progress
       xhr.addEventListener("progress", function(evt){
         if (evt.lengthComputable) {
           var percentComplete = evt.loaded / evt.total;
         //Do something with download progress
           console.log(percentComplete);
         }
       }, false);
       return xhr;
     },
     type: 'POST',
     url: "doretry",
     data: {},
     success: function(data){
    //Do something success-ish
    }
 });
        
		// Calls the selectBoxIt method on your HTML select box

		$("#projectKey").change(function() {
			/*
			  $.ajax({ url: "selecttoretry2", data : $(this).val(),
				  context: document.body, success: function(result){
				  //var json = $.parseJSON(result); // create an object with the key of the array
			       //alert(json.html);
					alert(result);
			  },error: function(result){
			      // var json = $.parseJSON(result);
			       //alert(json.error);
			       alert('Error' + result);
			    }});
             */
			  $.ajax({ 
				  type:"GET",
				  url: "selecttoretry/" + $(this).val(),
				  context: document.body, success: function(result){
				  //var json = $.parseJSON(result); // create an object with the key of the array
			       //alert(json.html);
					alert(result);
			  },error: function(result){
			      // var json = $.parseJSON(result);
			       //alert(json.error);
			       alert('Error' + result);

			       var html1 = "";
	                for (var i = 0; i < 3; i++) {
	                    html1 = html1 + "<option value=test" + i + ">test" + i + "</option>";			
	                }
	                $('#mks option').remove();
	                $('#issuesList option').remove();
	                //$('.multiselect').multiselect('destroy');
	                $('#issuesList').append(html1);
	                $('#issuesList').multipleSelect("refresh");
	                
	                var dataArr = [{'value':'val1','text':'text1'},
	                               {'value':'val2','text':'text2'},
	                               {'value':'val3','text':'text3'},
	                               {'value':'val4','text':'text4'},
	                               {'value':'val5','text':'text5'},
	                               {'value':'val6','text':'text6'},
	                               {'value':'val7','text':'text7'}];
	                $.each(dataArr, function(i){
	                    $('#mks').append($("<option></option>")
	                                    .attr("value",dataArr[i]['value'])
	                                    .text(dataArr[i]['text']));
	                });
	                /*
	                $.each(dataArr, function(i){
	                    $('#issuesList').append($("<option></option>")
	                                    .attr("value",dataArr[i]['value'])
	                                    .text(dataArr[i]['text']));
	                }); */
	                // $('#ms').html(html1);
	               
	              // $('#ms').selectmenu('refresh', true);
	               // alert(html1);

	               // $('#issuesList').children().remove();
			    }});
			    
			});
	});

	
	
</script>
</head>
<body>

	<form:form action="doretry" method="post" modelAttribute="retryBean">
		<div class="container">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<br />
					<br /> <br /> <br />
					<div class="panel panel-success" style="width: 800; height: 500">
						<div class="panel-heading">
							<h2 class="panel-title">
								Retry PDF conversion <small>retry PDF conversion</small>
							</h2>
						</div>
						<div class="panel-body">
							<table align="center">
								<tr>
									<td align="right"><span class="label label-success"
										style="font-size: small;">Project:</span></td>
									<td>&nbsp;&nbsp;</td>
									<td><form:select path="projectKey" id="projectKey">
											<form:options items="${projects}" />
										</form:select></td>
								</tr>
								<tr>
									<td>&nbsp;</td>
								</tr>
								<tr>
									<td><span class="label label-success"
										style="font-size: small;">Please select Issue:</span></td>
									<td>&nbsp;&nbsp;</td>
									<td><form:select path="issuesList" multiple="multiple" id="issuesList" size="50">
											<form:options items="${projectIssues}" />
										</form:select></td>
								</tr>
								<tr>
									<td>&nbsp;<!--  <select id="mks" multiple="multiple"><option value="sds">sds</option></select>-->
									
									 </td>
								</tr>
								<tr>
									<td></td>
									<td></td>
									<td align="right"><!-- <a href=""
										class="btn btn-success  btn-xs">Retry PDF Conversion</a> -->
										<button class="btn btn-success  btn-xs">Retry</button>
										</td>
								</tr>
								
								<tr><td colspan="3"><div class="progress progress-striped active" style="height:44px;">
    <div id="progressBar" class="bar" style="height:44px;width:1%;background-color:green"></div>
</div></td></tr>
							</table>
						</div>
						<!-- 
				<div class="panel-footer">
					Panel footer
				</div> -->
					</div>
				</div>
			</div>
		</div>
	</form:form>



</body>
</html>
