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


        <h1>Lista de Protocolos</h1>
        <br>

        <table class="table table-striped">
            <tr>

                <th>Nombre</th>
                <th style="width: 80px">Precio</th>
                

            </tr>
            <s:iterator value="lista">
                <tr>

                    <td><s:property value="nomexamen" /></td>
                    <td><s:property value="precio" /></td>


                   
            </s:iterator>

        </table>
    </body>
</html>
