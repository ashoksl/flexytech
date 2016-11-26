var ShopView = Backbone.View.extend({
	el: '#contentArea',
	initialize : function(){
		
	},
	
	events : {
		
	},
	render : function(){
		var shopTemplate = _.template($('#shop-template').html());
		this.$el.html(shopTemplate(null));
		return this;
	}
});