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
        <span class="text-success">
            <h2>Registro de Nueva Empresa</h2><br/><br/>
        </span>
        <s:form action="agregarEmpresa" cssClass="well">
            <s:hidden label="id" name="empresa.id" />
            <s:textfield label="Razon Social" name="empresa.razsocial" title="Nombre del Examen" placeholder="Ingrese Nombre del Examen" />
            <s:textfield label="RUC" name="empresa.ruc" title="Nombre del Examen" placeholder="Ingrese Nombre del Examen" />
            <s:textfield label="Gerencia" name="empresa.gerencia" title="Nombre del Examen" placeholder="Ingrese Nombre del Examen" />
            <s:textfield label="Division" name="empresa.divison" title="Nombre del Examen" placeholder="Ingrese Nombre del Examen" />
            <s:textfield label="Area" name="empresa.area" title="Nombre del Examen" placeholder="Ingrese Nombre del Examen" />
            <s:textfield label="Ubicacion" name="empresa.ubicacion" title="Nombre del Examen" placeholder="Ingrese Nombre del Examen" />
            <s:submit value="Guardar" cssClass="btn btn-success" />
        </s:form>

        <br />
        <br />
        <br />
    </body>
</html>