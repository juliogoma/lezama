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

                <th>Razon Social</th>
                <th style="width: 10px">RUC</th>
                <th>Gerencia</th>
                <th>Division</th>
                <th>Area</th>
                <th>Ubicacion</th>
                <th>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
                
                

            </tr>
            <s:iterator value="lista">
                <tr>

                    <td><s:property value="razsocial" /></td>
                    <td><s:property value="ruc" /></td>
                    <td><s:property value="gerencia" /></td>
                    <td><s:property value="division" /></td>
                    <td><s:property value="area" /></td>
                    <td><s:property value="ubicacion" /></td>
                    <td>
				<s:url id="url" action="modificarempresa">
						<s:param name="id" value="id" />
				</s:url> 
				 
				<s:a cssClass="btn btn-mini bnt-link" href="%{url}"><i class="icon-edit icon-black"></i></s:a>
					 
					
					<s:url id="url" action="eliminarEmpresa"> 
						<s:param name="id" value="id" />
					</s:url> 
					
					<s:a cssClass="btn btn-mini btn-inverse" href="%{url}"><i class="icon-trash icon-white"></i></s:a>


                   
            </s:iterator>

        </table>
    </body>
</html>
