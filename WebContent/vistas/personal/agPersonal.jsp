<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib uri="/struts-jquery-tags" prefix="sj"%>
<script src="bootstrap/js/bootstrap-datetimepicker.min.js"></script>
<link rel="stylesheet" href="bootstrap/css/bootstrap.css" />
<link rel="stylesheet" href="bootstrap/css/bootstrap-datetimepicker.min.css" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    </head>
    <sj:head jqueryui="true" jquerytheme="ui-darkness" />
    <body>
        <br/><br/>
        <span class="text-success">
            <h2>Registro de Nuevo Personal</h2><br/><br/>
        </span>
        <s:form action="agregarper" cssClass="well">
            <s:hidden label="id" name="personal.id" />
            <span class="label">Fecha de Nacimiento:</span> &nbsp<input type="date" name="personal.fechaNac" title="Fecha de Nacimiento"><br/>
            <span class="label">Fecha de Contrato:</span> &nbsp<input type="date" name="personal.fechContrato" title="Fecha de Contrato">
            <s:textfield label="DNI" name="personal.dni" title="Ingrese DNI" placeholder="Ingrese DNI" />
            <s:textfield label="Nombre" name="personal.nombre" title="Nombre" placeholder="Ingrese Nombre" />
            <s:textfield label="Apellido Paterno" name="personal.apePaterno" title="Apellido Paterno" placeholder="Ingrese Apellido Paterno" />
            <s:textfield label="Apellido Materno" name="personal.apeMaterno" title="Apellido Materno" placeholder="Ingrese Apellido Materno" />
            <s:select label="Sexo" class="span3"name="personal.sexo" title="Seleccione su Sexo" headerValue="-----Seleccione Sexo -----"  headerKey="1" list="{'Masculino','Femenino'}" />  
            <s:select label="Estado Civil" class="span3" name="personal.estadoCivil"  title="Estado Civil" headerValue="--- Estado Civil ---"  headerKey="1" list="{'Soltero','Casado','Viudo','Divorciado','Otro'}" />  
            <s:textfield label="Lugar de Nacimiento" name="personal.lugarNac" title="Lugar de Nacimiento" placeholder="Ingrese Lugar de Nacimiento" />
            <s:textfield label="Telefono" name="personal.telefono" title="Telefono" placeholder="Ingrese Telefono" />
            <s:textfield label="Correo" name="personal.correo" title="Correo Electronico" placeholder="Ingrese Correo Electronico" />
            <s:textfield label="Celular" name="personal.celular" title="Celular" placeholder="Ingrese Celular" />
            <s:textfield label="Cod Colegio" name="personal.codColegio" title="Codigo de Colegio" placeholder="Ingrese Cod Colegio" />
            <s:textfield label="Cargo" name="personal.cargo" title="Cargo" placeholder="Ingrese Cargo" />
            <s:textfield label="Estado" name="personal.estado" title="Estado" placeholder="Ingrese Estado" />
            <s:textfield label="Usuario" name="personal.usuario" title="Usuario" placeholder="Ingrese Usuario" />
            <s:textfield label="Contraseña" name="personal.password" title="Contraseña" placeholder="Ingrese Contraseña" />

            <s:submit value="Guardar" cssClass="btn btn-success" />
        </s:form>

        <br />
        <br />
        <br />
    </body>
</html>