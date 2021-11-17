
package IEFI.Principal;

import IEFI.Conector.*;
import java.util.Scanner;



public class Principal {
    public static void main(String[] args) throws Exception {
        int accion=0;
        Conectar_bd C1=new Conectar_bd();
        C1.setUrl("jdbc:mysql://localhost:3306/iefi_programacion_1");//url de la base de datos
        C1.setUsuario("root");//usuario de la base de datos
        C1.setClave("1234");//clave de la base de datos
        
   
     //---------------------------------------------------------------------- 
        try {
            boolean salir=false;//declaro variable boleana para el while
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
                    System.out.println("Conexion : "+C1.getConecto());
                    Thread.sleep(2000);
                    //   System.out.println("Conectandose"); 
                    //   System.out.println("");          
                    //   st=cn.con.createStatement();//esto genera la conexion con la BD IEFI_programacion_1
                    //   System.out.println(""); 
                    System.out.println("Opcion 1"); 
                    break;
     //---------------------------------------------------------------------- 
                    case 2:
                    System.out.println("Opcion 2"); 
                    break;
     //---------------------------------------------------------------------- 
                    case 3:
                    System.out.println("Opcion 3");             
                    break;
     //----------------------------------------------------------------------              
                    case 4:
                    System.out.println("Opcion 4"); 
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
