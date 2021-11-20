package IEFI.Insertar;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;

public class Insertar {//clase insertar 
//-----------------------------------------------
//Atributos
//-----------------------------------------------
String nombre;//nombre de la persona
String apellido;//apellido de la persona
int dni;  //dni de la persona
//-----------------------------------------------
//Constructor
//-----------------------------------------------
public Insertar(){//constructor
}
//-----------------------------------------------
//listado general
//-----------------------------------------------
public void mostrarDatos() {//metodo mostrar datos
    Connection cn;//conexion
    Statement st;//sentencia
    ResultSet r1;//resultado
    String url=( "jdbc:mysql://localhost:3306/iefi_programacion_1");//declaro variable de url
    String usuario=("root");//declaro variable de usuario
    String clave=("1234");//declaro variable de clave
        try{//inicio try
            cn = DriverManager.getConnection(url,usuario,clave);//creo la conexion
            String sql="SELECT * FROM `alumnos` WHERE 1";//declaro variable de consulta
            st=cn.createStatement();//creo la sentencia
            r1=st.executeQuery(sql);//ejecuto la consulta
//-----------------------------------------------
       while(r1.next()){//
           System.out.println(r1.getString("apellido") + " " + r1.getString("nombre") + " " + r1.getInt("DNI"));//
       }
       System.out.println("");//salto de linea
       System.out.print("Presione cero para volver al menu >> : ");
        }catch (Exception e){
            System.out.println("No hay conexion con base de datos !!!!!!");//mensaje de error         
            System.out.println("Error en listar alumnos");//
            System.out.println("");//salto de linea
            System.out.print("Presione cero para volver al menu >> : ");//mensaje de error
   }    
} 
//-----------------------------------------------






//-----------------------------------------------
//Insertar un registro nuevo
//-----------------------------------------------
public void modificarDatos() {//metodo modificarDatos
    boolean salir2=false;//declaro variable boleana para el while opcion3
    Connection cn;//declaro variable de conexion
    Statement st;//declaro variable de sentencia
    int r1;//declaro variable de resultado
    String url=( "jdbc:mysql://localhost:3306/iefi_programacion_1");//declaro variable de url
    String usuario=("root");//declaro variable de usuario
    String clave=("1234");//declaro variable de clave
        try{//inicio try
            cn = DriverManager.getConnection(url,usuario,clave);//creo la conexion
            System.out.println("Ingrese apellido del alumno\n");//pido el apellido
                Scanner a2 = new Scanner(System.in);//capturo el valor ingresado por el usuario
                    apellido=a2.next();//metodo scanner captura dato ingresado 
                    System.out.println("Ingrese nombre del alumno\n");//pido el nombre 
                Scanner n2 = new Scanner(System.in);//capturo el valor ingresado por el usuario
                    nombre=n2.next();//metodo scanner captura dato ingresado
                    System.out.println("Ingrese documento del alumno\n");//pido el dni
                while (salir2==false) {//inicio while opcion3
                    Scanner d2 = new Scanner(System.in);//capturo el valor ingresado por el usuario                       
                        try {//try que restringe errores de ingreso de opcion 
                            dni=d2.nextInt();//metodo scanner captura dato ingresado solo si es entero
                            salir2=true;//cambio el valor de la variable boleana para salir del while
                            } catch(Exception e) {//se da la exeption si se ingresa caracteres no permitidos
                            System.out.println("ERROR: ingrese solo numeros");}//mensaje de error
                        }  
                        String sql="UPDATE `alumnos` SET DNI='"+dni+"' WHERE (apellido='"+apellido+"' AND nombre='"+nombre+"')";                       
        st=cn.createStatement();//creo la sentencia
        r1=st.executeUpdate(sql);//ejecuto la sentencia
        System.out.println(" ");//espacio
        System.out.println("Modificacion de datos exitosa");//mensaje de exito 
        System.out.println("");//espacio
        System.out.print("Presione cero para volver al menu >> : ");//pregunta de volver al menu
        }catch (Exception e){//se da la exeption si no se puede conectar a la base de datos
            System.out.println("No hay conexion con base de datos !!!!!!");//mensaje de error        
            System.out.println("Error en modificacion registro alumno");//mensaje de error
            System.out.println("");//espacio
            System.out.print("Presione cero para volver al menu >> : ");//pregunta de volver al menu
   }   
}
//-----------------------------------------------
//Eliminar un registro
//-----------------------------------------------
public void eliminarDatos() {
    Connection cn;
    Statement st;
    int r1;
    String url=( "jdbc:mysql://localhost:3306/iefi_programacion_1");
    String usuario=("root");
    String clave=("1234");
        try{
            cn = DriverManager.getConnection(url,usuario,clave); 
            System.out.println("Ingrese apellido del alumno\n");
                Scanner a3 = new Scanner(System.in);//capturo el valor ingresado por el usuario
                    apellido=a3.next();//metodo scanner captura dato ingresado 
                    System.out.println("Ingrese nombre del alumno\n");
                Scanner n3 = new Scanner(System.in);//capturo el valor ingresado por el usuario
                    nombre=n3.next();//metodo scanner captura dato ingresado
                    String sql="DELETE FROM `alumnos` WHERE (apellido='"+apellido+"' AND nombre='"+nombre+"')";
        st=cn.createStatement();
        r1=st.executeUpdate(sql);
        System.out.println("Borrado de registro exitoso"); 
        System.out.println("");
        System.out.print("Presione cero para volver al menu >> : ");
        }catch (Exception e){
            System.out.println("No hay conexion con base de datos !!!!!!");        
            System.out.println("Error en borrar registro alumno");
            System.out.println("");
            System.out.print("Presione cero para volver al menu >> : ");
   }   
}
//-----------------------------------------------
//Insertar un registro nuevo
//-----------------------------------------------
public void insertarDatos(){
    boolean salir1=false;//declaro variable boleana para el while opcion3
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
                    apellido=a1.next();//metodo scanner captura dato ingresado
                    System.out.println("Ingrese nombre del alumno\n");
            Scanner n1 = new Scanner(System.in);//capturo el valor ingresado por el usuario
                    nombre=n1.next();//metodo scanner captura dato ingresado
                    System.out.println("Ingrese documento del alumno\n");
                    while (salir1==false) {
                        Scanner d1 = new Scanner(System.in);//capturo el valor ingresado por el usuario                       
                            try {//try que restringe errores de ingreso de opcion 
                                dni=d1.nextInt();//metodo scanner captura dato ingresado solo si es entero
                                salir1=true;
                                } catch(Exception e) {//se da la exeption si se ingresa caracteres no permitidos
                                    System.out.println("ERROR: ingrese solo numeros");}
                                }  
String sql="INSERT INTO `alumnos` (`id_alumno`,`nombre`,`apellido`,`DNI`)VALUES (NULL, '"+nombre+"', '"+apellido+"','"+dni+"')";
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
//Fin de la clase
//-----------------------------------------------
}
