<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<link rel="stylesheet" href="/css/hotelmain.css">     
<script type="text/javascript">
var obTimeOut; // clearTimeout() 함수를 이용하여 Timeout 을 취소하기위해 사용됨

var ObjectArray = new Array ();
ObjectArray[1] = "/img/hotel_back1.jpg";
ObjectArray[2] = "/img/hotel_back2.jpg";
ObjectArray[3] = "/img/hotel_back3.jpg";
ObjectArray[4] = "/img/hotel_back4.jpg";

var nObjectCnt = 0;	
function ShowDefaultRotate() // 스스로 자신을 호출하는 재귀함수 (Recursive Function)
{
	nObjectCnt++;
	
	if(nObjectCnt >= ObjectArray.length){
		nObjectCnt = 1;
	}
	if( nObjectCnt < ObjectArray.length )  // 배열의 갯수 이내일때만 실행
	{
		document.getElementById("img_id").src = ObjectArray[nObjectCnt];		 
		obTimeOut = setTimeout("ShowDefaultRotate()",7000);  // 1초후에 자기자신을 호출 
				
	}else{
		clearTimeout(obTimeOut); // 배열의 갯수만큼 반복하여 변환시킨 후에는 Timeout 을 중지시킨다 
	}		
}

function startAnimation(){
      obTimeOut = window.setTimeout(ShowDefaultRotate,100); // 윈도우 로드 후 0.1초 후에 반복함수를 호출합니다.
}

 window.onload = startAnimation; // 윈도우 로드시 이미지 변환함수 실행

</script>
<div class="hotelmain_back">
	<div><img id="img_id" src="/img/hotel_back1.jpg"></div>
	<div class="hotel_search">
		<div style="height:15px"></div>
		<div>
			<div style="display:inline-block;width:10px"> </div>
			<div class="hotel_search_content">
				<input id="hotel_search_where" name="hotel_search_where" placeholder="어디로떠나세요?">
			</div>
			<div class="hotel_search_content">
				<div class="hotel_checkinout_box">
					<input type="date" id="hotel_search_checkin" name="hotel_search_checkin">
					<input type="date" id="hotel_search_checkout" name="hotel_search_checkout">
				</div>
			</div>
			<div class="hotel_search_content">
				<input id="hotel_search_room" name="hotel_search_room">
				<input id="hotel_search_people" name="hotel_search_people">
			</div>
			<div class="hotel_search_content">
				<button class="hotel_search_button">숙소 검색</button>
			</div>
		</div>
		<div style="height:15px"></div>
	</div>
</div>
<%@ include file="/WEB-INF/views/include/footer.jsp" %>






