
package bbdd_conectorjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Modifica_BBDD {
    
    public static void main(String[] args) {
        
        try{
             //1. CREAR CONEXION
            
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/iefi_programacion_1","NULL","NULL");
            
            System.out.println("CONEXION EXITOSA!! \n");
            
            // 2. CREAR OBJETO STATEMENT
            
            Statement miStatement = miConexion.createStatement();
            
            // 3. EJECUTAR INSTRUCCION DML EN LA BASE DE DATOS
            
            String instruccionSQL = "INSERT INTO Alumnos (DNI,nombre,apellido,) VALUES ('25','Rodrigo','Alegrete')";
            
            miStatement.executeUpdate(instruccionSQL);
            
            System.out.println("Los datos han sido insertados correctamente");
            
        }catch (Exception e){
            
            System.out.println("No conecta!!");
            
            e.printStackTrace();
                
        }    
        
    }
    
}