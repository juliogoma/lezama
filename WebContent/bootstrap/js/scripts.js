function js_EmpChg(){
    var jsEmpChgPag = document.getElementById("jsEmpChgPag");
    var vcombo = jsEmpChgPag.value;
    window.location = "index.jsp?numpag="+vcombo;
}

function js_EmpIns(){
    if(confirm("¿Nuevo Registro?")){
        window.location = "empIns.jsp";
    }
}

function js_EmpDel(){
    if(confirm("¿Retirar?")) {
        var jsEmpDel = document.getElementsByName("jsEmpDel");
        var ids = "";
        for(var i=0; i<jsEmpDel.length; ++i) {
            if(jsEmpDel[i].checked) {
                ids += jsEmpDel[i].value + ",";
            }
        }

        if(ids == "") {
            alert("Debe seleccionar filas a retirar!");
        } else {
            ids = ids.substring(0, ids.length - 1);
            window.location = "Empleado?accion=DELEMP&ids="+ids;
        }
    }
}

function js_EmpUpd(){
    if(confirm("¿Actualizar?")) {
        var jsEmpUpd = document.getElementsByName("jsEmpUpd");
        var id = "";
        for(var i=0; i<jsEmpUpd.length; ++i) {
            if(jsEmpUpd[i].checked) {
                id = jsEmpUpd[i].value;
                break;
            }
        }

        if(id == "") {
            alert("Debe seleccionar fila para actualizar!");
        } else {
            window.location = "empUpd.jsp?id="+id;
        }
    }
}
