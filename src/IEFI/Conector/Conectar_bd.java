package IEFI.Conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class Conectar_bd {
//---------------------------------------
//Atributos
//---------------------------------------
 String conecto;
 String url=( "jdbc:mysql://localhost:3306/iefi_programacion_1");
 String usuario=("root");
 String clave=("1234");
Connection con;
//---------------------------------------
//Constructor
//--------------------------------------
    public Conectar_bd(){
        //Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(this.url, this.usuario, this.clave);
            System.out.println("Conexion con la base de datos Exitosa");
        } catch (Exception e) {
            System.out.println("No conecta");
        }
    }
//---------------------------------------
//metodo retorno de conection
//---------------------------------------
    public Connection getConnection(){
        return con;
    }
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
        conecto=('"'+url+'"'+','+'"'+usuario+'"'+','+'"'+clave+'"');
              return conecto;
    }

//-----------------------------------------------
//Busqueda
//-----------------------------------------------
}