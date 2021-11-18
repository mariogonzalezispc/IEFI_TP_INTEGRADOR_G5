//Ejercicios 2 de Programacion 1 
//Alumno Mario Gonzalez
//Aula 3
import java.util.Scanner;
public class Ejercicio2_dias {
    public static void main(String[] args) {
        String num1="";
        int num=0;
        int mes=0;
        int dia=0;
        int orden=0;
        String mes_s="";
        String orden_s="";
        boolean completo1=false;
        boolean completo2=false;
        boolean completo3=false;
        Scanner captura=new Scanner(System.in);
//----------------------------------------------------------------------------------------
         while (completo1==false) {
            System.out.println(" ");//Hace CR y LF en la consola       
            System.out.println("Ingrese el MES a mostrar");//Titulo 
            System.out.println(" ");//Hace CR y LF en la consola  
            System.out.println("1- Enero        7- Julio");     //1 para Enero   y  7 para Julio
            System.out.println("2- Febrero      8- Agosto");    //2 para Febrero y  8 para Agosto
            System.out.println("3- Marzo        9- Setiembre"); //3 para Marzo   y  9 para Setiembre
            System.out.println("4- Abril       10- Octubre");   //4 para Abril   y 10 para Octubre           
            System.out.println("5- Mayo        11- Noviembre"); //5 para Mayo    y 11 para Noviembre
            System.out.println("6- Junio       12- Diciembre"); //6 para Junio   y 12 para Diciembre
            System.out.println(" ");//Hace CR y LF en la consola
            num1=captura.next();
            if(valida(num1)==true) {
                  mes=Integer.parseInt(num1);
              }else{
                  System.out.println(" ");//CR y LF 
                  System.out.println("El formato no es admitido");//ingreso clave
                  System.out.println("debe ingresar numeros desde 1 a 12");//
                  mes=0;
            }
            if ((mes<1) || (mes>12)){
                     System.out.println(" ");//Hace CR y LF en la consola
                     System.out.println("Error en el Mes ingresado");
                     completo1=false;                
            } else {
                     completo1=true;
            }  
        }              
//----------------------------------------------------------------------------------------
         while (completo2==false) {
            System.out.println(" ");//Hace espacio y LN en la consola       
            System.out.println("Ingrese el dia del mes");//Aviso al usuario 
            System.out.println(" ");//Hace CR y LF en la consola
            num1=captura.next();
                  if(valida(num1)==true) {
                  num=Integer.parseInt(num1);
                  }else{
                  System.out.println(" ");//CR y LF 
                  System.out.println("El formato no es admitido");//ingreso clave
                  System.out.println("debe ingresar numeros desde 1 a 31");//
                  num=0;
                  }
                  if ((((mes==2) && num>28) || (( mes==4 || mes==6 || mes==9 || mes==11) && num>30)) || (num>31) ||(num<1)){
                     System.out.println(" ");//Hace CR y LF en la consola
                     System.out.println("Error en el numero de dia ingresado");
                     completo2=false;                
                  } else {
                     completo2=true;
                  }
                  dia=num;
            }
//----------------------------------------------------------------------------------------
         while (completo3==false) {
            System.out.println(" ");//Hace CR y LF en la consola      
            System.out.println("Ingrese el orden del dia en la semana");//Aviso al usuario 
            System.out.println(" ");//Hace CR y LF en la consola
            System.out.println("1- Lunes");     //uno para Lunes
            System.out.println("2- Martes");    //dos para Martes
            System.out.println("3- Miercoles"); //tres para Miercoles
            System.out.println("4- Jueves");    //cuatro para Jueves            
            System.out.println("5- Viernes");   //uno para Viernes
            System.out.println("6- Sabado");    //dos para Sabado
            System.out.println("7- Domingo");   //dos para Domingo            
            System.out.println(" ");//Hace CR y LF en la consola
            num1=captura.next();
                  if(valida(num1)==true) {
                  orden=Integer.parseInt(num1);
                  }else{
                  System.out.println(" ");//CR y LF 
                  System.out.println("El formato no es admitido");//ingreso clave
                  System.out.println("debe ingresar numeros desde 1 a 7");//
                  orden=0;
                  }
                  System.out.println(" ");//Hace CR y LF en la consola
                  if ((orden<1) || (orden>7)){
                     System.out.println(" ");//Hace CR y LF en la consola
                     System.out.println("Error en el numero de orden ingresado");
                     completo3=false;                
                  } else {
                     completo3=true;
            } 
      }
//----------------------------------------------------------------------------------------           
         captura.close();
//----------------------------------------------------------------------------------------            
               switch (mes) {
//----------------------------------------------------------------------------------------
                     case 1:
                           mes_s="Enero";    
                     break;
//----------------------------------------------------------------------------------------
                     case 2:
                           mes_s="Febrero";    
                     break;  
//----------------------------------------------------------------------------------------
                     case 3:
                           mes_s="Marzo";    
                     break;
//----------------------------------------------------------------------------------------
                     case 4:
                           mes_s="Abril";    
                     break;
//----------------------------------------------------------------------------------------
                     case 5:
                           mes_s="Mayo";    
                     break;
//----------------------------------------------------------------------------------------
                     case 6:
                           mes_s="Junio";    
                     break;
//----------------------------------------------------------------------------------------
                     case 7:
                           mes_s="Julio";    
                     break;
//----------------------------------------------------------------------------------------
                     case 8:
                           mes_s="Agosto";    
                     break;
//----------------------------------------------------------------------------------------
                     case 9:
                           mes_s="Setiembre";    
                     break;
//----------------------------------------------------------------------------------------
                     case 10:
                           mes_s="Octubre";    
                     break;
//----------------------------------------------------------------------------------------
                     case 11:
                           mes_s="Noviembre";    
                     break;
//----------------------------------------------------------------------------------------
                     case 12:
                           mes_s="Diciembre";    
                     break;
//----------------------------------------------------------------------------------------
                     default:
  
                     break;
                  }
//----------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------            
               switch (orden) {
    //----------------------------------------------------------------------------------------
                     case 1:
                           orden_s="Lunes";    
                     break;
    //----------------------------------------------------------------------------------------
                     case 2:
                           orden_s="Martes";    
                     break;
    //----------------------------------------------------------------------------------------
                     case 3:
                           orden_s="Miercoles";    
                     break;
    //----------------------------------------------------------------------------------------
                     case 4:
                           orden_s="Jueves";    
                     break;
    //----------------------------------------------------------------------------------------
                     case 5:
                           orden_s="Viernes";    
                     break;
    //----------------------------------------------------------------------------------------
                     case 6:
                           orden_s="Sabado";    
                     break;
    //----------------------------------------------------------------------------------------
                     case 7:
                           orden_s="Domingo";    
                     break;
    //----------------------------------------------------------------------------------------
                     default:
      
                     break;
                  }
    //----------------------------------------------------------------------------------------
    System.out.println(orden_s + " " + dia + " de " + mes_s );   //dos para Domingo 
    System.out.println(" ");//Hace CR y LF en la consola      
    }
//---------------------------------------------------------------------------------------
//Fin Main
//---------------------------------------------------------------------------------------
public static boolean valida(String num){
      if (num.matches("[0-9]*")){
          return true;
          } else {
          return false;}
      }
//---------------------------------------------------------------------------------------
//Fin class
//---------------------------------------------------------------------------------------
}

