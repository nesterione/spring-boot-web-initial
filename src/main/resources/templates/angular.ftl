<!doctype html>
<html lang="en" ng-app="myApp">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<div ng-controller="MainCntl">

    <input type="text" ng-model="modelName">

    <h1>{{modelName}}</h1>
    <p>{{2+3}}</p>

    <p>{{val}}</p>
</div>

</body>

<script src="/resources/assets/angular/angular.min.js"></script>
<script>

    var myApp = angular.module('myApp', []);

    myApp.controller('MainCntl', ['$scope', '$http', function ($scope, $http) {
            $scope.val = 2343;
        }]);

</script>
</html>