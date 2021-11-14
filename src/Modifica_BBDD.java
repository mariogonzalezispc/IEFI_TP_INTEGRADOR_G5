
//bbdd_conectorjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Modifica_BBDD {
    
    public static void main(String[] args) {
        
        try{
             //1. CREAR CONEXION
            
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/iefi_programacion_1","root","monica1971");
            
            System.out.println("CONEXION EXITOSA!! \n");
            
            // 2. CREAR OBJETO STATEMENT
            
            Statement miStatement = miConexion.createStatement();
            
            // 3. EJECUTAR INSTRUCCION Modifica EN LA BASE DE DATOS
            
            String instruccionSQL = "INSERT INTO alumnos (DNI,nombre,apellido) VALUES ('456','Juan','Perez')";
            
            miStatement.executeUpdate(instruccionSQL);
            
            System.out.println("Los datos han sido insertados correctamente");
            
        }catch (Exception e){
            
            System.out.println("No conecta!!");
            
            e.printStackTrace();
                
        }    
        
    }
    
}
