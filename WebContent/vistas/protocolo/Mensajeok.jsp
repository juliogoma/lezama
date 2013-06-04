<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	
    <div class="alert alert alert-success" >
		<s:label value="%{msj}" />
		<h3>Nombre del Protocolo: <s:property value="protocolo.nomexamen"/></h3>
		<s:form action="listarProtocolo">
                    <br>
		<s:submit  value="Aceptar" cssClass="btn btn-success"/>
		</s:form>	
	</div>
	
</body>
</html>