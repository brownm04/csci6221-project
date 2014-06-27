angular.module('teamawesome.tasks', ['ui.router'])
  .config(['$stateProvider', function($stateProvider) {
    $stateProvider.state('list', {
      url: '/list',
      templateUrl: 'resources/js/tasks/partials/list.html',
      controller: 'ListCtrl'
    });
  }]);