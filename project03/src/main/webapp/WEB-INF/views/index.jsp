<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<link rel="stylesheet" href="/css/index.css">
<script type="text/javascript" src="/js/index.js" ></script>
<div class="indexback">
	<div style="display:inline-block;width:400px"> </div>
	<div style="display:inline-block;width:1100px">
		<div style="height:100px;"> </div>
		<div>
			<div class="indexsearch">
				<c:choose>
					<c:when test="${sessionScope.id != null}">
						<div class="istop">${sessionScope.name}님,</div>
						<div class="istop"><b>어떤 여행을 꿈꾸시나요?</b></div>
					</c:when>
					<c:otherwise>
						<div class="istop">고객님,</div>
						<div class="istop"><b>어떤 여행을 꿈꾸시나요?</b></div>
					</c:otherwise>
				</c:choose>
				<div style="height:15px;"> </div>
				<div>
					<div class="ismenu1">패키지</div><div class="ismenu2">항공</div><div class="ismenu3">호텔</div>
				</div>
				<!-- 패키지 검색 시작(ismenu1) -->
				<div class="ismenu1_trip">
					<div style="height:15px;"> </div>
					<div><input id="tripsearch" name="tripsearch" placeholder="어디로 떠나세요?"></div>
					<div style="height:10px;"> </div>
					<div>
						<div style="display:inline-block;">
							<div class="tripselectwhere"><img src="/img/placeholder.png" width=15 height=15>&nbsp;출발지 선택</div>
							<div class="tripoption">
								<div class="tripwhere tw1">서울(인천/김포)</div>
								<div class="tripwhere tw2">부산</div>
								<div class="tripwhere tw3">대구</div>
								<div class="tripwhere tw4">청주</div>
								<div class="tripwhere tw5">광주</div>
								<div class="tripwhere tw6">제주</div>
								<div class="tripwhere tw7">양양</div>
								<div class="tripwhere tw8">강원</div>
							</div>
							<div class="modal"></div>
							<div style="height:10px;"> </div>
							<div class="tripair">
								<div style="height:4px;"> </div>
								<div>
									<div style="display:inline-block;width:15px"></div>
									<div style="display:inline-block;vertical-align:middle"><img src="/img/ticket-flight (1).png" width=40 height=43></div>
									<div style="display:inline-block;width:10px"></div>
									<div style="display:inline-block;vertical-align:middle">항공권은<br>있어요</div>
								</div>
							</div>
							<div class="tripairno">
								<div style="height:4px;"> </div>
								<div>
									<div style="display:inline-block;width:15px"></div>
									<div style="display:inline-block;vertical-align:middle"><img src="/img/ticket-flight.png" width=40 height=43></div>
									<div style="display:inline-block;width:10px"></div>
									<div style="display:inline-block;vertical-align:middle">항공권은<br>있어요</div>
								</div>
							</div>
						</div>
						<div style="display:inline-block;">
							<div class="tripselectwhen"><img src="/img/calendar.png" width=15 height=15>&nbsp;여행시작일 선택</div>
							<div class="tripoptiondate">
								<input type="date" id="tripdate" name="tripdate" class="tripdate">
							</div>
							<div style="height:10px;"> </div>
							<div class="tripus">
								<div style="height:4px;"> </div>
								<div>
									<div style="display:inline-block;width:15px"></div>
									<div style="display:inline-block;vertical-align:middle"><img src="/img/people.png" width=43 height=43></div>
									<div style="display:inline-block;width:10px"></div>
									<div style="display:inline-block;vertical-align:middle">우리끼리만<br>여행할래요</div>
								</div>
							</div>
							<div class="tripusno">
								<div style="height:4px;"> </div>
								<div>
									<div style="display:inline-block;width:15px"></div>
									<div style="display:inline-block;vertical-align:middle"><img src="/img/people (1).png" width=43 height=43></div>
									<div style="display:inline-block;width:10px"></div>
									<div style="display:inline-block;vertical-align:middle">우리끼리만<br>여행할래요</div>
								</div>
							</div>
						</div>
						<div style="height:15px;"> </div>
						<div class="indexbutton">패키지 검색</div>
					</div>
				</div>
				<!-- 패키지 검색 끝(ismenu1) -->
				<!-- 항공 검색 시작(ismenu2) -->
				<div class="ismenu2_air">
					<div style="height:15px;"> </div>
					<div>
						<div class="is_flight">왕복</div>
						<div class="is_flight">편도</div>
					</div>
					<div style="height:10px;"> </div>
					<div>
						<div class="is_air">출발지</div>
						<div class="is_air">도착지</div>
					</div>
				</div>
				<!-- 항공 검색 끝(ismenu2) -->
				<!-- 호텔 검색 시작(ismenu3) -->
				<div class="ismenu3_hotel">
				</div>
				<!-- 호텔 검색 끝(ismenu3) -->
			</div>
			<div style="display:inline-block;"></div>
		</div>
	</div>
	<div style="display:inline-block;width:400px"> </div>
</div>



<%@ include file="/WEB-INF/views/include/footer.jsp" %>
