<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%-- Using Struts2 Tags in JSP --%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<s:actionerror/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>User Login Page</title>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$('#submit').click(function(){
    var name=$('#nameId').val();
    var regex = /^[a-zA-Z0-9 ]*$/;
    if (regex.test(name)) {
        return true;
    } else {
    	alert('invalid')
        return false;
    }
  });
});

</script>
</head>
<body>

<h3>Welcome User, please login below nnnnnnn</h3>
<s:form action="userLoginAction">
	<s:textfield name="name" label="Username" id="nameId"></s:textfield>
	<s:textfield name="pwd" label="Password" type="password"></s:textfield>
	<s:submit value="Login" id="submit"></s:submit>
</s:form>
</body>
</html>