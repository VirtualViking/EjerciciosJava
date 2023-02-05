import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ejercicio23 ejercicio23 = new Ejercicio23();
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el numero correspondiente a su operador.");
        System.out.println("1. Claro.");
        System.out.println("2. Tigo.");
        System.out.println("3. Movistar.");
        ejercicio23.operadorUsuario = lector.nextByte();

        System.out.println(ejercicio23.verificarServicios());
        System.out.println("Minutos internacionales consumidos: "+ejercicio23.minutosInternacionales);
        System.out.println("El costo total de su plan es: $"+ejercicio23.total());
    }
}
