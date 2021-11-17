package IEFI.Conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class Conectar_bd {
//---------------------------------------
//Atributos
//---------------------------------------
private String conecto;
private String url;
private String usuario;
private String clave;

//---------------------------------------
//Constructor
//--------------------------------------


//---------------------------------------
//metodo Setter para guardar url
//---------------------------------------
    public void setUrl(String url){
        this.url=url;
    }   
//---------------------------------------
//metodo Setter para guardar usuario
//---------------------------------------
    public void setUsuario(String usuario){
    this.usuario=usuario;
    }   
//---------------------------------------
//metodo Setter para guardar clave
//---------------------------------------
    public void setClave(String clave){
    this.clave=clave;
    }   







//---------------------------------------
//metodo Getter recuperar la conexion
//---------------------------------------
    public String getConecto(){
        conecto=url+","+usuario+","+clave;
              return conecto;
    }

}