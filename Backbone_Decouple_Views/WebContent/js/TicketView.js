var TicketView = Backbone.View.extend({
	el: '#contentArea',
	initialize : function(){
		
	},
	
	events : {
		
	},
	render : function(){
		var ticketTemplate = _.template($('#ticket-template').html());
		this.$el.html(ticketTemplate(null));
		return this;
	}
});