angular.module('teamawesome.tasks').controller('TaskListCtrl', ['$scope', '$http', '$modal', 'GlobalSrv', '$rootScope', function($scope, $http, $modal, GlobalSrv, $rootScope) {
	$http.get('/csci/rest/task/all').success(function(data) {
		$scope.tasks = data;
	});
	
	$scope.user = GlobalSrv.user;
	
	$rootScope.$on('user.signin', function(ev, user) {
		$scope.user = user;
	});
	
	$rootScope.$on('user.signout', function(ev) {
		delete $scope.user;
	});

	$scope.create = function() {
		var modalInstance = $modal.open({
			templateUrl: 'taskCreateModal.html',
			controller: TaskCreateModalCtrl
		});
		
		modalInstance.result.then(function(task) {
			$http.get('/csci/rest/task/all').success(function(data) {
				$scope.tasks = data;
			});
		});
	};
	
	var TaskCreateModalCtrl = function($scope, $http, GlobalSrv, $modalInstance) {
		$http.get('/csci/rest/category/all').success(function(data) {
		    $scope.categories = data;
		    
		    if (typeof $scope.task === 'undefined' || !$scope.task)
		    	$scope.task = {};
		    $scope.task.category = data[0];
		});
	
		$scope.submit = function() {
			$scope.task.postedBy = GlobalSrv.user;
		console.log('submitting task: ', $scope.task);
			$http({
				method: 'POST',
				url: '/csci/rest/task/create',
				data: $scope.task
			}).success(function(data) {
				$modalInstance.close(data);
			});
		};
		
		$scope.cancel = function() {
			$modalInstance.dismiss('cancel');
		};
	};
}]);