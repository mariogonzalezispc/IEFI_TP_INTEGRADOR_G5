//Ejercicios 6 de Programacion 1 Array
//Alumno Mario Gonzalez
//Aula 3
/*Crea un programa que pida al usuario 8 números enteros,
los guarde en un array, halle y muestre el valor más alto
que contiene (su máximo) y el valor más bajo que contiene
(su mínimo). Pista: puedes empezar suponiendo que el primer
valor es el máximo provisional; a partir de ahí, recorre 
todos los demás con un "for"; si alguno de los datos es 
mayor que el máximo provisional, pasará a ser el nuevo 
máximo; el mínimo se calculará de forma similar.*/

import java.util.Scanner;
public class Ejercicio6_max{
        public static void main(String args[]){
            int billetes [];        //declaracion del arreglo
            int dato=0;             //declaro variable descargar del arreglo
            billetes = new int[8];  //declaro arreglo llamado billetes
            String num="";          //declro variable string para capturar lo que ingrese el usuario
            int i=0;                //declaro como entero la variable con el lugar a ocupar el arreglo
            int max=0;              //declaro la variable en la que cargo maximo
            int min=0;              //declaro la variable en la que cargo minimo
            boolean carga_1=false;  //variable booleana que me permite entrar o al while que le pide datos al usuario
            Scanner captura=new Scanner(System.in);//inicio el scanner
            System.out.println(" ");//CR y LF 
            System.out.println("Este programa busca maximo y minimo valor de billetes");//ingreso de enteros por el usuario
            System.out.println("cargados por el usuario"); 
            System.out.println(" ");//CR y LF 
//-----------------------------------------------------------------------------------------------------------------------------
            while (carga_1==false) {//while que se ejecuta para que el usuario cargue los billetes           
                System.out.print("Ingrese valor del billete : ");//ingreso de un valor de billetes
                num=captura.next();/*cargo lo ingresado en formato string a la variable num 
                                    lo hago en este formato por si el cliente se equivoca e ingresa una letra o caracter
                                    especial y que no se caiga el programa por el formato de dato ingresado*/
//-----------------------------------------------------------------------------------------------------------------------------
                if(valida(num)==true) {//verifico que la funcion de control de numeros me devuelva verdadero
                    dato=Integer.parseInt(num); //parseo el string a entero una vez que confirme que no es letra 
                    billetes[i]=dato;           // cargo valor de dato al arreglo
                    i++;                        //incremento i para seleccionar el arreglo
                        if (i==8) {             //veo en que vuelta del while me encuentro si es 8 termina
                            carga_1=true;       //en true NO reingresa al while  
                            captura.close();    //cierro el uso de Scanner                         
                        }
                    }else{
                        System.out.println(" ");//CR y LF 
                        System.out.println("El formato no es admitido");//mensaje al usuario indicando error de ingreso en el dato
                        System.out.println("debe ingresar numeros desde 0 a 9");//error al ingresar una letra
                        System.out.println("enteros o con decimales");// orientar al usuario que tipo de datos esperamos 
                        carga_1=false;//en falso cuando sale del condicional reingresa al while                 
                }
            }
//---------------------------------------------------------------------------------------------------------------------
                System.out.println(" ");//CR y LF 
                System.out.println("Fin de la carga de datos"); // avisar al cliente que ya cargo los 8 datos  
                System.out.println("Calculando maximo y minimo valor ingresado");  // inicamos el calculo   
                 for (i=0; i<=7; i++) {     //hago un for para recorrer el arreglo
                    if (i==0) {             //si es la primera vuelta tomo el valor como maximo y minimo
                        max=billetes[0];    //cargo este valor en maximo
                        min=billetes[0];    //cargo este valor en minimo
                    }
                        if(i>0){                    //condicional para saber si no es la primera vuelta del for 
                            if (billetes[i]>max) {  //comparo el valor seleccionado del array con max
                                max=billetes[i];    //si es mayor lo muevo a max
                            }
                            if (billetes[i]<min) {  //comparo el valor seleccionado del array con el minimo
                                min=billetes[i];    //si es menor lo muevo a min
                            }
                        }
                }
//-----------------------------------------------------------------------------------------------------------------------------
                System.out.println(" ");//CR y LF  
                System.out.println("Valor maximo de los billete : "+max);// publicamos valor maximo 
                System.out.println("Valor minimo de los billete : "+min);// publicamos valor maximo 
                System.out.println(" ");//CR y LF
        }
//-----------------------------------------------------------------------------------------------------------------------------
//Fin Main
//-----------------------------------------------------------------------------------------------------------------------------
public static boolean valida(String num){
    if (num.matches("[0-9]*")){
        return true;
        } else {
        return false;}
    }
//-----------------------------------------------------------------------------------------------------------------------------
//Fin class
//-----------------------------------------------------------------------------------------------------------------------------
}