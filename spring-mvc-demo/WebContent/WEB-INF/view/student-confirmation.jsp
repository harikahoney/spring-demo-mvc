<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation</title>
</head>
<body>
The Student is Confirmed: ${student.firstName} ${student.lastName}
<br>
<br>
Country:${student.country}
<br>
FavLanguage: ${student.favLan}
<br><br>
os:
<ul>
                <c:forEach var="temp" items="${student.os}" >
                   <li> ${item} </li>
                   </c:forEach>
                   </ul>
                   </body>
                   </html>