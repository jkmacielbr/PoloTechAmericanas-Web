
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>




<html>
<head>
    <title>Historico de operação</title>
</head>
<body>

<c:forEach  var="operacao" items="${requestScope.historico_operacoes}">

    <c:out value="soma = ${operacao}"/> <br> </br>
</c:forEach>

</body>
</html>
