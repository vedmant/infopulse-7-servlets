<%--
  Created by IntelliJ IDEA.
  User: vedmant
  Date: 1/21/17
  Time: 5:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  errorPage="error.jsp" %>
<%@ taglib prefix="mytag" uri="/WEB-INF/tld/mytaglib.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h1>Show page</h1>
        <p>Name from session: ${sessionScope.name}</p>

        <p>Custom mytag:welcome tag:</p>
        <mytag:welcome name="John">Some test string</mytag:welcome>
        <c:out value="JSTP out"></c:out>

        <p>c:if</p>
        <c:if test="${sessionScope.name != null}">sessionScope.name != null</c:if>

        <p>c:choose:</p>
        <c:choose>
            <c:when test="${sessionScope.name != null}">sessionScope.name != null</c:when>
            <c:otherwise>Default</c:otherwise>
        </c:choose>

        <p>c:forEach</p>
        <c:forEach var="item" items="${requestScope.list}">
            <c:out value="${item}"></c:out>
        </c:forEach>
    </div>
    <%@ include file="../footer.jsp" %>
</body>
</html>
