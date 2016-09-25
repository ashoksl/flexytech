var UserModel = Backbone.Model.extend({
	
	initialize : function(){
	
	},
	defaults : {
		userName : '',
		password : ''
	},
	url : 'http://localhost:8080/backbone/login'
});