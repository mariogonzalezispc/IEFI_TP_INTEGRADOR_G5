//Ejercicios 7 de Programacion 1 Array Bidimensional
//Alumno Mario Gonzalez
//Aula 3
/*Crear un array bidimensional de tamaño 5x5 y del tipo carácter,
 rellenelo con puntos en todas las posiciones excepto aquellas en
 las que el número de fila es igual al número de columna, en las 
 que pondrá un X. Luego muestre su contenido por pantalla*/
public class Ejercicio7_bidi{
        public static void main(String args[]){
            char bidi [][];          //declaracion del arreglo bidimensional
            bidi = new char[5][5];  //declaro arreglo llamado bidi
            int a=0;                //indice array
            int b=0;                //indice array
            System.out.println(" ");//CR y LF 
            System.out.println("Este programa carga X en la coincidencia de numero de fila y columna.");
            System.out.println("Luego recorre el array y lo muestra.");
            System.out.println(" ");//CR y LF 
//-----------------------------------------------------------------------------------------
//for para cargar el arreglo
//-----------------------------------------------------------------------------------------
            for (a = 0; a < 5;a++) {//for para cargar al array 
                for(b = 0; b < 5; b++) {
                    if (a==b) {// si el numero de fila y columna coincide cargo 'X'
                    bidi[a][b]='X';
                    }
                    if (a!=b) {//si la fila y la columna no coinciden cargo '.'
                        bidi[a][b]='.';
                    }
                }
             }
//-----------------------------------------------------------------------------------------
//for para mostrar el contenido del arreglo
//-----------------------------------------------------------------------------------------
            for (a = 0; a < 5;a++) {//for para mostar el contenido del arreglo
                for(b = 0; b < 5; b++) {//en cada vuelta de este for muestro el contenido 
                    System.out.print(bidi[a][b]);
                }
                System.out.println();//inserto un salto de linea
            }
            System.out.println(" ");//CR y LF 
//-----------------------------------------------------------------------------------------
//Fin Main
//-----------------------------------------------------------------------------------------
    }
//-----------------------------------------------------------------------------------------
//Fin class
//-----------------------------------------------------------------------------------------
}