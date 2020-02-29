<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<body>
<form:form action ="processForm" modelAttribute="student">
 FirstName : <input type="text" path="firstName" />
 <br><br>
 Lastname : <input type="text" path="lastName" />
 <br><br>
 Country:
 <form:select path="Country">
 <form:options items ="${student.countryOptions}"/>    <!-- //java related code -->
 <form:option value="India" label="India" />
 <form:option value="China" label="China" />
 <form:option value="Europe" label="Europe" />
 <form:option value="Cannada" label="Cannada" />
 <form:option value="Austrailia" label="Australia" />
 </form:select>
 <br><br>
 Select One Language:
 JAVA <form:radiobutton path="favlan" value="java" />
 C <form:radiobutton path="favlan" value="c" />
 PHP <form:radiobutton path="favlan" value="php" />
 RUBY <form:radiobutton path="favlan" value="ruby" />
<br><br>
Choose OS:
LINUX:<form:checkbox path="os" value="LINUX"/>
WINDOWS:<form:checkbox path="os" value="WINDOWS"/> 
MAC:<form:checkbox path="os" value="MAC" />
<br><br>
 <input type="submit" value="submit">
</form:form>
</body>
</head>
</html>