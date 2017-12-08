angular
    .module("app")
    .component('taskDetail', {
        templateUrl: './MesCourses.html',
        bindings: {
            task: '='
        },
        controller: ['$scope', 'enseigne', function ($scope, enseigne) {
            $scope.edit = function (item) {
                item.hidden = !item.hidden;
            };

            $scope.markAsDone = enseigne.markAsDone;
            
        }]
});