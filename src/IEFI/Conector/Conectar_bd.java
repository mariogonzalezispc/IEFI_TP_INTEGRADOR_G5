package IEFI.Conector;

import java.sql.*;
import java.sql.DriverManager;

public class Conectar_bd {
//---------------------------------------
//Atributos
//---------------------------------------
 private String conecto;
 //private String url=( "jdbc:mysql://localhost:3306/iefi_programacion_1");
 private String url=( "jdbc:mysql://localhost:3306/iefi_programacion_1");
 private String usuario=("root");
 private String clave=("1234");
 int tipo;
Connection con;
//---------------------------------------
//Constructor
//--------------------------------------
 public Conectar_bd(int accion){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(this.url, this.usuario, this.clave);
            //con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/iefi_programacion_1","root","1234");
            if(accion==1){
            System.out.println("Conexion con la base de datos Exitosa");
            }
        } catch (Exception e) {
            System.out.println("No hay conexion con base de datos !!!!!!");
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