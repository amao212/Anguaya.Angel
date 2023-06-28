
import java.io.IOException;
import java.util.Scanner;

import AAUtility.Utilitario;

public class App {
    
    public static void main(String[] args) throws Exception {
        final int aaCedula = 1005387319;
        final String aaCorreo = "angel.anguaya02@epn.edu.ec";
        final String aaNombre = "Angel Manuel Anguaya Otavalo";

        Utilitario.aaClear();
        System.out.println("- CEDULA: " + aaCedula);
        System.out.println("- CORREO: " + aaCorreo.toUpperCase());
        System.out.println("- NOMBRE: " + aaNombre.toLowerCase());
        System.out.println("");
        
        aaLogin();
        
    }

    public static void aaLogin() throws IOException{
        int intentos = 3;
        String aaUsuario   = "profe";
        String aaPassword  = "1234";
        String aaUsuario1  = "angel.anguaya02@epn.edu.ec";
        String aaPassword1 = "1005387319";
        

        Scanner sc = new Scanner(System.in);

        while (intentos > 0) {

            System.out.println("............");
            System.out.print("+ usuario: ");
            String usuario = sc.nextLine();
            System.out.print("+ clave: ");
            String password = sc.nextLine();
            System.out.println("............");

            

            if (usuario.equals(aaUsuario) && password.equals(aaPassword)||usuario.equals(aaUsuario1) && password.equals(aaPassword1)) {
                System.out.println(":: Bienvenido "+ usuario.toUpperCase());
                System.out.println("--------------------------");
                System.out.println("Carga horaria de alumnos");
                System.out.println("--------------------------");
                System.out.println("Usuario: "+ usuario.toUpperCase());
                System.out.println("");
                aaMenu();
                
            } else {
                intentos --;
                System.out.println("* Nro de intentos: "+ intentos);
            }
            
        }
        if (intentos == 0) {
            System.out.println("Lo sentimos tu usuario y clave son incorrectos...!");
        }
        sc.close();
    }

    public static void aaMenu() throws IOException{
        Scanner scanner = new Scanner(System.in);
        
        int aaMenuInicial;
        Horario ho = new Horario();
        

        do {
            
            System.out.println("1 Visualizar Alumnos");
            System.out.println("2 Visualizar Materia");
            System.out.println("3 Visualizar Horario");
            System.out.println("4 Visualizar Horario de una asignatura");
            System.out.println("0 SALIR");
            
            System.out.print("<-> Seleccione una opcion: ");
            aaMenuInicial = scanner.nextInt();
            
            switch (aaMenuInicial) {
                case 1: System.out.println("[+] Listado de alumnos:");
                        System.out.println(" - 202110105-CHUNCHO JIMENEZ ANGEL DAVID\r\n" + //
                                " - 202111083-HIDALGO CRUZ PABLO ESTEBAN\r\n" + //
                                " - 202120757-ALEMAN OSORIO CARLOS ALEJANDRO\r\n" + //
                                "");
                break;
                case 2: System.out.println("[+] Listado de materia");
                    ho.aaShowHorario();
                    
                    break;
                case 3:System.out.println();
                    
                    break;
                case 4:
                    
                    break;
                case 0:System.exit(aaMenuInicial);
                    break;
            
                default:
                    break;
            }

        } while (aaMenuInicial != 6);
        scanner.close();
        

    }
}
