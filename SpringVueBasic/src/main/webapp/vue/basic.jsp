<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<!-- 
	<script type="text/javascript"> ES5
	<script type="text/babel"> ES6
	
	https://unpkg.com/axios/dist/axios.min.js
        외부의 데이터를 가지고 올때 (스프링,다른 서버)
 -->
<script src="https://unpkg.com/vue"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
</head>
<body>
 <center>
 	<!-- VueJS가 적용되는 위치 -->
 	<div id="app">
 		<h1>{{message}}</h1>
 		<input type=text size=20 v-model="message">
 	</div>
 	<script>
 		// vue 객체 생성
 		new Vue({
 			el:'#app', //적용되는 element 태그
 			data:{
 				message:"Hello VueJS"
 			},
 			// LifeCycle
 			beforeCreate(){
 				console.log("이벤트 등록, 인스턴스 초기화");
 			},
 			created(){
 				console.log("인스턴스 작성 완료");
 			},
 			beforeMount(){
 				console.log("메모리 저장 전 서버연결, 데이터 읽어옴");
 			},
 			mounted(){
 				console.log("메모리 저장(window.onload)");
 			},
 			beforeUpdate(){
 				console.log("데이터/화면 변경 전 호출");
 			},
 			updated(){
 				console.log("변경 환료");
 			},
 			beforeDestroy(){
 				console.log("메모리 해제 전");
 			},
 			destroyed(){
 				console.log("해제 완료");
 			}
 		})
 	</script>
 </center>
</body>
</html>