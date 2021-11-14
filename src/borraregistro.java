import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class borraregistro {
    
    public static void main(String[] args) {
        
        try{
             //1. CREAR CONEXION
            
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/iefi_programacion_1","root","monica1971");
            
            System.out.println("CONEXION EXITOSA!! \n");
            
            // 2. CREAR OBJETO STATEMENT
            
            Statement miStatement = miConexion.createStatement();
            
            // 3. EJECUTAR INSTRUCCION Modifica EN LA BASE DE DATOS
            
            String SQL = "DELETE FROM alumnos WHERE nombre='Juan' AND apellido='Perez'";
            
            miStatement.executeUpdate(SQL);
            
            System.out.println("El registro fue eliminado correctamente");;
            
        }catch (Exception e){
            
            System.out.println("No conecta!!");
            
            e.printStackTrace();
                
        }    
        
    }
    
}