

<%@page import="javax.swing.text.Document"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Selection</title>
<script>
	/* $("#cityID,#locationID,#builderID").change(function() {
	 var associatedCombo = $(this).attr('data-associated');
	 requestData = {};
	 requestData[this.id] = $(this).val();
	 $.get('Buy.jsp', requestData, function(responseData) {
	 $("#" + associatedCombo).replaceWith(responseData);
	 });
	 }); */
	function locationSelection() {
		
		document.buyForm.action = 'locations';
		document.buyForm.submit();
	
	}
	function builderSelection() {
		document.buyForm.action = 'builders';
		document.buyForm.submit();

	}
	function schemeSelection() {
		document.buyForm.action = 'schemes';
		document.buyForm.submit();
	}
	function final() {
		
		if(document.getElementById('schemeID').valueOf('headerValue')!="--- Select ---")
			
		document.getElementById('b1').disabled=false;
		
	}
</script>

</head>
<body>
	<form name="buyForm" action="apartmentselection">
		<h2>Select</h2>
		<fieldset>


			Select City: 
			<br>
			<s:select list="cityList" headerKey="-1" headerValue="--- Select ---"
				id="cityID" name="cityID" listValue="cityName" listKey="cityCode"
				onchange="locationSelection();" />


			<br> <br> Select Location:<br>1231
			<s:select list="locationsList" headerKey="-1"
				headerValue="--- Select ---" id="locationID" name="locationID"
				listValue="locationName" listKey="locationId"
				onchange="builderSelection();" />
			<br>
			<br> Select Builder:<br>
			<s:select list="builderList" headerKey="-1"
				headerValue="--- Select ---" id="builderID" name="builderID"
				listValue="builderName" listKey="builderId"
				onchange="schemeSelection();" />
			<br>
			<br> Select Scheme:<br>
			<s:select list="schemeList" headerKey="-1"
				headerValue="--- Select ---" id="schemeID" name="schemeID"
				listValue="schemeName" listKey="schemeId" onchange="final();"/>

				Test Message
				<h1>12345</h1>

			<s:submit name="Submit" value="Submit" id="b1" disabled="true" ></s:submit>



		</fieldset>


	</form>
</body>
</html>