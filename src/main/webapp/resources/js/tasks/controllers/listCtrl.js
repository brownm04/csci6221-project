angular.module('teamawesome.tasks').controller('ListCtrl', ['$scope', '$http', function($scope, $http) {
  function getUsers() {
    $http.get('/csci/rest/users/all').success(function(data) {
      $scope.users = data;
    });
  }
  getUsers();

  $scope.submit = function() {
    $http({
      method: 'POST',
      url: '/csci/rest/users/create',
      data: $scope.user
    }).success(function(data) {
      getUsers();
    });
  };
}]);