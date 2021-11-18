
package IEFI.Principal;

import IEFI.Conector.*;
import IEFI.Consultas.*;
import IEFI.Insertar.*;
import java.util.Scanner;



public class Principal {
    public static void main(String[] args) throws Exception {
        int accion=0;//variable para el switch
        Class.forName("com.mysql.jdbc.Driver");//cargo driver de java para mysql
    //---------------------------------------------------------------------- 
       //Conectar_bd c0=new Conectar_bd(accion);
       // c0.setUrl("jdbc:mysql://localhost:3306/iefi_programacion_1");
       // c0.setUrl("jdbc:mysql://localhost:3306/iefi_programacion_1");//url de la base de datos
       // c0.setUsuario("root");//usuario de la base de datos
       // c0.setClave("1234");//clave de la base de datos
     //---------------------------------------------------------------------- 
        try {
            boolean salir=false;//declaro variable boleana para el while Switch
            boolean salir1=false;//declaro variable boleana para el while opcion3
            boolean salir2=false;//declaro variable boleana para el while opcion4
     //----------------------------------------------------------------------      
            while (salir==false) {//verifico si entro o no al while
     //----------------------------------------------------------------------            
            Scanner opcion = new Scanner(System.in);//capturo el valor ingresado por el usuario
                try {//try que restringe errores de ingreso de opcion 
                    accion=opcion.nextInt();//metodo scanner captura dato ingresado solo si es entero
                    } catch(Exception e) {//se da la exeption si se ingresa caracteres no permitidos
                    System.out.println("ERROR: el valor ingresado no es una opcion");
                    accion=0;//restablecemos el valor de la variable a cero para que entre por defecto
                    }
     //----------------------------------------------------------------------
     //Switch para decidir el valor ingresado por el usuario
     //----------------------------------------------------------------------
            switch(accion) 
                {
     //---------------------------------------------------------------------- 
                    case 1://generar una conexion
                    Conectar_bd c1=new Conectar_bd(accion);
                    break;
     //---------------------------------------------------------------------- 
                    case 2:
                    System.out.println("---------------------------------");                    
                    System.out.println("Listado de alumnos Grupo 5 ISPC  ");
                    System.out.println("---------------------------------");
                    System.out.println("");
                    Consultas muestra=new Consultas();
                    muestra.mostrarDatos(accion);
                    break;
     //---------------------------------------------------------------------- 
                    case 3:
                    System.out.println("---------------------------------");                    
                    System.out.println("Cargar nuevo alumno Grupo 5 ISPC");
                    System.out.println("---------------------------------");
                    System.out.println("");
                    String ape="";
                    String nom="";
                    int dni=0;
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
                                    d1.close();
                                    } catch(Exception e) {//se da la exeption si se ingresa caracteres no permitidos
                                    System.out.println("ERROR: ingrese solo numeros");}
                                }        
                    Insertar I1=new Insertar(nom, ape, dni);
                    I1.insertarDatos(accion);
                    salir1=false;
                    a1.close();
                    n1.close();
                    break;
     //----------------------------------------------------------------------              
                    case 4:
                    System.out.println("---------------------------------");                    
                    System.out.println("Modificar DNI");
                    System.out.println("---------------------------------");
                    System.out.println("");
                    ape="";
                    nom="";  
                    dni=0;
                    System.out.println("Ingrese apellido del alumno\n");
                    Scanner a2 = new Scanner(System.in);//capturo el valor ingresado por el usuario
                        ape=a2.next();//metodo scanner captura dato ingresado 

                        System.out.println("Ingrese nombre del alumno\n");
                    Scanner n2 = new Scanner(System.in);//capturo el valor ingresado por el usuario
                        nom=n2.next();//metodo scanner captura dato ingresado

                        
                        System.out.println("Ingrese documento del alumno\n");

                            while (salir2==false) {
                            Scanner d2 = new Scanner(System.in);//capturo el valor ingresado por el usuario                       
                                try {//try que restringe errores de ingreso de opcion 
                                    dni=d2.nextInt();//metodo scanner captura dato ingresado solo si es entero
                                    salir2=true;
                                    d2.close();
                                    } catch(Exception e) {//se da la exeption si se ingresa caracteres no permitidos
                                    System.out.println("ERROR: ingrese solo numeros");}
                                }     

                    Insertar I2=new Insertar(nom, ape, dni);
                    I2.modificarDatos(accion);
                    salir2=false;
                    a2.close();
                    n2.close();
                       // System.out.println("Opcion 4"); 
                    break;
     //-----------------------------------------------------------------------
                    case 5:
                        System.out.println("Opcion 5");
                    break;
     //-------------------------------------------------------------------------
                    case 6:
                        System.out.println("Opcion 6");
                    break;
     //---------------------------------------------------------------------- 
                    case 7:
                        System.out.println("Opcion 7");
                    break;
     //---------------------------------------------------------------------- 
                    case 8:
                        System.out.println("Opcion 8");
                    break;
     //---------------------------------------------------------------------- 
                    case 9://sale del programa
                        System.out.println("Fin de programa");
                        opcion.close();//cierra scanner
                        salir=true;// sale del while
                    break;
     //----------------------------------------------------------------------                 
                    default://cae a default solo si es reiniciado por la exeption 
                        System.out.println("Reintente ingresar opcion");
                    break;                    
                }
        }
         } catch (Exception e) {
            System.out.println(e);
         }
    }

}
