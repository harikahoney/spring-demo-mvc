<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.errorr {color:red}
</style>
</head>
<body>
<form:form action="processForm" modelAttribute="customer">
FirstName:<input type="text" path="firstname" />
<br><br>
LastName(*):<input type="text" path="LastName" />
     <form:errors path="lastName" cssClass="error" />
     <br><br>
</form:form>
races:<form:input path="races" />
<form:errors path="races" cssClass="error" />
<br><br>

POSTALCODE:<form:input path="postalCode" />
<form:errors path="postalCode" cssClass="error" />
<br><br>

COURSECODE:<form:input path="couseCode" />
<form:errors path="courseCode" cssClass="error" />
<br><br>

<input type="submit" value="submit" />
</body>
</html>