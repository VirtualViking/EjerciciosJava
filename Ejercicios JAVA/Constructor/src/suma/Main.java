package suma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Ingrese el numero 1:");
        int n1 = x.nextInt();
        System.out.println("Ingrese el numero 2:");
        int n2 = x.nextInt();
        sumar sumar = new sumar(n1,n2);
        System.out.println(sumar.suma());
    }
}
