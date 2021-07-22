<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 정보 추가</title>
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

      <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>        	
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</head>
<body>
	<form method="post" action="/lesson04/ex02/add_student">
	<div class="container">
		<h1>학생 정보 추가</h1>
			
			<b>이름: </b><input type="text" name="name" class="form-control" placeholder="이름을 입력하세요."><br>
			<b>휴대폰 번호: </b><input type="text" name="phoneNumber" class="form-control" placeholder="휴대폰 번호를 입력하세요."><br>
			<b>이메일 주소: </b><input type="text" name="email" class="form-control" placeholder="이메일 주소를 입력하세요."><br>
			<b>장래희망: </b><input type="text" name="dreamJob" class="form-control" placeholder="장래희망을 입력하세요."><br>
			<p>
				<input type="submit" class="btn btn-success" value="추가">
			</p>
		</form>
	</div>

</body>
</html>