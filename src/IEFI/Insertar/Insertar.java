package IEFI.Insertar;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.*;
import IEFI.Conector.*;

public class Insertar {

//-----------------------------------------------
//Atributos
//-----------------------------------------------
String nombre;
String apellido;
int dni;    
//-----------------------------------------------
//Constructor
//-----------------------------------------------
public Insertar(String nombre,String apellido,int dni){
     this.nombre=nombre;
     this.apellido=apellido;
     this.dni=dni;
}


//-----------------------------------------------
//Insertar un registro nuevo
//-----------------------------------------------
public void insertarDatos(int accion) throws SQLException{
    Conectar_bd c2=new Conectar_bd(accion);
    String sql="INSERT INTO `alumnos` (`id_alumno`,`nombre`,`apellido`,`DNI`)VALUES (NULL, '"+nombre+"', '"+apellido+"','"+dni+"')";


    Connection cn;
    Statement st;
    int r1;

    try{     
        cn=c2.getConnection(); 
        st=cn.createStatement();
        r1=st.executeUpdate(sql);
        }catch (Exception e){
    System.out.println("Error en cargar alumno nuevo");
   }   
}

//-----------------------------------------------
//Insertar un registro nuevo
//-----------------------------------------------
public void modificarDatos(int accion) throws SQLException{



    Conectar_bd c2=new Conectar_bd(accion);
    String sql="UPDATE `alumnos` SET DNI='"+dni+"' WHERE (apellido='"+apellido+"' AND nombre='"+nombre+"')";
    
    Connection cn2;
    Statement st2;
    int r2;

    try{     
        cn2=c2.getConnection(); 
        st2=cn2.createStatement();
        r2=st2.executeUpdate(sql);
        }catch (Exception e){
    System.out.println("Error en cargar alumno nuevo");
   }   
}



















}
