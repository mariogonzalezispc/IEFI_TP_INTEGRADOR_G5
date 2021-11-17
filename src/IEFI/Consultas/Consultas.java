package IEFI.Consultas;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;
import IEFI.Conector.*;


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
//Busqueda
//-----------------------------------------------
    public void mostrarDatos(int accion){
        Conectar_bd c2=new Conectar_bd(accion);
        String lista="SELECT * FROM `alumnos` WHERE 1";
        Connection cn;
        Statement st;
        ResultSet r1;
 
        try{     
            cn=c2.getConnection();
            st=cn.createStatement();
            r1=st.executeQuery(lista);
           while(r1.next()){
               System.out.println(r1.getInt("DNI") + " " + r1.getString("nombre") + " " + r1.getString("apellido"));
           }
            }catch (Exception e){
        System.out.println("Error en listar alumnos");
       }    
    } 
//-----------fin de clase------------------------------------
}