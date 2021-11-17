
package IEFI.Principal;

import IEFI.Conector.*;
import java.util.Scanner;



public class Principal {
    public static void main(String[] args) throws Exception {
        Conectar_bd C1=new Conectar_bd();
        C1.setUrl("jdbc:mysql://localhost:3306/iefi_programacion_1");//url de la base de datos
        C1.setUsuario("root");//usuario de la base de datos
        C1.setClave("1234");//clave de la base de datos
        
        //System.out.println("Conexion : "+C1.getConecto());

        try {
            int accion;//declaro variable para el switch
            boolean salir=false;//declaro variable para el while
            while (salir==false) {//verifico si entro o no al while
            Scanner opcion = new Scanner(System.in);//capturo el valor ingresado por el usuario
            accion=opcion.nextInt();
     //----------------------------------------------------------------------
     //Switch para decidir el valor ingresado por el usuario
     //----------------------------------------------------------------------
            switch(accion) {
     //---------------------------------------------------------------------- 
                    case 1:
                    System.out.println("Conexion : "+C1.getConecto());
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
                    default:
                    System.out.println("Defecto");
            }
        }
         } catch (Exception e) {

         }
    }
}
