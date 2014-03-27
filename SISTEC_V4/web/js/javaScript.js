
var swBDROl = false;

function mostrarRol() {
    var idBuscarRol = document.getElementById("divBuscarRol");
    var idRegisRol = document.getElementById("divRegistroRol");
    if (idBuscarRol.style.display == 'none') {
        idBuscarRol.style.display = 'blok';
        idRegisRol.style.display = 'none';
    } else {
        idBuscarRol.style.display = 'none';
        idRegisRol.style.display = 'block';
    }
}
/*Conexion*/
function conexion() {
    var xmlHttpReq = false;
    // to create XMLHttpRequest object in non-Microsoft browsers
    if (window.XMLHttpRequest) {
        xmlHttpReq = new XMLHttpRequest();
    } else if (window.ActiveXObject) {
        try {
            // to create XMLHttpRequest object in later versions
            // of Internet Explorer
            xmlHttpReq = new ActiveXObject("Msxml2.XMLHTTP");
        } catch (exp1) {
            try {
                // to create XMLHttpRequest object in older versions
                // of Internet Explorer
                xmlHttpReq = new ActiveXObject("Microsoft.XMLHTTP");
            } catch (exp2) {
                xmlHttpReq = false;
            }
        }
    }
    return xmlHttpReq;
}

conexion.sendResquest = function(con,action,callback) {
    var requestHttp = con;
    requestHttp.open("POST", con.endPointUrl + action=='' ? '' : "?accion="+action , true);
    requestHttp.setRequestHeader("Contet-Type","text/xml");
    requestHttp.setRequestHeader("accion","urn:"+con.endPointUrl);
    requestHttp.onreadystatechange = function() {
        if (requestHttp.readyState == 4 && requestHttp.status == 200) {
            con.doneMethod(con,requestHttp,action,callback);
        }
    }
    requestHttp.send(action);
}

function EditarRol(id) {
    alert(id);
}

function EliminarRol(id) {
    alert(id);
}
function listar(object) {

}

/**************** ROl **************/
function ROLservlet(){}

ROLservlet.conexion =  function(){
    var con = new conexion();
    con.endPointUrl = "../ServletRol";
    con.doneMethod = ROLservlet._endRequest;
    return con;
}

ROLservlet.getRol = function(zipcode, callback){
    try{
        conexion.sendResquest(ROLservlet.conexion,"inicio",callback);
    }catch (ex){callback(new MBFault());}
} 

ROLservlet._endRequest = function(con,xhr,action,callback){
    var xml = xhr.responseXML;
    
} 

function MBFault(root){
    this.result = null;
    this.message = null;
    this.code = 0;
}
