<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script src="https://unpkg.com/vue"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
.row {
  margin: 0px auto;
  width:900px
}
h1 {
   text-align: center
}
</style>
</head>
<body>
<!-- searchMainOnlineDailyBoxOffice.do -->
  <div style="height: 30px"></div>
  <div class="container">
   <h1>온라인 이용 순서</h1>
   <div class="row">
	
   </div>
  </div>
  <script>
   new Vue({
	   el:'.container',
	   data:{
		   movie:[]  //멤버변수
	   },
	   mounted(){
		   // (서버)데이터를 얻어와 데이터를 출력하기 위해 HTML을 메모리에 저장(트리형태=DOM) 
		   /* axios.get('https://www.kobis.or.kr/kobis/business/main/searchMainOnlineDailyBoxOffice.do')
	   		.then(response=>{
	   			this.movie = response.data
	   			console.log(response)
	   		}) */
		   this.movie = []
	   }
   })
  </script>
</body>
</html>