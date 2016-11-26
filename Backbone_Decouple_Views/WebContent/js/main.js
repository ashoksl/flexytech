$(document).ready(function(){
	var menuView = new MenuView();
	menuView.setElement($('#menuArea'));
	menuView.render();
	new MyRouter();
	Backbone.history.start();
});

var MyRouter = Backbone.Router.extend({
	routes : {
		"recharge":"onRecharge",
		"bookticket" : "onBookTicket",
		"shop":"whileShopping"
	},

	viewFactory : function(){
		return{
			rcView : typeof rcView == 'undefined' ? new RCView() : rcView,
			ticketView : typeof ticketView == 'undefined' ? new TicketView() : ticketView,
			shopView : typeof shopView == 'undefined' ? new ShopView() : shopView
		};
		
	},
	onRecharge : function(){
		this.viewFactory().rcView.render();
	},
	
	onBookTicket : function(){
		this.viewFactory().ticketView.render();
	},
	
	whileShopping : function(){
		this.viewFactory().shopView.render();
	}
});