import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Lavadoras lavadoras = new Lavadoras();
        Scanner lector = new Scanner(System.in);

        System.out.println("Digite 1 para lavadora grande / digite 2 para lavadora pequeña");
        lavadoras.asignarTipo(lector.nextInt());
        System.out.println("¿Cuantas lavadoras desea alquilar?");
        lavadoras.asignarCantidad(lector.nextInt());
        System.out.println("¿Por cuanto tiempo desea alquilarlas?");
        lavadoras.asignarHoras(lector.nextInt());

        lavadoras.valor();

        System.out.println("el valor total es de: " + lavadoras.valorTotal());






    }
}
