<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
    <head>
        <title>Preguntas</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" href="recursos2/imagenes/ico/favicon.png">
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" href="recursos/css/bootstrap.min.css">
        <link rel="stylesheet" href="recursos/css/form-elements.css">
        <link rel="stylesheet" href="recursos/css/style.css">
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
        <script src="recursos/js/jquery.min.js"></script>
        <script src="recursos/js/bootstrap.min.js"></script>
        <script src="recursos/js/jquery.backstretch.min.js"></script>
        <script src="recursos/js/scripts.js"></script>
        <!--[if lt IE 10]>
        <script src="recursos/js/placeholder.js"></script>
        <![endif]-->
    </head>
    <body>
        <div class="top-content">	
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                            <h1><strong>Preguntas</strong> Universidad Distrital</h1>
                            <div class="description">
                                <p>Sistema de exámenes en linea. Informática. MCIC</p>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                            <div class="form-top">
                                <div class="form-top-left">
                                    <h3>Inicio de Sesion</h3>
                                    <p>Ingrese su nombre de usuario y contraseña:</p>
                                </div>
                                <div class="form-top-right">
                                    <i class="fa fa-lock"></i>
                                </div>
                            </div>
                            <div class="form-bottom">
                                <form role="form" action="validar" method="post" class="login-form">
                                    <div class="form-group">
                                        <label class="sr-only" for="nombre">Usuario</label>
                                        <input type="text" name="nombre" placeholder="Usuario..." class="form-username form-control" id="nombre">
                                    </div>
                                    <div class="form-group">
                                        <label class="sr-only" for="contrasena">Contraseña</label>
                                        <input type="password" name="contrasena" placeholder="Contraseña..." class="form-password form-control" id="contrasena">
                                    </div>
                                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                                    <button type="submit" class="btn">Ingresar!</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>