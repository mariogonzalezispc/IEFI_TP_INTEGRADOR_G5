//Ejercicios 3 de Programacion 1 
//Alumno Mario Gonzalez
//Aula 3
import java.util.Scanner;
public class Ejercicio3_clave {
    public static void main(String[] args) {
        String usuario="admin"; 
        int clave=123;
        int contador=0;
        String usuario_1="";
        int clave_1=0;
        String num="";
        boolean carga_1=false;
        Scanner captura=new Scanner(System.in);
//----------------------------------------------------------------------------------------
        while (carga_1==false) {
        System.out.println(" ");//CR y LF 
        System.out.println("Ingrese el Usuario");//ingreso usuario
        System.out.println(" ");//CR y LF  
        usuario_1=captura.next();
//----------------------------------------------------------------------------------------
        System.out.println(" ");//CR y LF 
        System.out.println("Ingrese su Clave");//ingreso clave
        System.out.println(" ");//CR y LF  
        num=captura.next();
            if(valida(num)==true) {
                clave_1=Integer.parseInt(num);
            }else{
                System.out.println(" ");//CR y LF 
                System.out.println("El formato no es admitido");//ingreso clave
                System.out.println("debe ingresar numeros desde 0 a 9");//
            }
//----------------------------------------------------------------------------------------
            if (usuario.equals(usuario_1)) {
                if (clave==clave_1) {
                    System.out.println(" ");//CR y LF                     
                    System.out.println("Bienvenido al sistema");//bienvenida
                    System.out.println(" ");//CR y LF                       
                    carga_1=true; //en verdadero ya no ingreso a while y termina el programa
                    captura.close(); 
                    usuario_1="";                 
                } else {
                    System.out.println("La clave ingresada es incorrecta");//Error
                    contador++; 
                    clave_1=0;
                    usuario_1="";  
                    carga_1=false;//en falso cuando sale del condicional reingresa al while                   
                }
            } else {
                System.out.println(" ");//CR y LF                 
                System.out.println("El usuario ingresado es incorrecto");//error
                clave_1=0;
                usuario_1="";                
                contador++;
                carga_1=false;//en falso cuando sale del condicional reingresa al while                      
            }
//-------------------------------------------------------------------------------
            if (contador==3) {
                System.out.println("Usted realizo 3 intentos fallidos");//error                 
                System.out.println("Usuario Bloqueado");//error  
                carga_1=true;//en verdadero ya no ingreso a while y termina el programa 
                captura.close();                
            }
        }
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



















































































































/*
private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {                                            

    //Sección1
    char clave[]=jpassClave.getPassword();
 
    //Sección 2
    String clavedef=new String(clave);
 
 
   //Sección 3
   if (txtUsuario.getText().equals("Administrador") && clavedef.equals("12345")){
 
          //S3 línea 1
          this.dispose();
 
          //S3 línea 2
          JOptionPane.showMessageDialog(null, "Bienvenido\n Has ingresado "
          + "satisfactoriamente al sistema", "Mensaje de bienvenida",
          JOptionPane.INFORMATION_MESSAGE);
 
          //S3 línea 3
          Formulario1 formformulario1 = new Formulario1();
 
          //S3 línea 4
          formformulario1.setVisible(true);
 
 
    
    }else {
 
 
           //S3 línea 5
           JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
           + "Por favor ingrese un usuario y/o contraseña correctos",  
 
           "Acceso denegado", JOptionPane.ERROR_MESSAGE);
             
 
        }


//----------------------------------------------------------------------------------------
            System.out.println(" ");//Hace CR y LF en la consola 
            JOptionPane.showMessageDialog(null,"bienvenido");
            String User=JOptionPane.showInputDialog("Ingrese su Usuario");
            String Pass=JOptionPane.showInputDialog("Ingrese su Clave");

            
JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
+ "Por favor ingrese un usuario y/o contraseña correctos",  
"Acceso denegado", JOptionPane.ERROR_MESSAGE);




*/