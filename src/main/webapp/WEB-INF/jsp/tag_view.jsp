<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
    <link rel="stylesheet" type="text/css" href="/resources/css/style.css">
</head>
<body>
<h1>Notes</h1>

<c:forEach var="tag" items="${tags}">
    Item <c:out value="${tag.name}"/><p>
    <hr>
</c:forEach>

</body>
</html>