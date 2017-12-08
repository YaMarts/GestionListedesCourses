function tasksCtrl($scope, enseigne) {
  $scope.tasksList = enseigne.getAll();

  $scope.ajouter = function() {
    enseigne.add($scope.task);
    $scope.task = null;
  };

  $scope.markAsDone = enseigne.markAsDone;

  $scope.selectAll = function () {
	  enseigne.js.selectAll();
  }
  
  $scope.countItemRestants = function () {
    return enseigne.countItemRestants();
  }
  
  $scope.delete = function (taskItem) {
	  enseigne.delete(taskItem);
  }
  
  $scope.edit=function (taskItem) {
    taskItem.hidden = !taskItem.hidden;
  }
}

class enseigne {
  constructor() {
    this.list = [
      { label: "Carrefour", done: false },
      { label: "Leclerc", done: false },
      { label: "SuperU", done: false }
    ];
  }

  getAll() {
    return this.list;
  }

  add(taskLabel) {
    this.list.push({
      label: taskLabel,
      done: false
    });
  }

  markAsDone(taskItem) {
    taskItem.done = !taskItem.done;
  }
  
  selectAll () {
    for (let taskItem of this.list) {
      taskItem.done = true;
    }
  }
  
  delete (taskItem) {
    let position = this.list.indexOf(taskItem);
    this.list.splice(position, 1);
  }
  
  countItemRestants () {
    let compteur = 0;
    
    for (let taskItem of this.list) {
      if(!taskItem.done) {
        compteur++;
      }
    }
    
    return compteur;
  }
}

angular
.module("app",'MesCourses' ['ui.router'])
.controller("tasksController", ["$scope", "enseigne", tasksCtrl])
.service("enseigne", enseigne)
.config(function($stateProvider) {
	  var listeCoursesState = {
	    name: 'MesCourses',
	    url: '/MesCourses',
	    component : 'MesCoursesComponent'
	  }
	  
	  var aboutState = {
	    name: 'about',
	    url: '/about',
	    template: '<h3>Its the UI-Router MesCourses app!</h3>'
	  }
	  
	  $stateProvider.state(listeCoursesState);
	  $stateProvider.state(aboutState);
	}). 