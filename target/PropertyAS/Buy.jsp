

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Selection</title>
<script>
	$(document).ready(function() {
		$("#next1").click(function() {
			$("t2").show();
		});
		$("#next2").click(function() {
			$("t3").show();
		});
	});
	function locationselection() {
		
		document.buyForm.action = 'locations';
		alert("ffff1");
		document.buyForm.submit();

	}
	function BuilderSelection() {
		document.buyForm.action= 'builders';
		document.buyForm.submit();
		
	}
</script>

</head>
<body>
	<form name="buyForm" action="locationselection.jsp">
		<h2>Select</h2>
		<fieldset>



			<s:select list="cityList" headerKey="-1" headerValue="--- Select ---"
				id="cityID" name="cityID" listValue="cityName" listKey="cityCode"
				onchange="locationselection();" />


			<br>



			<s:select list="locationsList" headerKey="-1" headerValue="--- Select ---"
				id="locationID" name="locationID" listValue="locationName" listKey="locationId"
				onchange="Buildselection();" />
				<br>
				
			<s:select list="builderList" headerKey="-1" headerValue="--- Select ---" 
				id="builderID" name="builderID" listValue="builderName" listKey="bId" />

			<s:submit name="Submit" value="Submit"></s:submit>

		</fieldset>


	</form>
</body>
</html>