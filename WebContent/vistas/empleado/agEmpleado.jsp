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
        <s:form action="agregarEmpleado" cssClass="well">
            <s:hidden label="id" name="personal.id" />
            <span class="label">Fecha de Nacimiento:</span> &nbsp<input type="date" name="empleado.fechaNac" title="Fecha de Nacimiento"><br/>
            <span class="label">Fecha de Contrato:</span> &nbsp<input type="date" name="empleado.fechContrato" title="Fecha de Contrato">
            <s:textfield label="DNI" name="empleado.dni" title="Ingrese DNI" placeholder="Ingrese DNI" />
            <s:textfield label="Nombre" name="empleado.nombre" title="Nombre" placeholder="Ingrese Nombre" />
            <s:textfield label="Apellido Paterno" name="empleado.apePaterno" title="Apellido Paterno" placeholder="Ingrese Apellido Paterno" />
            <s:textfield label="Apellido Materno" name="empleado.apeMaterno" title="Apellido Materno" placeholder="Ingrese Apellido Materno" />
            <s:select label="Sexo" class="span3"name="empleado.sexo" title="Seleccione su Sexo" headerValue="-----Seleccione Sexo -----"  headerKey="1" list="{'Masculino','Femenino'}" />  
            <s:select label="Estado Civil" class="span3" name="empleado.estadoCivil"  title="Estado Civil" headerValue="--- Estado Civil ---"  headerKey="1" list="{'Soltero','Casado','Viudo','Divorciado','Otro'}" />  
            <s:textfield label="Lugar de Nacimiento" name="empleado.lugarNac" title="Lugar de Nacimiento" placeholder="Ingrese Lugar de Nacimiento" />
            <s:textfield label="Telefono" name="empleado.telefono" title="Telefono" placeholder="Ingrese Telefono" />
            <s:textfield label="Correo" name="empleado.correo" title="Correo Electronico" placeholder="Ingrese Correo Electronico" />
            <s:textfield label="Celular" name="empleado.celular" title="Celular" placeholder="Ingrese Celular" />
            <s:textfield label="Puesto" name="empleado.puesto" title="Celular" placeholder="Ingrese Puesto" />
            <s:select label="Empresa" list="#session.listaempresa" title="Empresa de procedencia" name="empleado.empresa.id" listKey="id" listValue="razsocial"/>
            
            <s:submit value="Guardar" cssClass="btn btn-success" />
        </s:form>

        <br />
        <br />
        <br />
    </body>
</html>