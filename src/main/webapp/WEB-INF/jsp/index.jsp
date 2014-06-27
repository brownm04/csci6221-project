<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page isELIgnored="false" %>

<html>
<head>
	<script type="text/javascript" src="./resources/lib/angularjs/angular.js"></script>
	<script type="text/javascript" src="./resources/lib/angular-ui-bootstrap/ui-bootstrap-tpls-0.11.0.js"></script>
	<script type="text/javascript" src="./resources/lib/angular-ui-router/angular-ui-router.min.js"></script>
	
	<link rel="stylesheet" type="text/css" href="./resources/css/bootstrap/bootstrap.min.css" />
</head>
<body>
	Write some text in textbox:
    <input type="text" ng-model="sometext" />
 
    <h1>Hello {{ sometext }}</h1>
    
    <div ui-view></div>
	
	<script type="text/javascript" src="./resources/js/app.js"></script>
	<script type="text/javascript" src="./resources/js/tasks/tasks.js"></script>
	<script type="text/javascript" src="./resources/js/tasks/controllers/listCtrl.js"></script>
</body>
</html>