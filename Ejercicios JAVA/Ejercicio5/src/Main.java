public class Main {
    public static void main(String[] args) {

        PagoEmpleado pagoEmpleado = new PagoEmpleado();

        pagoEmpleado.codEmpleado = 143434;
        pagoEmpleado.setSalarioBasico(30000);
        pagoEmpleado.horasExtra = 6;
        pagoEmpleado.setNumeroHoras(48);
        pagoEmpleado.setDescuentoPrestamo(1000000);

        System.out.println("El valor de las horas extra es de: " + pagoEmpleado.calcularValorHE());
        System.out.println("El valor del devegado es de: " + pagoEmpleado.calcularDevengado());
        System.out.println("El valor del deducido es de: " + pagoEmpleado.calcularDeducido());
        System.out.println("El neto de su pago es de: " + pagoEmpleado.calcularNeto());




    }
}