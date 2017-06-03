<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Preguntas</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="shortcut icon" href="recursos/imagenes/ico/favicon.png">
        <link rel="stylesheet" href="recursos/css/bootstrap.min.css">
        <link rel="stylesheet" href="recursos/css/styles.css">
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
        <![endif]-->
        <script src="recursos/js/jquery.min.js"></script>
        <script src="recursos/js/bootstrap.min.js"></script>
        <script src="recursos/js/custom.js"></script>
    </head>
    <body>
        <div class="header navbar-fixed-top" style="">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <!-- Logo -->
                        <div class="logo">
                            <h1><a href="index.html">Preguntas</a></h1>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="page-content">
            <div class="row">
                <div class="col-md-2">
                    <div class="sidebar content-box" style="display: block;">
                        <ul class="nav">
                            <li class="current"><a href="index"><i class="glyphicon glyphicon-home"></i> Inicio</a></li>
                            <li><a href="admin"><i class="glyphicon glyphicon-pencil"></i> Administrar</a></li>
                            <li><a href="login"><i class="glyphicon glyphicon-list"></i> Salir</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-10">
                    <div class="content-box-large">
                        <h1>Respuestas</h1>
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>Respuesta</th>
                                    <th>Acciones</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="respuesta" items="${listRespuesta}">
                                <tr>
                                    <td>${respuesta.respuesta}</td>
                                    <td>
                                        <a href="editarRespuesta?id=${respuesta.id_respuesta}">Editar</a>
                                    </td>
                                </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                        <input type="button" class="btn btn-primary" value="Nueva" onclick="location = 'nuevaRespuesta'" />
                        <br /><br />
                    </div>
                </div>
            </div>
        </div>
    <footer class="navbar-fixed-bottom">
        <div class="container">
            <div class="copy text-center">
                Copyright 2017 <a href='#'>Universidad Distrital Francisco Jose de Caldas - MCIC</a>
            </div>
        </div>
    </footer>
</body>
</html>