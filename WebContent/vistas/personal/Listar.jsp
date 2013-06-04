<%-- 
   
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib uri="/struts-jquery-tags" prefix="sj"%>

<!DOCTYPE html>
<html>
    <head>
        <sj:head jqueryui="true" jquerytheme="ui-darkness" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>


        <h1>Lista de Empresas</h1>
        <br>

        <table class="table table-striped">
            <tr>

                <th>DNI</th>
                <th>Nombre</th>
                <th>Apellido Paterno</th>
                <th>Apellido Materno</th>
                <th>Sexo</th>
                <th>Estado Civil</th>
                <th>Fecha Nacimiento</th>
                <th>Lugar Nacimiento</th>
                <th>Telefono</th>
                <th>Correo</th>
                <th>Celular</th>
                <th>Cod Colegio</th>
                <th>Cargo</th>
                <th>Estado</th>
                <th>Fecha Contrato</th>
                <th>Usuario</th>
                <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
                
                

            </tr>
            <s:iterator value="lista">
                <tr>

                    <td><s:property value="dni" /></td>
                    <td><s:property value="nombre" /></td>
                    <td><s:property value="apePaterno" /></td>
                    <td><s:property value="apeMaterno" /></td>
                    <td><s:property value="sexo" /></td>
                    <td><s:property value="estadoCivil" /></td>
                    <td><s:property value="fechaNac" /></td>
                    <td><s:property value="lugarNac" /></td>
                    <td><s:property value="telefono" /></td>
                    <td><s:property value="correo" /></td>
                    <td><s:property value="celular" /></td>
                    <td><s:property value="codColegio" /></td>
                    <td><s:property value="cargo" /></td>
                    <td><s:property value="estado" /></td>
                    <td><s:property value="fechContrato" /></td>
                    <td><s:property value="usuario" /></td>
                    <td>
				<s:url id="url" action="">
						<s:param name="id" value="id" />
				</s:url> 
				 
				<s:a cssClass="btn btn-mini bnt-link" href="%{url}"><i class="icon-edit icon-black"></i></s:a>
					 
					
					<s:url id="url" action=""> 
						<s:param name="id" value="id" />
					</s:url> 
					
					<s:a cssClass="btn btn-mini btn-inverse" href="%{url}"><i class="icon-trash icon-white"></i></s:a>


                   
            </s:iterator>

        </table>
    </body>
</html>
