<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp" %>
<link rel="stylesheet" href="/css/mymenu.css">
<div>
	<div style="display:inline-block;width:400px"> </div>
	<div style="display:inline-block;width:1100px">
		<div style="height:30px"> </div>
		<div style="text-align:center;font-size:25px;font-weight:bold">마이메뉴</div>
		<div>판매중인 숙소상품 목록...!!</div>
		<c:forEach var="sellroom" items="${hotelselllist}">
			<div>
				<div style="display:inline-block;">${sellroom.h_uid}</div>
				<div style="display:inline-block;">${sellroom.h_name}</div>
				<div style="display:inline-block;">${sellroom.h_room}</div>
				<div style="display:inline-block;">${sellroom.breakfast}</div>
				<div style="display:inline-block;">${sellroom.h_price}</div>
				<div style="display:inline-block;">${sellroom.h_point}</div>
			</div>
		</c:forEach>
	</div>
	<div style="display:inline-block;width:400px"> </div>
</div>
<%@ include file="/WEB-INF/views/include/footer.jsp" %>