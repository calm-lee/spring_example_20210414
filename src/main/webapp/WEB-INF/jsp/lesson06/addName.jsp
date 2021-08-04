<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

      <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>        	
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</head>
<body>
	<div class="container">
		<b>이름:</b>
		<label for="name"><input id="name" type="text" class="form-control" placeholder="이름을 입력하세요"></label>
		<button id="nameCheckBtn" type="button" class="btn btn-info">중복확인</button><br>
		<div id="statusArea"></div><br>
		<button id="joinBtn" type="submit" class="btn btn-success">가입하기</button>
	</div>
	
	<script>
		$(document).ready(function() {
			// 중복확인 버튼 클릭
			$('#nameCheckBtn').on('click', function(){

				let name = $('#name').val().trim();
				
				$('#statusArea').empty();
				
				
				if(name == ''){
					$('#statusArea').append("<span class='text-danger'>이름이 비어있습니다</span>");
					return;
				}
				
				
				$.ajax({
					type: 'get'
					, data: {'name' : name}
					, url: '/lesson06/ex02/is_duplication'
					, success: function(data){
						//alert(data.is_duplication)
						if (data.is_duplication === true){
							$('#statusArea').append("<span class='text-danger'>이름이 중복되었습니다</span>");
						} 
					}
					, error : function(e){
						alert("error: " + e);
					}
					
				});
				
			});
			
			// 회원가입 버튼 클릭
			$('#joinBtn').on('click',function(e){
				e.preventDefault(); // 바로 submit 되는 것 방지
				
				console.log($('#statusArea').children().length); // statusArea 밑에 자식태그 존재 여부
				
				// 만약 statusArea에 아무 자식노드(태그)가 없으면 submit한다.
				
				if($('#statusArea').children().length == 0){
					alert("서브밋 가능");
				} else {
					alert("서브밋 불가");
				}
			});
		});
	</script>

</body>
</html>