<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib uri="/struts-jquery-tags" prefix="sj"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<sj:head jqueryui="true" jquerytheme="ui-darkness" />
<body>
<br/><br/>
				<s:form action="agproto">
					<s:hidden label="id" name="protocolo.id" />
					<span class="text-success">
						<h2>Registro de Nuevo Protocolo</h2><br/><br/>
					</span>
					<s:textfield label="Examen  " name="protocolo.nomexamen" title="Nombre del Examen" placeholder="Ingrese Nombre del Examen" />
					<s:textfield label="Precio   " name="protocolo.precio" title="Precio" placeholder="0.0" />
					<s:submit value="Guardar" cssClass="btn btn-success" />
				</s:form>
			
		<br />
		<br />
		<br />
</body>
</html>