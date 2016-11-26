var RCView = Backbone.View.extend({
	el: '#contentArea',
	initialize : function(){
		
	},
	
	events : {
		'click #rcSubmitButton':'doOnRCSubmitButton'
	},
	render : function(){
		var rcTemplate = _.template($('#recharge-template').html());
		this.$el.html(rcTemplate(null));
		return this;
	},
	
	doOnRCSubmitButton : function(){
		alert("RC click!!");
	}
});