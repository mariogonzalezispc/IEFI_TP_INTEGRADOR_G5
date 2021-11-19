package IEFI.Consultas;

import java.sql.*;
import IEFI.Conector.*;
import java.util.Scanner;



public class Consultas {
    
//-----------------------------------------------
//Atributos
//-----------------------------------------------
    String nombre;
    String apellido;
    int dni;

//-----------------------------------------------
//Constructor
//-----------------------------------------------
    public Consultas(){
            //this.apellido=apellido;
            //this.nombre=nombre;
            //this.dni=dni;
    }
//-----------------------------------------------
//listado general
//-----------------------------------------------
    public void mostrarDatos(int accion) throws SQLException{
        Conectar_bd c2=new Conectar_bd(accion);
        String lista="SELECT * FROM `alumnos` WHERE 1";
        Connection cn;
        Statement st;
        ResultSet r1;
        try{     
            cn=c2.getConnection();
            st=cn.createStatement();
            r1=st.executeQuery(lista);
//-----------------------------------------------
           while(r1.next()){
               //System.out.println(r1.getInt("DNI") + " " + r1.getString("nombre") + " " + r1.getString("apellido"));
               System.out.println(r1.getString("apellido") + " " + r1.getString("nombre") + " " + r1.getInt("DNI"));
           }
           System.out.println("");
           System.out.print("Presione cero para volver al menu >> : ");
            }catch (Exception e){
        System.out.println("Error en listar alumnos");
        System.out.println("");
        System.out.print("Presione cero para volver al menu >> : ");
       }    
    } 









//-----------fin de clase------------------------------------
}