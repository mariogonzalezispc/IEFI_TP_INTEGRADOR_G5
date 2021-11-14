
//package ;
import java.util.Scanner;
import java.sql.*;
public class Principal {
    public static void main(String[] args, String string) throws SQLException {
        
        
        //System.out.println("Hola Mundo!");
        int accion;
        boolean salir=false;
        
        


        while (salir==false) {
            
            


        Scanner opcion = new Scanner(System.in);
        accion=opcion.nextInt();


		switch(accion) {
			case 1:
            Connection miConexion = DriverManager.getConnection ("jdbc:mysql://localhost:3306/iefi_programacion_1","root","monica1971");

				System.out.println(string);
                break;
			case 2:
				System.out.println("Habitación 2");
                break;
            case 3:
				System.out.println("Habitación 3");
                break;

 //----------------------------------------------------------------------              
                case 4:
                String Listado= "SELECT * FROM `alumnos` WHERE 1";




				System.out.println(Listado);
                break;
 //-----------------------------------------------------------------------
                case 5:
				System.out.println("Habitación 5");



                break;
//-------------------------------------------------------------------------



                case 6:
				System.out.println("Habitación 6");
                break;
                case 7:
				System.out.println("Habitación 7");
                break;
                case 8:
				System.out.println("Habitación 8");
                break;
                case 9:
				System.out.println("Fin de programa");
                salir=true;
                break;
                default:
				System.out.println("Defecto");
		}
    }

    }
}
