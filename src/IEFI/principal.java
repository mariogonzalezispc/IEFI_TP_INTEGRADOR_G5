package IEFI;

import java.util.Scanner;
import IEFI.Conectar;
import IEFI.Limpia;
import java.sql.*;
import java.lang.ProcessBuilder;

import java.io.IOException;



public class principal {
    public static void main(String[] args) {
    //System.out.println("Hola Mundo!");      
       Conectar cn=new Conectar();//Instancia el objeto conectar
       Limpia cls=new Limpia();
       Statement st;
       ResultSet rs;
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

               System.out.println("Conectandose"); 
               System.out.println("");          
               st=cn.con.createStatement();//esto genera la conexion con la BD IEFI_programacion_1
               System.out.println(""); 

               break;
//---------------------------------------------------------------------- 
               case 2:
               cn.con.close();
               System.out.println("Desconectadose");
               break;
//---------------------------------------------------------------------- 
               case 3:
               System.out.println("Consulta general");
               st=cn.con.createStatement();//esto genera la conexion con la BD IEFI_programacion_1
               rs=st.executeQuery("SELECT * FROM alumnos");
               while(rs.next()){
                System.out.println(rs.getString("nombre") + " " + rs.getString("apellido") + " " + rs.getString("DNI") + " " );
                 }               
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
               System.out.print("Everything on the console will cleared");
               System.out.print("\033[H\033[2J");
               System.out.flush();
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


