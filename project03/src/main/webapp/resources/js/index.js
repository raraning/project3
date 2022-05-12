$(document).ready(function(){
	
	/* 패키지,항공,호텔 카테고리선택 */
	$('.ismenu2').click(function(){
		$('.ismenu1_trip').css('display','none');
		$('.ismenu2_air').css('display','block');
		$('.ismenu3_hotel').css('display','none');
		$('.ismenu1').css('border-bottom','1px solid black');
		$('.ismenu1').css('font-weight','normal');
		$('.ismenu2').css('border-bottom','2px solid black');
		$('.ismenu2').css('font-weight','bold');
		$('.ismenu3').css('border-bottom','1px solid black');
		$('.ismenu3').css('font-weight','normal');
		
	});
	$('.ismenu1').click(function(){
		$('.ismenu1_trip').css('display','block');
		$('.ismenu2_air').css('display','none');
		$('.ismenu3_hotel').css('display','none');
		$('.ismenu1').css('border-bottom','2px solid black');
		$('.ismenu1').css('font-weight','bold');
		$('.ismenu2').css('border-bottom','1px solid black');
		$('.ismenu2').css('font-weight','normal');
		$('.ismenu3').css('border-bottom','1px solid black');
		$('.ismenu3').css('font-weight','normal');
	});
	$('.ismenu3').click(function(){
		$('.ismenu1_trip').css('display','none');
		$('.ismenu2_air').css('display','none');
		$('.ismenu3_hotel').css('display','block');
		$('.ismenu1').css('border-bottom','1px solid black');
		$('.ismenu1').css('font-weight','normal');
		$('.ismenu2').css('border-bottom','1px solid black');
		$('.ismenu2').css('font-weight','normal');
		$('.ismenu3').css('border-bottom','2px solid black');
		$('.ismenu3').css('font-weight','bold');
	});
	
	/*출발지 선택 모달*/
	$('.tripselectwhere').click(function(){
		$('.tripoption').css('display','block');
		$('.tripselectwhere').css('border','1px solid #b8b1ff');
		$('.modal').css('display','block');
	});
	$('.modal').click(function(){
		$('.tripoption').css('display','none');
		$('.tripselectwhere').css('border','1px solid white');
		$('.modal').css('display','none');
	});
	$('.tripwhere.tw1').click(function(){
		$('.tripselectwhere').html('<img src="/img/placeholder.png" width=15 height=15>&nbsp;서울(인천/김포) 출발');
		$('.tripoption').css('display','none');
		$('.tripselectwhere').css('border','1px solid white');
		$('.modal').css('display','none');
	});
	$('.tripwhere.tw2').click(function(){
		$('.tripselectwhere').html('<img src="/img/placeholder.png" width=15 height=15>&nbsp;부산 출발');
		$('.tripoption').css('display','none');
		$('.tripselectwhere').css('border','1px solid white');
		$('.modal').css('display','none');
	});
	$('.tripwhere.tw3').click(function(){
		$('.tripselectwhere').html('<img src="/img/placeholder.png" width=15 height=15>&nbsp;대구 출발');
		$('.tripoption').css('display','none');
		$('.tripselectwhere').css('border','1px solid white');
		$('.modal').css('display','none');
	});
	$('.tripwhere.tw4').click(function(){
		$('.tripselectwhere').html('<img src="/img/placeholder.png" width=15 height=15>&nbsp;청주 출발');
		$('.tripoption').css('display','none');
		$('.tripselectwhere').css('border','1px solid white');
		$('.modal').css('display','none');
	});
	$('.tripwhere.tw5').click(function(){
		$('.tripselectwhere').html('<img src="/img/placeholder.png" width=15 height=15>&nbsp;광주 출발');
		$('.tripoption').css('display','none');
		$('.tripselectwhere').css('border','1px solid white');
		$('.modal').css('display','none');
	});
	$('.tripwhere.tw6').click(function(){
		$('.tripselectwhere').html('<img src="/img/placeholder.png" width=15 height=15>&nbsp;제주 출발');
		$('.tripoption').css('display','none');
		$('.tripselectwhere').css('border','1px solid white');
		$('.modal').css('display','none');
	});
	$('.tripwhere.tw7').click(function(){
		$('.tripselectwhere').html('<img src="/img/placeholder.png" width=15 height=15>&nbsp;양양 출발');
		$('.tripoption').css('display','none');
		$('.tripselectwhere').css('border','1px solid white');
		$('.modal').css('display','none');
	});
	$('.tripwhere.tw8').click(function(){
		$('.tripselectwhere').html('<img src="/img/placeholder.png" width=15 height=15>&nbsp;강원 출발');
		$('.tripoption').css('display','none');
		$('.tripselectwhere').css('border','1px solid white');
		$('.modal').css('display','none');
	});
	
	/*여행시작일 선택 모달*/
	$('.tripselectwhen').click(function(){
		$('.tripoptiondate').css('display','block');
		$('.tripselectwhen').css('border','1px solid #b8b1ff');
		$('.modal').css('display','block');
	});
	$('.modal').click(function(){
		$('.tripoptiondate').css('display','none');
		$('.tripselectwhen').css('border','1px solid white');
		$('.modal').css('display','none');
	});
	$('#tripdate').change(function(){
		var tripdate1 = $('#tripdate').val();
		$('.tripselectwhen').html('<img src="/img/calendar.png" width=15 height=15>&nbsp;'+tripdate1);
	});
	
	/*항공권,우리끼리*/
	
	$('.tripair').click(function(){
		$('.tripair').css('display','none');
		$('.tripairno').css('display','block');
	});
	
	$('.tripairno').click(function(){
		$('.tripair').css('display','block');
		$('.tripairno').css('display','none');
	});
	
	$('.tripus').click(function(){
		$('.tripus').css('display','none');
		$('.tripusno').css('display','block');
	});
	
	$('.tripusno').click(function(){
		$('.tripus').css('display','block');
		$('.tripusno').css('display','none');
	});
	
	
	
});








