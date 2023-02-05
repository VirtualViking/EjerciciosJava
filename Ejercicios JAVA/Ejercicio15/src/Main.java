import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NumMayor numMayot = new NumMayor();
        Scanner lector = new Scanner(System.in);

        System.out.println("Digite 3 numeros");
        numMayot.asignarNum1(lector.nextInt());
        numMayot.asignarNum2(lector.nextInt());
        numMayot.asignarNum3(lector.nextInt());

        System.out.println(numMayot.comprobar());


    }
}