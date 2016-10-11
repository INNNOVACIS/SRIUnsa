investigacionApp.controller('usuariosController', function($log, $scope, $location, $rootScope, $filter, 
    UsuariosService, SharedService) {

	$scope.users = [];
	$scope.usuario = {};
	
	var getUsuarioServiceSuccess = function(response){
    	$log.debug("Get Usuario - Success");
    	console.log("Success :: ", response);
    	$scope.users = response;
    }

    var getUsuarioServiceError = function(response){
     	$log.debug("Get Usuario - Error"); 
    }

    var registrarUsuarioSuccess = function(response){
    	$log.debug("Registrar Usuario - Success");
    	console.log("success :: ", response);
    	$scope.users.push(response);
    	$scope.usuario = {};
    }

    var registrarUsuarioError = function(response){

    }

    var updateUsuarioSuccess = function(response){
    	$log.debug("Update User - Success");
    	console.log("success :: ", response);
    	$scope.usuario = response;
    }

    var updateUsuarioError = function(response){

    }

    var deleteUsuarioSuccess = function(response){
    	$log.debug("Delete User - Success");
    	console.log("success :: ", response);
    	$scope.usuario = response;
    }

    var deleteUsuarioError = function(response){

    }

    /********** CRUD USUARIOS ***********/

    $scope.getUsuarios = function(){
      	UsuariosService.getUsuarios().then(getUsuarioServiceSuccess, getUsuarioServiceError);
    }

    $scope.registrarUsuario = function(){
    	console.log("Usuario :: ", $scope.usuario);
		UsuariosService.registrarUsuario($scope.usuario).then(registrarUsuarioSuccess, registrarUsuarioError);
    }

    $scope.updateUsuario = function(){
    	
    	UsuariosService.updateUsuario($scope.usuario).then(updateUsuarioSuccess, updateUsuarioError);
    }

    $scope.deleteUsuario = function(user){
    	$scope.usuario = user;
    	$scope.usuario.estado = "0";
    	UsuariosService.deleteUsuario($scope.usuario).then(deleteUsuarioSuccess. deleteUsuarioError);
    }

    $scope.update = function(user){
    	$scope.usuario = user;
    }

    $scope.getUsuarios();
});