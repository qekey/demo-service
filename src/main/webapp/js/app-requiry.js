'use strict';

var app = angular.module('inquiry-app', ['ngSanitize']);

    app.controller('InquiryListController', function ($scope, $http) {

      $http({ 
    	  url:'http://localhost:8080/demo-service/api/requiry_list/requiry_id',
                method:'GET'
                }).success(function(data,header,config,status){

                    //响应成功
                    $scope.requirys=data;
                    
                }).error(function(data,header,config,status){
                    //处理响应失败
                    
                });
      

       $scope.display = function (requiry) {          
            if(requiry.flag=='init'){
              return {display:'none'};
            }else{
               return {display:'block'};
            }            
        }
        $scope.delShow = function (requiry) {          
            return requiry.flag!='init';              
        }

        $scope.del = function (idx) {          
            $scope.requirys.splice(idx, 1);
        }
    });


 app.controller('InquiryController', function ($scope, $http) {

   $scope.pnChangeForEnter=function(event,requiry){  
   if (event.keyCode !== 13) return;
       $scope.pnChange(event,requiry);
   } 


   $scope.pnChange=function(event,requiry){     

        $http({
                url:'http://localhost:8080/demo-service/api/inventory/find?pn='+requiry.pn,
                method:'GET'
                }).success(function(data,header,config,status){
                    //响应成功                    
                    $scope.requiry.relevant=data;
                    $scope.requiry.mfr=$scope.requiry.relevant[0].mfr;
                }).error(function(data,header,config,status){
                    //处理响应失败
                });

               var flag= requiry.flag;
               if(flag=='init'){
                 var obj = {flag:'init'};    
                 $scope.requirys.push(obj);
                 requiry.flag=null;

                
               }
   } 

 });


  app.directive('mfsInput',function($http){

      var dis={display:'none'} ; 

      return {
              restrict: 'EA',
              template:'<div style="white-space:nowrap"><input type="txt" ng-model="model" placeholder="{{placeholder}}"/><button ng-click="mfsshow(model)">v</button><div ng-style="{{style}}"><ul><li ng-repeat="requiry in othermodel"><div ng-click="test(requiry)"><p>{{requiry.mfr}}</br>{{requiry.pn}}</div></li></ul></div></div>',
              // template:'<div><ul><li ng-repeat="mfr in mfrs">{{mfr.name}}</li></ul></div></div>',                         
              scope: {
                 placeholder: '@',
                 model:'=',
                 othermodel:'=',
                 style:'@'              
              },           

              link:function(scope, ele, attrs){

                scope.test=function(req){
                           
                  scope.model=req.mfr;
                };

                scope.mfsshow=function(mfr){  
                alert(mfr);                
                alert(scope.style); 
                  scope.style={dispaly:'block'};
                  alert(scope.style); 
                };

                 scope.dispaly=function(){                  
                 return {display:'none'};
                };

                ele[0].onkeyup = function(){  
                           
                $http({
                url:'http://localhost:8080/demo-service/api/mfrs/search?pn='+scope.model,
                method:'GET'
                }).success(function(data,header,config,status){

                    //响应成功
                    scope.othermodel=data;

                    
                }).error(function(data,header,config,status){
                    //处理响应失败
                    
                });
               }


           }
       };
  });

  app.directive("pnInput",function($http){
      return {
        restrict: 'EA',       
        replace: false,
        link:function(scope, elements, attrs){ 

               elements[0].onblur = function(){
               
               $http({
                url:'http://localhost:8080/demo-service/api/inventory/find?pn='+this.value,
                method:'GET'
                }).success(function(data,header,config,status){
                    //响应成功                    
                    scope.requiry.relevant=data;
                    scope.requiry.mfr=data[0].mfr;
                }).error(function(data,header,config,status){
                    //处理响应失败
                });
            }
         }
       };
  });


  app.directive("eleInput",function($http){
      return {
        restrict: 'EA',       
        replace: false,
        link:function(scope, elements, attrs){ 
          
           if(scope.requiry.flag=="init"){  
           // alert(elements[0]) ;     
             elements[0].focus();
           }
         }
       };
  });








  app.directive("direselect",function(){

    return {   
    replace:false,
    restrict:'EA',
    link:function(scope,ele,attr){

        scope.data = {
            availableOptions: [
                {id: '1', name: 'MAX1'},
                {id: '2', name: 'Intel1'},
                {id: '3', name: 'Micro1'}
            ],
            selectedOption: {id: '3', name: 'Option C1'} //This sets the default value of the select in the ui
        };

        
    }
};




  });


    

 








