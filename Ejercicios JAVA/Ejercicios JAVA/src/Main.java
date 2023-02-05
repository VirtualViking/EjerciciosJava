import java.util.Scanner;

//Una empresa paga el salario por horas. Dadas las horas de trabajo de una persona durante
//la semana, calcule el pago total de la semana, teniendo en cuenta que las horas se pagan
//dependiendo de la cantidad, entre 1 y 10 se pagan a $30000 y mayores a 10 se pagan a
//$33000 Mostar un mensaje así:
//Señor tal XXXX el número de horas es XXX y su salario equivale a XXX
public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Sebastian", 5);
        empleado1.saludar();
        Empleado empleado2 = new Empleado("Juan",12);
        empleado2.saludar();
        Empresa empresa = new Empresa();
        empresa.calcularPago(empleado1);
        empresa.calcularPago(empleado2);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); //Ingresar datos usar scanner
        ejercicio11(num);
        ejercicio12();
    }
    public static void ejercicio11(int numero){
        if (numero >= 0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es negativo");
        }
    }
    public static void ejercicio12(){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double precioTotal = 0.0 ;
        int contador = 0;
        do{
            System.out.println("Ingrese un numero \n"+
                    "1. Lavadora Pequeña \n"+
                    "2. Lavadora Grande \n" +
                    "3. Generar factura ");
            opcion = scanner.nextInt();
            /////////////////////////////////////
            switch (opcion){
                case 1:
                    precioTotal = precioTotal+3000;
                    contador++;
                    System.out.println("Se ha alquilado una lavadora pequeña, lleva gastado "+ precioTotal );
                    break;
                case 2:
                    precioTotal = precioTotal+4000;
                    contador++;
                    System.out.println("Se ha alquilado una lavadora pequeña, lleva gastado "+ precioTotal );
                    break;
                case 3:
                    System.out.println("Generando factura...");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
                    break;
            }
        }while (opcion != 3);

        if(contador>=3){
            System.out.println("Se ha obtenido un descuento del 3% el precio a pagar es:" + (precioTotal - precioTotal*0.03));
        }else{
            System.out.println("El precio a pagar es " + precioTotal);
        }
    }{

    }
}

