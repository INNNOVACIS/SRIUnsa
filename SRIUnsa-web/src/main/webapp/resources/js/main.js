var investigacionApp = angular.module('investigacionApp', [
	'ngRoute',  
	'ui.bootstrap',
	'angularFileUpload'
]);

investigacionApp.config(function($routeProvider){
	$routeProvider
	.when('/home', {
		templateUrl : 'resources/views/home.html',
		controller : 'homeController'
	})
	.when('/investigacion',{
		templateUrl : 'resources/views/investigacion.html',
		controller : 'investigacionController'
	})
	.when('/actividadesRevisadas',{
		templateUrl : 'resources/views/actividadesRevisadas.html',
		controller : 'actividadesRevisadasController'
	})
	.when('/actividadesPendientes',{
		templateUrl : 'resources/views/actividadesPendientes.html',
		controller : 'actividadesPendientesController'
	})
	.when('/relacionDocentes',{
		templateUrl : 'resources/views/relacionDocentes.html',
		controller : 'relacionDocentesController'
	})
	.when('/configuracion',{
		templateUrl : 'resources/views/configuracion.html',
		controller : 'configuracionController'
	})
	.when('/generarDocente',{
		templateUrl : 'resources/views/generarDocente.html',
		controller : 'generarDocenteController'
	})
	.when('/uploadFile',{
		templateUrl : 'resources/views/uploadFile.html',
		controller : 'uploadFileController'
	})
	.when('/usuarios',{
		templateUrl : 'resources/views/usuarios.html',
		controller : 'usuariosController'
	})
        .when('/tipoproduccion',{
		templateUrl : 'resources/views/TipoProduccion.html',
		controller : 'TipoProduccionController'
	})
        .when('/archivos',{
		templateUrl : 'resources/views/archivos.html',
		controller : 'archivosController'
	})
	.when('/',{
		templateUrl : 'resources/views/login.html',
		controller : 'loginController'
	});
});
