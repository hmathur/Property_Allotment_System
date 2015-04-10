

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">		
<title>Selection</title>
<script>
$(document).ready(function(){
    $("#next1").click(function(){
        $("t2").show();
    });
    $("#next2").click(function(){
        $("t3").show();
    });
});
</script>

</head>
<body>
<form action="next">
<h2>Select</h2>
<fieldset>

<s:combobox label="Select city" list="cityList" headerKey="-1" headerValue="--- Select ---" name="city" listValue="cityName" />
<s:submit value="submit" name="submit"/>
 

</fieldset>

<fieldset style="visibility: hidden">
<table id="t2" class="hide">
<s:iterator value="locationList">
<tr>
<s:radio list="selectedlocation"></s:radio>
<td><s:property value="lId"/></td>
<td><s:property value="lName"/></td>
<td><s:property value="cityCode"/></td>

</tr>
</s:iterator>
<tr><td><s:submit value="submit" name="submit" id="next2"/>
</td>
</tr>
</table>

</fieldset>
</form>
</body>
</html>