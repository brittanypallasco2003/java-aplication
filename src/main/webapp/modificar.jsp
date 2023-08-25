<%--
  Created by IntelliJ IDEA.
  User: POO
  Date: 25/8/2023
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Modificar Registro</h2>
<br>
<form action="" method="post" autocomplete="off">
    <p>
        Codigo
        <input type="text" id="codigo" name="codigo">
    </p>

    <p>
        Cédula
        <input type="text" id="id" name="id">
    </p>

    <p>
        Nombre
        <input type="text" id="nombre" name="nombre">
    </p>

    <p>
        Fecha Nacimiento
        <input type="text" id="nacimiento" name="nacimiento">
    </p>

    <p>
        Signo
        <input type="text" id="signo" name="nacimiento">
    </p>

    <button id="guardar" name="guardar" type="submit">Guardar</button>
</form>


</body>
</html>
