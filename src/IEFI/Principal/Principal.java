package IEFI.Principal;
//import java.sql.*;
import IEFI.Conector.*;

//import Conector.Conectar_bd;

public class Principal {
    public static void main(String[] args) throws Exception {
        Conectar_bd C1=new Conectar_bd();
        C1.setConecto("15");



        
        System.out.println("carga direccion  "+C1.getConecto());


        System.out.println("Hello, World!");
    }
}
