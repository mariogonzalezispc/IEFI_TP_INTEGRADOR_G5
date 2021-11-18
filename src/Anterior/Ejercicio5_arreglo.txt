//Ejercicios 5 de Programacion 1 Array
//Alumno Mario Gonzalez
//Aula 3
/*Consigna: Crea un programa que pida al usuario 5 números reales, 
que guardará en un array. Luego calculará y mostrará su media 
(la suma de todos los datos, dividida entre la cantidad de datos).
Referencia teórica: Leer el PDF N° 6 sobre el lenguaje Java publicado 
en plataforma también puede revisar el sitio 
http://www.aprendeaprogramar.com/cursos/ver.php?id=5  
lección  7.4 acerca de Arreglos en Java.*/

import java.util.Scanner;
public class Ejercicio5_arreglo{
        public static void main(String args[]){
            double altura [];   //declaracion del arreglo
            double dato=0;      //declaro variable double para cargar en arreglo
            altura = new double[5];//declaro arreglo llamado altura
            String num="";      //declro variable string para capturar lo que ingrese el usuario
            int i=0;            //declaro como entero la variable con el lugar a ocupar el arreglo
            double media;       //declaro la variable en la que cargo la media obtenida
            boolean carga_1=false;//variable booleana que me permite entrar o al while que le pide datos al usuario
            Scanner captura=new Scanner(System.in);//inicio el scanner
            System.out.println(" ");//CR y LF 
            System.out.println("Este programa calcula la estatura media de 5 estudiantes");//ingreso de alturas por el usuario
            System.out.println(" ");//CR y LF 
//-----------------------------------------------------------------------------------------------------------------------------
            while (carga_1==false) {//while que se ejecuta para que el usuario cargue las alturas de los alumnos           
                System.out.print("Ingrese la altura del estudiante : ");//ingreso de alturas por el usuario
                num=captura.next();/*cargo lo ingresado en formato string a la variable num 
                                    lo hago en este formato por si el cliente se equivoca e ingresa una letra o caracter
                                    especial y que no se caiga el programa por el formato de dato ingresado*/
//-----------------------------------------------------------------------------------------------------------------------------
                    if(valida(num)==true) {//verifico que la funcion de control de numeros me devuelva verdadero
                        dato=Double.parseDouble(num);//parseo el STRING a Double
                        altura[i]=dato;     //cargo el dato capturado y convertido a double en el arreglo en la lugar que indica i
                        i++;                //incremento la i en uno para guardar el proximo dato
                            if (i==5) {     //verifico si i llego a 5 el arreglo esta completo 
                            carga_1=true;   //en true sale del condicional NO reingresa al while                                            
                            }
                        }else{
                        System.out.println(" ");//CR y LF 
                        System.out.println("El formato no es admitido");//mensaje al usuario indicando error de ingreso en el dato
                        System.out.println("debe ingresar numeros desde 0 a 9");//error al ingresar una letra
                        System.out.println("enteros o con decimales");// orientar al usuario que tipo de datos esperamos 
                        carga_1=false;//en falso cuando sale del condicional reingresa al while                 
                    }
            }
//-----------------------------------------------------------------------------------------------------------------------------
                System.out.println(" ");//CR y LF 
                captura.close();    //cierro el uso de Scanner
                System.out.println("Fin de la carga de datos"); // avisar al cliente que ya cargo los 5 datos  
                System.out.println("Calculando altura media");  // inicamos el calculo de la altura promedio  
                System.out.println(" ");//CR y LF  
                media=((altura[0]+altura[1]+altura[2]+altura[3]+altura[4])/5);//sumo el arreglo y lo divido por 5 
                System.out.println("Media de altura entre alumnos : "+String.format("%.2f", media));// publicamos 
                                                                                                    //la media y limito 
                                                                                                    //a 2 decimales 
                System.out.println(" ");//CR y LF
        }
//-----------------------------------------------------------------------------------------------------------------------------
//Fin Main
//-----------------------------------------------------------------------------------------------------------------------------
public static boolean valida(String num){
    if (num.matches("[0.0-9.9]*")){
        return true;
        } else {
        return false;}
    }
//-----------------------------------------------------------------------------------------------------------------------------
//Fin class
//-----------------------------------------------------------------------------------------------------------------------------
}