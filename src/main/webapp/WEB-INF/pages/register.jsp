<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hi</title>
</head>
<body>

<form:form action="save" method="post" modelAttribute="user">

    <form:errors path="name"/><br/>
    Name:<form:input type="text" path="name"/><br/>

    <form:errors path="password"/><br/>
    Password:<form:input type="text" path="password"/><br/>

    <form:errors path="email"/><br/>
    Mail:<form:input type="text" path="email"/><br/>



    <button type="submit">Sign up</button>

</form:form>


</body>
</html>
