package IEFI.Consultas;

import java.sql.*;

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
    }
//-----------------------------------------------
//listado general
//-----------------------------------------------
    public void mostrarDatos(int accion) {
        //Conectar_bd c2=new Conectar_bd(accion);
        String lista="SELECT * FROM `alumnos` WHERE 1";
        Connection cn;
        Statement st;
        ResultSet r1;
        String url=( "jdbc:mysql://localhost:3306/iefi_programacion_1");
        String usuario=("root");
        String clave=("1234");
        try{     
            cn = DriverManager.getConnection(url,usuario,clave);
            st=cn.createStatement();
            r1=st.executeQuery(lista);
//-----------------------------------------------
           while(r1.next()){
               System.out.println(r1.getString("apellido") + " " + r1.getString("nombre") + " " + r1.getInt("DNI"));
           }
           System.out.println("");
           System.out.print("Presione cero para volver al menu >> : ");
            }catch (Exception e){
                System.out.println("No hay conexion con base de datos !!!!!!");         
                System.out.println("Error en listar alumnos");
                System.out.println("");
                System.out.print("Presione cero para volver al menu >> : ");
       }    
    } 
//-----------------------------------------------








//-----------fin de clase------------------------------------
}