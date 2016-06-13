<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>addGuitar</title>
</head>
<body>
 <form action="addGuitar" method="get">
      <div class="container">
            <div class="row">
		        
			         <h2 class="text-center">
				         Add Guitar!
			          </h2>
		
	   </div>
	   
	   <div class="row-fuid">
	    
	        <div class="col-md-6">
	            <lable>serialNumber&nbsp;&nbsp;&nbsp;</lable>
				<input id="serialNumber" type="text" name="serialNumber"><br/>
				<lable>price&nbsp;&nbsp;&nbsp;</lable>
				<input id="price" type="text" name="price"><br/>
				<lable>builder&nbsp;&nbsp;&nbsp;</lable>
				<input id="builder" type="text" name="builder"><br/>
				<lable>model</lable>
				<input id="model" type="text" name="model"><br/>
				<lable>type&nbsp;&nbsp;&nbsp;&nbsp;</lable>
				<input id="type" type="text" name="type"><br/>
				<lable>numStrings</lable>
				<input id="numStrings" type="text" name="numStrings"><br/>
				<lable>topwood&nbsp;&nbsp;&nbsp;</lable>
				<input id="topwood" type="text" name="topwood"><br/>
				<lable>backwood&nbsp;&nbsp;&nbsp;</lable>
				<input id="backwood" type="text" name="backwood"><br/>
				<button type="submit"  id="add" value="添加">
		     </div>

</body>
</html>