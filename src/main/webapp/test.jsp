<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>




    <%@ include file="fragments/header.jsp" %>

    <a href="http://localhost:8080/webappsample/hello">Bla bla</a>
    <br/>
    <a href="http://localhost:8080/webappsample/hello2">Bla bla2</a>
    <br/>
    <%=new java.util.Date()%>
    <br/>
    <%="Request data:" + request.getQueryString()%>
    <br/>
    <%
        String queryData = request.getQueryString();
        out.println("Request data:" + queryData);
    %>
    <br/>
    <br/>
    <br/>
    <jsp:getProperty property="value" name="obj"/>
    <br/>
    <br/>
    <c:out value="${sessionScope.data1}"/>
    <с:set var="salary" scope="session" value="100"/>
</body>
</html>
