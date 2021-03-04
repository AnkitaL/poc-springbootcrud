<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form id="addEmployee" action="addEmployee">
<input type="number" name="id" >
<input type="text" name="name"/>
<input type="text" name="company_name"/>
<button type="submit">Submit</button>
<button type="reset">Reset</button>
</form>

<form id="getById" action="getById">

<input type="number" name="id">
<button type="submit">Get</button>
</form>

</body>
</html>