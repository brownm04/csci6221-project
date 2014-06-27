window.bootstrap = function() {
  angular.bootstrap(document.documentElement, ['teamawesome']);
};

window.init = function() {
  window.bootstrap();
};

angular.element(document).ready(function() {
  window.init();
});

window.app = angular.module('teamawesome', ['ui.bootstrap', 'ui.router', 'teamawesome.tasks']);

window.app.config(['$urlRouterProvider', function($urlRouterProvider) {
  $urlRouterProvider.otherwise('/');
}]);
