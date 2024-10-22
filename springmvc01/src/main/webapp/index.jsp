<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<h2>Index Page</h2>
</body>
<form action="/springmvc01/addStudent" method="get">
<input type="text" name="rollNumber" id="rollNumber" placeholder="Enter your RollNumber">
<br>
<input type="text" name="studentName" id="studentName" placeholder="Enter your studentName">
<button type="submit" name="button1">submit</button>
</form>
</html>