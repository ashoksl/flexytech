var UserView = Backbone.View.extend({
	
	events : {
		'blur #userNameText':'onUserNameBlur',
		'click #submitButton':'onSubmit'
	},
	
	onUserNameBlur : function(e){
		var value = $(e.currentTarget).val().trim();
		$(e.currentTarget).val(value);
	},
	
	render : function(){
		//Empty implementation
	},
	
	onSubmit : function(){
		var userModel = new UserModel();
		userModel.set("userName",$('#userNameText').val());
		userModel.set("password",$('#password').val());
		userModel.save({
			success : function(response){
				alert("Success");
			},
			error : function(response){
				alert("Error");
			}
		});
	}
});