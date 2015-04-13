

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
	function locationSelection() {
		
		document.buyForm.action = 'locations';
		document.buyForm.submit();
		
	}
	function builderSelection() {
		document.buyForm.action= 'builders';
		document.buyForm.submit();
		
	}
	function schemeSelection() {
		document.buyForm.action= 'schemes';
		document.buyForm.submit();
	}
</script>

</head>
<body>
	<form name="buyForm" action="locationselection.jsp">
		<h2>Select</h2>
		<fieldset>


			Select City:
			<s:select list="cityList" headerKey="-1" headerValue="--- Select ---"
				id="cityID" name="cityID" listValue="cityName" listKey="cityCode"
				onchange="locationSelection();" />


			<br>
	<br>

			Select Location:
			<s:select list="locationsList" headerKey="-1" headerValue="--- Select ---"
				id="locationID" name="locationID" listValue="locationName" listKey="locationId"
				onchange="builderSelection();" />
				<br><br>
			Select Builder:
			<s:select list="builderList" headerKey="-1" headerValue="--- Select ---" 
				id="builderID" name="builderID" listValue="builderName" listKey="builderId" 
				onchange="schemeSelection();"/>
			<br><br>
			Select Scheme:
			<s:select list="schemeList" headerKey="-1" headerValue="--- Select ---"
				id="schemeID" name="schemeID" listValue="schemeName" listKey="schemeId" />
				
			
			
			<s:submit name="Submit" value="Submit"></s:submit>
			
			
			
		</fieldset>


	</form>
</body>
</html>