<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>deleteGuitar</title>
</head>
<body>
      <form action="delGuitar" method="get">
      <div class="container">
            <div class="row">
		        
			         <h2 class="text-center">
				         Delete Guitar!
			          </h2>
		
	   </div>
	   
	   <div class="row-fuid">
	    
	        <div class="col-md-6">
	        <h3>请输入删除吉他的序列号：</h3><br/>
	            <lable>serialNumber&nbsp;&nbsp;&nbsp;</lable>
				<input id="serialNumber" type="text" name="serialNumber"><br/>
				<button type="submit"  id="del" value="删除">
		     </div>


</body>
</html>