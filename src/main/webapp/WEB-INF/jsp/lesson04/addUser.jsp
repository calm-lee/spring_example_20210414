<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 추가</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>

</head>
<body>
	<div class="container">
		<h1>회원 정보 추가</h1>

		<form method="post" action="/lesson04/ex01/add_user" id="addForm">
			<label><b>이름: </b><input type="text" name="name"
				class="form-control" placeholder="이름을 입력하세요."></label><br> <label><b>생년월일:
			</b><input type="text" name="birth" class="form-control"
				placeholder="생년월일을 입력하세요. 예)19950806"></label><br> <label
				for="email"><b>이메일: </b></label><input type="text" name="email"
				class="form-control col-5" placeholder="이메일을 입력하세요. 예)19950806"><br>
			<label><b>자기소개: </b></label><br>
			<textarea class="form-control" name="introduce" rows="10" cols="20"></textarea>
			<br>

			<p>
				<input type="submit" class="btn btn-info" id="addBtn" value="추가">
			</p>

		</form>

	</div>
	<script>
		$(document).ready(function(){
			
/* 			//(1) jQuery의 submit 기능 이용하기
			$('#addForm').on('submit', function(e){ //form 아이디 적어주기
				e.preventDefault();
				//alert("추가 버튼 클릭");
				
				//validation check
				let name = $('input[name=name]').val().trim(); //trim 통해 혹시 모를 공백 제거
				if(name == ''){
					alert("이름을 입력해주세요.");
					return;
				}
				
				let birth = $('input[name=birth]').val().trim();
				if(birth == ''){
					alert("생년월일을 입력해주세요.");
					return;
				}
				
			});
			// 여기까지 도달하면 submit이 된 것
			 */
			// (2) jQuery에 AJAX 통신을 이용하기
			$('#addBtn').on('click', function(e){
				
				//AJAX를 사용하는 경우 form 태그는 사용하지 않는다.
				
				//alert("추가 버튼 클릭");
				
				//validation
				let name = $('input[name=name]').val().trim(); //trim 통해 혹시 모를 공백 제거
				if(name == ''){
					alert("이름을 입력해주세요.");
					return;
				}
				
				let birth = $('input[name=birth]').val().trim();
				
				if(birth == ''){
					alert("생년월일을 입력해주세요.");
					return;
				}
				
				if(isNan(birth)){
					alert("숫자만 입력하세요.");
					return;
				}
				
				let email = $('input[name=email]').val().trim();
				
				let introduce = $('textarea[name=introduce]').val().trim();
				
				console.log("email: " + email);
				console.log("introduce: " + introduce);
				
				
				$.ajax({
					type: 'POST'
					, url: '/lesson04/ex01/add_user'
					, data: {'name:': name, 'birth': birth, 'email': email, 'introduce': introduce}
					, success: function(data){
						alert(data);
						//location.href = "/lesson06/ex01/get_user";
						location.reload;
					}, complete: function(data){
						alert("완료");
					}, error: function(e){
						alert("error: " + e);
					}
				});				
		
			});			
		});
	</script>
</body>
</html>