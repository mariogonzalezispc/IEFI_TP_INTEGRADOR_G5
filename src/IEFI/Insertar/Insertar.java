package IEFI.Insertar;

import java.sql.Connection;
import java.sql.Statement;
import IEFI.Conector.*;
import java.util.Scanner;
import java.sql.*;

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
/*public void insertarDatos(int accion){
    Conectar_bd c2=new Conectar_bd(accion);
    String sql="INSERT INTO `alumnos` (`id_alumno`,`nombre`,`apellido`,`DNI`)VALUES (NULL, '"+nombre+"', '"+apellido+"','"+dni+"')";
    Connection cn;
    Statement st;
    int r1;

    try{ 
        cn=c2.getConnection(); 
        st=cn.createStatement();
        r1=st.executeUpdate(sql);
        System.out.println(" ");
        System.out.println("Carga de datos exitosa"); 
    }catch (Exception e){
    System.out.println("Error en cargar alumno nuevo");
    System.out.println("");
    System.out.print("Presione cero para volver al menu >> : ");
   }   
}*/
//-----------------------------------------------
//Insertar un registro nuevo
//-----------------------------------------------
public void modificarDatos(int accion) {
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





//-----------------------------------------------
//Eliminar un registro
//-----------------------------------------------
public void eliminarDatos(int accion) {
    Conectar_bd c2=new Conectar_bd(accion);
    //String sql="UPDATE `alumnos` SET DNI='"+dni+"' WHERE (apellido='"+apellido+"' AND nombre='"+nombre+"')";
    String sql="DELETE FROM `alumnos` WHERE (apellido='"+apellido+"' AND nombre='"+nombre+"')";
    Connection cn2;
    Statement st2;
    int r2;
    try{     
        cn2=c2.getConnection(); 
        st2=cn2.createStatement();
        r2=st2.executeUpdate(sql);
        }catch (Exception e){
        System.out.println("Error en borrar registro");
   }   
}


//-----------------------------------------------
//Insertar un registro nuevo
//-----------------------------------------------
public void insertarDatos(int accion){
    String ape="";//declaracion de variables ape;
    String nom="";//declaracion de variables nom;
    boolean salir1=false;//declaro variable boleana para el while opcion3
    int dni=0;//declaracion de variable dni
    Connection cn; //declaracion de variable cn
    Statement st;//declaracion de variable st
    int r1;

        String url=( "jdbc:mysql://localhost:3306/iefi_programacion_1");
        String usuario=("root");
        String clave=("1234");
   
        try{
        cn = DriverManager.getConnection(url,usuario,clave);
       System.out.println("Ingrese apellido del alumno\n");
        Scanner a1 = new Scanner(System.in);//capturo el valor ingresado por el usuario
            ape=a1.next();//metodo scanner captura dato ingresado
            System.out.println("Ingrese nombre del alumno\n");
        Scanner n1 = new Scanner(System.in);//capturo el valor ingresado por el usuario
            nom=n1.next();//metodo scanner captura dato ingresado
            System.out.println("Ingrese documento del alumno\n");
                while (salir1==false) {
                Scanner d1 = new Scanner(System.in);//capturo el valor ingresado por el usuario                       
                    try {//try que restringe errores de ingreso de opcion 
                        dni=d1.nextInt();//metodo scanner captura dato ingresado solo si es entero
                        salir1=true;
                        } catch(Exception e) {//se da la exeption si se ingresa caracteres no permitidos
                        System.out.println("ERROR: ingrese solo numeros");}
                        }  
        String sql="INSERT INTO `alumnos` (`id_alumno`,`nombre`,`apellido`,`DNI`)VALUES (NULL, '"+nom+"', '"+ape+"','"+dni+"')";
        //cn=c2.getConnection(); 
        st=cn.createStatement();
        r1=st.executeUpdate(sql);
        System.out.println(" ");
        System.out.println("Carga de datos exitosa"); 
        System.out.println("");
        System.out.print("Presione cero para volver al menu >> : ");
    }catch (Exception e){
        System.out.println("No hay conexion con base de datos !!!!!!");        
        System.out.println("Error en cargar alumno nuevo");
        System.out.println("");
        System.out.print("Presione cero para volver al menu >> : ");
   }   
}
//-----------------------------------------------














//-----------------------------------------------
}
