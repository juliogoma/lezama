<link href="css/bootstrap-responsive.css" rel="stylesheet">
<%@taglib uri="/struts-tags" prefix="s" %>
<div class="row">
    <div class="span12">
        <div align="center">
            <div align="center"> 
                <h2 class="text-success">Iniciar Sesión</h2>
                <br>
                <s:form action="login" >
                    <s:textfield label="Usuario   " name="userId" placeholder="Ingrese Usuario" title="Nombre de usuario"/>
                    <s:password label="Contraseña   " name="password" placeholder="Ingrese Contraseña" title="Contrasena"/>
                    <s:submit value="entrar" cssClass="btn btn-success"/>
                </s:form>
            </div> 
        </div>
    </div>
</div>
