<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
    <div class="alert alert-info" align="center">
		Empresa Eliminado <br>
		Id:
		<s:property value="empresa.id"/><br>
		<s:form action="listarEmpresas">
                    <br>
		<s:submit  value="Aceptar" cssClass="btn btn-info"/>
		</s:form>		
	</div>
	
</body>
</html>