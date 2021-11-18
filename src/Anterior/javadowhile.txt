import java.util.Scanner;
public class javadowhile {
    public static void main(String[] args) {
        int min,max,num;
        Scanner aula=new Scanner(System.in);
            System.out.println("Ingrese el numero Minimo");//pide al usuario que ingrese el minimo
            min=aula.nextInt();
            System.out.println("Ingrese el numero Maximo");//pide al usuario que ingrese el maximo
            max=aula.nextInt();
            System.out.println("Ingrese el numero del rango");//pide al usuario que ingrese el rango
            num=aula.nextInt();

            do {

                System.out.println("Ingrese un numero del rango");//pide al usuario que ingrese eun numero
                num=aula.nextInt();

            }while(!(num>min && num<=max));//Si numero no pertenece al rango es falso


        System.out.println("Hello, World!");
        aula.close();
    }
}