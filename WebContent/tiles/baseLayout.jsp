<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>

    </head>
    <body>
        <tiles:insertAttribute name="header" />
        <tiles:insertAttribute name="portada" />
        
        <div class="container">
            <div class="row">
                <div class="span10">
                    <tiles:insertAttribute name="opcion" />
                    <tiles:insertAttribute name="body" />
                </div>
                
                
            </div>
        </div>
        <tiles:insertAttribute name="footer" />
    </body>
</html>