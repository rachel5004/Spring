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
 		<h1>{{message}}</h1>
 		<button v-if="check==1">Click</button>
 		<button v-if="check!=1">Cancle</button>
 	</div>
 	<script>
	new Vue({
		el:'#app', //적용되는 element 태그
		data:{
			message:"Hello VueJS",
			check:2
		}
	})
 	</script>
</body>
</html>