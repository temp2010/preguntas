var app = angular.module("app", ['ngRoute']);
app.controller("index", ['$scope', function ($scope) { }]);
app.provider("remoteResource", RemoteResourceProvider);
app.constant("baseUrl", ".");
app.config(['baseUrl', 'remoteResourceProvider',
    function (baseUrl, remoteResourceProvider) {
        remoteResourceProvider.setBaseUrl(baseUrl);
    }
]);

app.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/', {
        templateUrl: "principal",
        controller: "index"
    });

    $routeProvider.otherwise({
        redirectTo: '/'
    });

}]);

function RemoteResourceProvider() {
    var _baseUrl;
    this.setBaseUrl = function (baseUrl) {
        _baseUrl = baseUrl;
    };
    this.$get = ['$http', '$q', function ($http, $q) {
            return new RemoteResource($http, $q, _baseUrl);
        }];
};

function RemoteResource($http, $q, baseUrl) { }