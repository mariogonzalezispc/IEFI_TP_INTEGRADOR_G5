    import java.time.LocalDateTime;
    import java.time.format.DateTimeFormatter;
    
    class Limpia {

         public static void main(String[] args) {
            DateTimeFormatter cfecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter chora = DateTimeFormatter.ofPattern("HH:mm");
            String cmotivo="Funciones";
            String total="| Aula : 3  Alumno : Mario A.Gonzalez  Ejercicio : "+cmotivo+" |";
                try {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        } catch (Exception e) {
                        }
                    for (int x=0; x<total.length(); x++) {
                        System.out.print("=");           
                    }          
    
            System.out.println();
            System.out.println("| Cordoba - Argentina - Fecha : "+cfecha.format(LocalDateTime.now())+ "  Hora : "+chora.format(LocalDateTime.now())+"   |");
            System.out.println("| Institucion : ISPC  Materia : Programacion 1"); 
            System.out.println(total);

            for (int k=0; k<3; k++) {
                if (k==0) {
                    for (int z=0; z<total.length(); z++) {
                        System.out.print("=");           
                    }
                }
                System.out.println(); 
            }
        }



        
    }    