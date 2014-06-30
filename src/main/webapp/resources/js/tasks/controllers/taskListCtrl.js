angular.module('teamawesome.tasks').controller('TaskListCtrl', ['$scope', '$http', '$modal', function($scope, $http, $modal) {
	$http.get('/csci/rest/tasks/all').success(function(data) {
		$scope.tasks = data;
	});

	$scope.create = function() {
		var modalInstance = $modal.open({
			templateUrl: 'taskCreateModal.html',
			controller: TaskCreateModalCtrl
		});
	};
	
	var TaskCreateModalCtrl = function($scope, $modalInstance) {
		$scope.submit = function() {
			console.log('Submitting Task: ', $scope);
		};
		
		$scope.cancel = function() {
			$modalInstance.dismiss('cancel');
		};
	};
}]);