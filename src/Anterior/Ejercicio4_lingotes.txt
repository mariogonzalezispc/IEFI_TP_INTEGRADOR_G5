//Ejercicios 4 de Programacion 1 
//Alumno Mario Gonzalez
//Aula 3
//import java.util.Scanner;
public class Ejercicio4_lingotes {
    public static void main(String[] args) {
        int a=0; //cantidad de lingotes de $56
        int b=0; //cantidad de lingotes de $106
        int c=0; //cantidad de lingotes de $127
        int d=56;//valor del lingote
        int e=106;//valor del lingote
        int f=127;//valor del lingote
        int a1=0;//menor cantidad de lingotes de $56
        int b1=0;//menor cantidad de lingotes de $106
        int c1=0;//menor cantidad de lingotes de $127
        int cantidad=0;//totalizar en cada for los lingotes
        int pesos=0;//valor total en pesos 
        int lingotes=100;//menor cantidad total de lingotes utilizados
        for (a=0; a<=97; a++) {
            for (b=0; b<=51; b++) {
                for (c=0; c<=42; c++) {
                    if ((a*56 + b*106 + c*127)==5409) {
                        cantidad=a+b+c;
                        if(cantidad<lingotes){
                            a1=a;
                            b1=b;
                            c1=c;
                            d=a*56;
                            e=b*106;
                            f=c*127;
                            pesos=d+e+f;
                            lingotes=cantidad;
                        }
                    }    
                }
            }
        }
        System.out.println(" ");//CR y LF 
        System.out.println(" ");//CR y LF 
        System.out.println("Valor de cada lingote   : $  56   $ 106    $ 127 "); 
        System.out.println("Menor cantidad lingotes :     "+""+ a1+"       "+b1+"       "+c1+"  total      "+ lingotes);  
        System.out.println("Total cantidad de dinero: $ "+d+" + $ "+e+" + $ "+f+"  total: $ "+ pesos);
        System.out.println(" ");//CR y LF 
        System.out.println(" ");//CR y LF    
//---------------------------------------------------------------------------------------
    }//Fin Main
//---------------------------------------------------------------------------------------
}  //Fin class
//---------------------------------------------------------------------------------------
