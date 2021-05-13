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
        �ܺ��� �����͸� ������ �ö� (������,�ٸ� ����)
 -->
<script src="https://unpkg.com/vue"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
</head>
<body>
 <center>
 	<!-- VueJS�� ����Ǵ� ��ġ -->
 	<div id="app">
 		<h1>{{message}}</h1>
 		<input type=text size=20 v-model="message">
 	</div>
 	<script>
 		// vue ��ü ����
 		new Vue({
 			el:'#app', //����Ǵ� element �±�
 			data:{
 				message:"Hello VueJS"
 			},
 			// LifeCycle
 			beforeCreate(){
 				console.log("�̺�Ʈ ���, �ν��Ͻ� �ʱ�ȭ");
 			},
 			created(){
 				console.log("�ν��Ͻ� �ۼ� �Ϸ�");
 			},
 			beforeMount(){
 				console.log("�޸� ���� �� ��������, ������ �о��");
 			},
 			mounted(){
 				console.log("�޸� ����(window.onload)");
 			},
 			beforeUpdate(){
 				console.log("������/ȭ�� ���� �� ȣ��");
 			},
 			updated(){
 				console.log("���� ȯ��");
 			},
 			beforeDestroy(){
 				console.log("�޸� ���� ��");
 			},
 			destroyed(){
 				console.log("���� �Ϸ�");
 			}
 		})
 	</script>
 </center>
</body>
</html>