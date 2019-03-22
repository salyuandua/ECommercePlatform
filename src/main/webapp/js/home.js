$(function(){
	
	utils.loadContent("product/list",$("#content_seg"),function(){
//		$('.ui.accordion')
//		  .accordion()
//		;

	});
	
	$("#menu_traggle").click(function(){
		$('.ui.sidebar')
		  .sidebar('toggle')
		;
	});

});