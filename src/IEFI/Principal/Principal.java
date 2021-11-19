
package IEFI.Principal;

import IEFI.Conector.*;
import IEFI.Consultas.*;
import IEFI.Insertar.*;
//import java.sql.*;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) throws Exception {
        int accion=0;//variable para el switch
        Class.forName("com.mysql.jdbc.Driver");//cargo driver de java para mysql
        LimpiarPantalla();//clase que limpia la pantalla
        CabeceraDoc();//clase que imprime la cabecera del documento
        Thread.sleep(4000);//espero 4 segundos
        LimpiarPantalla();//clase que limpia la pantalla
        Opciones();//clase que imprime las opciones del menu   
    //---------------------------------------------------------------------- 
        try {
            boolean salir=false;//declaro variable boleana para el while Switch
            //boolean salir1=false;//declaro variable boleana para el while opcion3
            boolean salir2=false;//declaro variable boleana para el while opcion4
            boolean salir3=false;//declaro variable boleana para el while opcion5
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
            switch(accion) {
     //---------------------------------------------------------------------- 
                    case 1://generar una conexion
                    //Opciones();
                    Conectar_bd c1=new Conectar_bd(accion);
                    Thread.sleep(2000);
                    LimpiarPantalla();//clase que limpia la pantalla
                    Opciones();

                    break;
     //---------------------------------------------------------------------- 
                    case 2:
                    LimpiarPantalla();//clase que limpia la pantalla
                    System.out.println("=================================================");                    
                    System.out.println("|   Listado de alumnos Grupo 5 ISPC             |");
                    System.out.println("=================================================");
                    System.out.println("");
                    Consultas muestra=new Consultas();
                    muestra.mostrarDatos(accion);
                    break;
     //---------------------------------------------------------------------- 
                    case 3:
                    LimpiarPantalla();//clase que limpia la pantalla
                    System.out.println("=================================================");                    
                    System.out.println("|   Carga nuevo alumno Grupo 5 ISPC             |");
                    System.out.println("=================================================");
                    System.out.println("");



                    String ape="";
                    String nom="";
                    int dni=0;
                    /*System.out.println("Ingrese apellido del alumno\n");
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
                                    }  */
                                        Insertar I1=new Insertar(nom, ape, dni);
                                          //I1.insertarDatos(accion); 
                                          I1.insertarDatos(accion); 
                                          //salir1=false;
                    break;
     //----------------------------------------------------------------------              
                    case 4:
                    LimpiarPantalla();//clase que limpia la pantalla
                    System.out.println("=================================================");                    
                    System.out.println("|   Modificar DNI de alumno Grupo 5 ISPC        |");
                    System.out.println("=================================================");
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
                                    } catch(Exception e) {//se da la exeption si se ingresa caracteres no permitidos
                                    System.out.println("ERROR: ingrese solo numeros");}
                                }     






                    Insertar I2=new Insertar(nom, ape, dni);                    
                    I2.modificarDatos(accion);
                    salir2=false;
                    break;
     //-----------------------------------------------------------------------
                    case 5:
                    LimpiarPantalla();//clase que limpia la pantalla
                    System.out.println("=================================================");                    
                    System.out.println("|   Eliminar registro alumno                    |");
                    System.out.println("=================================================");
                    System.out.println("");
                    ape="";
                    nom="";  
                    dni=0;
                    System.out.println("Ingrese apellido del alumno\n");
                    Scanner a3 = new Scanner(System.in);//capturo el valor ingresado por el usuario
                        ape=a3.next();//metodo scanner captura dato ingresado 
                        System.out.println("Ingrese nombre del alumno\n");
                    Scanner n3 = new Scanner(System.in);//capturo el valor ingresado por el usuario
                        nom=n3.next();//metodo scanner captura dato ingresado

                                
                    Insertar I3=new Insertar(nom, ape, dni);
                    I3.eliminarDatos(accion);
                    salir2=false;
                   
                   
                   
                   
                    break;
     //---------------------------------------------------------------------- 
                    case 9://sale del programa
                    System.out.println("");//espacio en blanco
                    System.out.println("    Fin de programa      ");//Fin del programa
                    System.out.println("");//espacio en blanco
                        opcion.close();//cierra scanner
                        salir=true;// sale del while
                    break;
    //---------------------------------------------------------------------- 
                    case 0://sale del programa
                    LimpiarPantalla();//clase que limpia la pantalla
                    Opciones();//llama a la funcion que muestra las opciones            
                    salir=false;// sale del while
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

    //--------------------------------------------------------------------------------------
//Void de ayuda al programa principal 
//--------------------------------------------------------------------------------------
    public static void LimpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } catch (Exception e) {
            System.out.println(e);
        }
    }
//--------------------------------------------------------------------------------------
        public static void CabeceraDoc() {
            DateTimeFormatter cfecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter chora = DateTimeFormatter.ofPattern("HH:mm");
            String cmotivo="IEFI_Programacion_1";
            String institucion="| Institucion : ISPC  Materia : Programacion 1 JAVA";
            String total="| Aula  3  Grupo 5  :  Ejercicio : "+cmotivo+" |";
            String Abril=("| Integrantes :  Clavaguera, Abril");
            String Laura=("|                Heredia, Laura ");
            String Monica=("|                Zapata, Monica ");
            String Gaston=("|                Ferreyra, Gaston ");
            String Mario=("|                Gonzalez, Mario ");
            

                try {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } catch (Exception e) {
                }
                for (int x=0; x<total.length(); x++) {
                    System.out.print("=");           
                }          
        System.out.println();
        System.out.println("| Cordoba Argentina - Fecha : "+cfecha.format(LocalDateTime.now())+ "  Hora : "+chora.format(LocalDateTime.now())+" |");
        System.out.print(institucion);
        Relleno(total, institucion);
        System.out.println(total);
        System.out.print(Abril);
        Relleno(total, Abril);
        System.out.print(Laura);
        Relleno(total, Laura);        
        System.out.print(Monica);
        Relleno(total, Monica);
        System.out.print(Gaston);
        Relleno(total, Gaston);       
        System.out.print(Mario);
        Relleno(total, Mario);

            for (int k=0; k<3; k++) {
            if (k==0) {
                for (int z=0; z<total.length(); z++) {
                    System.out.print("=");           
                }
            }
            System.out.println(); 
        }
}
//--------------------------------------------------------------------------------------
    public static void Relleno(String t1, String t2){
        for (int z=0; z<t1.length(); z++) {
            if (z!=t1.length()-t2.length()-1) {
                System.out.print(" ");
                }else{
                System.out.println("|");
                t1="";
                t2="";
                break;                          
            }      
        } 
    }
//--------------------------------------------------------------------------------------
    public static void Opciones(){

        int ancho=98;
        String opcion1="|   Conectar con base de datos presione :  1    |";
        String opcion2="|   Listar registro alumnos    presione :  2    |";
        String opcion3="|   Insertar registro alumnos  presione :  3    |";
        String opcion4="|   Modificar registro alumnos presione :  4    |";
        String opcion5="|   Eliminar registro alumno   presione :  5    |";
        String opcion6="|   Salir del programa         presione :  9    |";
        String opcion7="|   Ayuda                      presione :  0    |";

        for (int x=0; x<ancho; x++) {
            if(ancho==0){
                break;  
            }else{
                System.out.print("=");
                ancho--;    
            }          
        } 
        System.out.println("");
        System.out.println(opcion1);
        System.out.println(opcion2);
        System.out.println(opcion3);
        System.out.println(opcion4);
        System.out.println(opcion5);
        System.out.println(opcion6);
        System.out.println(opcion7);
        

        ancho=98;
        for (int z=0; z<ancho; z++) {

            if(ancho==0){
                break;  
            }else{
                System.out.print("=");
                ancho--;    
            }          
        }
        System.out.println("");
        System.out.println("");
        System.out.print("    Ingrese opcion >>>>>>>>  : ");


        










 
    }   












//--------------------------------------------------------------------------------------
//finde clase
//--------------------------------------------------------------------------------------
}
