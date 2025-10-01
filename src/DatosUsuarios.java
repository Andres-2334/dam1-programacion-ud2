import java.util.Scanner;

import utilidades.ProcesadorTexto;

public class DatosUsuarios {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Nombre = sc.nextLine();
        int Edad = sc.nextInt();
        String correo = sc.nextLine();
        boolean emailValido = ProcesadorTexto.esEmailValido(correo);
        if emailValido{
            System.out.println(correo + "Registrado");
        } else { 
            System.out.println("e");
        }


         
        


    }
}
