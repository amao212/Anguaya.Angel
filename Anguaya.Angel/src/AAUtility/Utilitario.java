package AAUtility;

// import java.util.Scanner;

public class Utilitario {

    /**
     * limpiar la consola
     */
     public final static void aaClear(){
        try {
            String operatingSystem = System.getProperty("os.name");     //Check the current operating system
              
            if(operatingSystem.contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch(Exception e){
            System.out.println(e);
        }
    }

    // /**
    //  * Verifica que se ingrese un número.
    //  * @param mensaje, mensaje que se muestra en consola.
    //  * @return numero si este es valido.
    //  */
    // public static int aaGetNumeroPositivo(String mensaje) {
    //     Scanner sc = new Scanner(System.in);
    //     int numero;
    //     System.out.print(mensaje);


    //     do {
    //         while (!sc.hasNextInt()) {
    //             System.out.print("El valor ingresado no es permitido. Ingrese un número entero: ");
    //             sc.next();
    //         }
    //         numero = sc.nextInt();
    //     } while (numero <= 0);
        
    //     return numero;

    // }
    
}
