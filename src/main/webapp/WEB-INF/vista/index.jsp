<!DOCTYPE html>
<html ng-app="app">
    <head>
        <title>Preguntas</title>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
        <link  href="recursos/bootstrap.css" rel="stylesheet" />
        <script src="recursos/angular.js"></script>
        <script src="recursos/angular-route.js"></script>
        <script src="recursos/controlador.js"></script>
    </head>
    <body ng-controller="index">
        <ng-include src="'cabecera'"></ng-include>
        <div ng-view=""></div>
        <ng-include src="'pie'"></ng-include>
    </body>
</html>