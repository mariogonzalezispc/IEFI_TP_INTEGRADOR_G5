import java.sql.*;
public class Conexion {

public static void main (String[] args){

    
    try {
            //Crear conexion
            Connection miConexion = DriverManager.getConnection ("jdbc:mysql://localhost:3306/iefi_programacion_1","root","monica1971");
            System.out.println("Conexion Existosa!! \n");

            //Crear objetos statement
            Statement miStatement = miConexion.createStatement();

            //Ejecutar SQL
            ResultSet miResultSet = miStatement.executeQuery("Select * From alumnos");

            //Recorrer el resultset
            while(miResultSet.next()){
                System.out.println(miResultSet.getString("nombre") + " " + miResultSet.getString("apellido") + " " + miResultSet.getString("DNI") + " " );
                 }

        }catch (Exception e) {
            System.out.println("No conecta!!");
            e.printStackTrace();
        }
    }
}