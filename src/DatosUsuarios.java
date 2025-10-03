import java.util.Scanner;

import utilidades.ProcesadorTexto;

public class DatosUsuarios {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce tu nombre: ");
        String Nombre = sc.nextLine();
        System.out.println("introduce tu edad: ");
        int Edad = sc.nextInt(); sc.nextLine();
        System.out.println("Introduce tu correo: ");
        String correo = sc.nextLine();
        boolean emailValido = ProcesadorTexto.esEmailValido(correo);
        if (emailValido){
            System.out.println(correo + "Registrado");
        } else { 
            System.out.println("Error al registrar correo invalido ");
        }
    }
}
