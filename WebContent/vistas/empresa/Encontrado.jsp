<%-- 
    Document   : ListarProducto
    Created on : 11-feb-2012, 0:13:39
    Author     : Oscar
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


	<h1>Lenguaje Encontrado</h1>
	<br>

	<table class="table table-striped">
		<tr>

			
                <th>Razon Social</th>
                <th style="width: 10px">RUC</th>
                <th>Gerencia</th>
                <th>Division</th>
                <th>Area</th>
                <th>Ubicacion</th>
                <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
                
                
		</tr>
		<tr>
		<td><s:property value="empresa.razsocial" /></td>
                    <td><s:property value="empresa.ruc" /></td>
                    <td><s:property value="empresa.gerencia" /></td>
                    <td><s:property value="empresa.division" /></td>
                    <td><s:property value="empresa.area" /></td>
                    <td><s:property value="empresa.ubicacion" /></td>
               
				

				<td>
				<s:url id="url" action="modificarempresa">
						<s:param name="id" value="id" />
				</s:url> 
				 
				<s:a cssClass="btn btn-mini bnt-link" href="%{url}"><i class="icon-edit icon-black"></i></s:a>
					 
					
					<s:url id="url" action="eliminarEmpresa"> 
						<s:param name="id" value="id" />
					</s:url> 
					
					<s:a cssClass="btn btn-mini btn-inverse" href="%{url}"><i class="icon-trash icon-white"></i></s:a>

     </tr>
	</table>
</body>
</html>
