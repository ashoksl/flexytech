var MenuView = Backbone.View.extend({
	
	model : new MenuModel(),
	initialize : function(){
		
	},
	events : {
		
	},
	render : function(){
		var menuTemplate = _.template($('#menu-template').html());
		this.$el.html(menuTemplate(this.model.toJSON()));
		return this;
	}
});