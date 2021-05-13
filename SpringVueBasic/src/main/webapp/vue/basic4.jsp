<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script src="https://unpkg.com/vue"></script>
</head>
<body>
	<div id="app">
 		<h1>hello vue</h1>
 		<p v-if="!message">hello</p>
 		<p>v-if(directive)</p>
 		<p v-if="!message">message에 값이 없는 경우</p>
 		<p v-if="message">message에 값이 있는 경우</p>
 	</div>
 	<script>
	new Vue({
		el:'#app',
		data:{
			message:"a",
		}
	})
 	</script>
</body>
</html>