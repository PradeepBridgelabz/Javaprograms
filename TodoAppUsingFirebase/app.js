var app =angular.module('mobileApp',['ui.router','ngMaterial','ngAnimate','firebase']);

app.config(function($stateProvider,$urlRouterProvider){

 $urlRouterProvider.otherwise("/home");
$stateProvider
   // .state('login',{
   //   url : '/login',
   //   templateUrl : 'templates/login.html',
   // })
   .state('home',{
     url : '/home',
     // templateUrl : 'templates/home.html',
     controller : 'homeCtrl'
   });
   // .state('home.dashboard',{
   //   url : '/dashboard',
   //   templateUrl : 'templates/dashboard.html',
   //   controller : 'dashboardCtrl'
   // });

});
