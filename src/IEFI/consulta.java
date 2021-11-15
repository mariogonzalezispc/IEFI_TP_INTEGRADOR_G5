package IEFI;

import java.sql.*;

public class consulta {/*

    public static void main(String[] args) {
        
        try{
             //1. CREAR CONEXION
            
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/iefi_programacion_1","root","monica1971");
            
            System.out.println("CONEXION EXITOSA!! \n");
            
            // 2. CREAR OBJETO STATEMENT
            
            Statement miStatement = miConexion.createStatement();
            
            // 3. EJECUTAR SQL
                        
            ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM Alumnos");
            
            // 4. RECORRER EL RESULTSET
            
            while(miResultSet.next()){
                
                System.out.println(miResultSet.getInt("DNI") + " " + miResultSet.getString("nombre") + " " + miResultSet.getString("apellido"));
            }
        }catch (Exception e){
            
            System.out.println("No conecta!!");
            
            e.printStackTrace();
                
        }    
        
    }
    */
}