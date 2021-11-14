

import java.util.Scanner;



public class principal {
    public static void main(String[] args) {

       //System.out.println("Hola Mundo!");
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
               System.out.println("Conectandose");
               break;
//---------------------------------------------------------------------- 
               case 2:
               System.out.println("Desconectadose");
               break;
//---------------------------------------------------------------------- 
               case 3:
               System.out.println("Consulta general");
               break;
//----------------------------------------------------------------------              
               case 4:
               System.out.println("Consulta especifica");
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
















   
    }
}

