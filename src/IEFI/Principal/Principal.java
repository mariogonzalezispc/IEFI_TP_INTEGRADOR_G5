package IEFI.Principal;
//import java.sql.*;
import IEFI.Conector.*;
import java.util.Scanner;

//import Conector.Conectar_bd;

public class Principal {
    public static void main(String[] args) throws Exception {
        Conectar_bd C1=new Conectar_bd();
        C1.setConecto("15");



        
        System.out.println("carga direccion  "+C1.getConecto());


        try {
            int accion;
            boolean salir=false;
     
     
            while (salir==false) {
     
            Scanner opcion = new Scanner(System.in);
            accion=opcion.nextInt();
     //----------------------------------------------------------------------
     //Switch para decidir la operacion del usuario
     //----------------------------------------------------------------------
            switch(accion) {
     //---------------------------------------------------------------------- 
                    case 1:
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
                    System.out.println("Registar alumnos");
                    break;
     //-------------------------------------------------------------------------
                    case 6:
                    System.out.println("Modificar registro de alumno");
                    break;
     //---------------------------------------------------------------------- 
                    case 7:
                    System.out.println("Eliminar registr de alumno");
                    break;
     //---------------------------------------------------------------------- 
                    case 8:
                    System.out.println("Habitación 8");
                    break;
     //---------------------------------------------------------------------- 
                    case 9:
                    System.out.println("Fin de programa");
                    opcion.close();
                    salir=true;
                    break;
     //----------------------------------------------------------------------                 
                    default:
                    System.out.println("Defecto");
            }
        }
         } catch (Exception e) {}
    }
}
