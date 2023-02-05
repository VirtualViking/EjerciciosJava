import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ejercicio19 ejercicio19 = new Ejercicio19();

        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero de copias que quiere imprimir.");
        ejercicio19.numeroCopias = lector.nextInt();

        ejercicio19.verificarCopias();

        System.out.println(ejercicio19.valorTotal());

    }
}
