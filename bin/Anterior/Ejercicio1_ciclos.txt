//Ejercicios 1 de Programacion 1 
//Alumno Mario Gonzalez
//Aula 3
import java.util.Scanner;
public class Ejercicio1_ciclos {
    public static void main(String[] args) {
        int num=0;
        boolean prueba=true;
        Scanner captura=new Scanner(System.in);
        while (prueba==true) {
            System.out.println(" ");//Hace espacio y LN en la consola       
            System.out.println("Ingrese el tipo de ciclo a probar");//Titulo 
            System.out.println(" ");//Hace espacio y LN en la consola   
            System.out.println("1- Para ciclo FOR");//uno para ciclo FOR
            System.out.println("2- Para Ciclo WHILE");//dos para ciclo WHILE
            System.out.println("3- Para Ciclo DO-WHILE");//tres para ciclo DO-WHILE
            System.out.println("4- Sale del ejercicio");//tres para ciclo DO-WHILE            
            System.out.println(" ");//Hace espacio y LN en la consola
            num=captura.nextInt();
            System.out.println(" ");//Hace espacio y LN en la consola
                switch (num) {
//----------------------------------------------------------------------------------------
                    case 1:
                        int conta=1;
                        for (conta=1; conta<101; conta++) {
                            if (conta%2==0) {
                                System.out.println(conta);//lo muestro si es par    
                            }
                        }
                        System.out.println("Se utilizo ciclo FOR");//uno para ciclo FOR                       
                        break;
//----------------------------------------------------------------------------------------
                    case 2:
                        conta=1;
                        while (conta<101) {
                            if (conta%2==0) {
                                System.out.println(conta);//lo muestro si es par    
                            }
                            conta++;
                        }
                        System.out.println("Se utilizo ciclo WHILE");//uno para ciclo WHILE                        
                        break;  
//----------------------------------------------------------------------------------------
                    case 3:
                        conta=1;
                        do {
                            if (conta%2==0) {
                            System.out.println(conta);//lo muestro si es par    
                            }
                            conta++;
                        }while(conta<101);//si numero esd menor a 101
                        System.out.println("Se utilizo ciclo DO-WHILE");//uno para ciclo DO-WHILE                        
                        break;
//----------------------------------------------------------------------------------------
                    case 4:
                        System.out.println("Salio del ejercicio");//sale del programa  
                        prueba=false; 
                        captura.close();                     
                        break;
//----------------------------------------------------------------------------------------
                    default:
                        System.out.println("Valor ingresado no valido");//valor fuera de los 4 casos  
                        System.out.println("Intente nuevamente");//vuelve al inicio   
                        break;
                }
//----------------------------------------------------------------------------------------
        }
    }
}
