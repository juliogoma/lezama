<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib uri="/struts-jquery-tags" prefix="sj"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<sj:head jqueryui="true" jquerytheme="ui-darkness" />
<body>

	
	<s:form action="buscarempresaraz">
		<!-- ><s:textfield label="Id" name="id" />< -->
		<sj:autocompleter label="Buscar" name="razsocial" list="%{lista}"
			listValue="razsocial" placeholder="Ingrese razsocial" />
		<s:submit value="Buscar"/>
	</s:form>
	<div class="alert alert-danger">
	<s:actionmessage/>
	</div>
</body>
</html>