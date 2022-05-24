<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<link rel="stylesheet" href="/css/join.css">
<script type="text/javascript" src="/js/join.js" ></script>
<div>
	<div style="display:inline-block;width:400px"> </div>
	<div style="display:inline-block;width:1100px">
		<div style="height:30px"> </div>
		<div style="text-align:center;font-size:25px;font-weight:bold">호텔 등록</div>
		<div style="height:30px"> </div>
		<div>
			<div style="display:inline-block;width:320px"></div>
			<div style="display:inline-block;font-size:16px;">
			<form method="post" onsubmit="return check()">
				<div>
					<div class="joinname">숙소명</div>
					<div style="display:inline-block;"><input id="h_name" name="h_name"></div>
				</div>
				<div style="height:10px"> </div>
				<div>
					<div class="joinname">숙소 종류</div>
					<div style="display:inline-block;"><input type="radio" id="h_class" name="h_class" value="1" checked>호텔<input type="radio" id="h_class" name="h_class" value="2">펜션</div>
				</div>
				<div style="height:10px"> </div>
				<div>
					<div class="joinname">숙소 성급</div>
					<div style="display:inline-block;"><input id="h_star" name="h_star"></div>
				</div>
				<div style="height:10px"> </div>
				<div>
					<div class="joinname">객실당 수용 인원 수</div>
					<div style="display:inline-block;"><input id="h_people" name="h_people"></div>
				</div>
				<div style="height:10px"> </div>
				<div>
					<div class="joinname">숙소 지역</div>
					<div style="display:inline-block;"><input id="h_country" name="h_country"></div>
				</div>
				<div style="height:10px"> </div>
				<div>
					<div class="joinname">숙소 주소</div>
					<div style="display:inline-block;"><input id="h_address" name="h_address"></div>
				</div>
				<div style="height:10px"> </div>
				<div>
					<div class="joinname">이메일</div>
					<div style="display:inline-block;"><input type="email" id="email" name="email"></div>
				</div>
				<div style="height:10px"> </div>
				<div>
					<div class="joinname">전화번호</div>
					<div style="display:inline-block;"><input type="tel" id="phone" name="phone"></div>
				</div>
				<div style="height:10px"> </div>
				<div>
					<div class="joinname">여권번호</div>
					<div style="display:inline-block;"><input id="passport" name="passport"></div>
				</div>
				<div style="height:20px"> </div>
				<div style="text-align:center">
					<div><input type="submit" value="회원가입" class="joinbutton2"></div>
				</div>
				<div style="height:20px"> </div>
				</form>
			</div>
		</div>
	</div>
	<div style="display:inline-block;width:400px"> </div>
</div>
<%@ include file="/WEB-INF/views/include/footer.jsp" %>