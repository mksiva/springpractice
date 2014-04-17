<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>Demos</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/multiple-select.css"/>
    <style>
        select {
            width: 300px;
        }
    </style>
</head>
<body>
    <select id="ms" multiple="multiple">
        <option value="1">January</option>
        <option value="2">February</option>
        <option value="3">March</option>
        <option value="4">April</option>
        <option value="5">May</option>
        <option value="6">June</option>
        <option value="7">July</option>
        <option value="8">August</option>
        <option value="9">September</option>
        <option value="10">October</option>
        <option value="11">November</option>
        <option value="12">December</option>
    </select>

    <!--<script src="../jquery.min.js"></script>-->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.0/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.multiple.select.js"></script>
    <script>
        $(function() {
            $('#ms').multipleSelect();
        });
    </script>
</body>
</html>
