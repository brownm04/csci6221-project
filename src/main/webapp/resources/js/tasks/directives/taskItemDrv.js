angular.module('teamawesome.tasks').directive('taItem', [function(TaskService) {
	return {
		restrict: 'A',
		scope: {
			item: '='
		},
		link: function(scope, elem, attrs) {
			
		},
		template: '<div class="row">' +
			'<div class="assmt-li-title" >' +
				'<h4 id="clickable-title">Foobar</h4>' +
			'</div>' +
			'<div data-ng-bind="item.description"></div>' +
			'<div data-ng-bind="item.payment"></div>' +
		'</div>'
	};
}]);