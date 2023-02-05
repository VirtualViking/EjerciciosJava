public class Main {
    public static void main(String[] args) {
        PrestamoLibro prestamoLibro = new PrestamoLibro();

        prestamoLibro.diasDePrestamo = 7;
        prestamoLibro.nombreLibro = "Marte";
        prestamoLibro.fechaPrestamo = "12/02/2022";
        prestamoLibro.estadoPrestamo = "activo";
        prestamoLibro.codigoUsuario = 458734;
        prestamoLibro.codPrestamo = 436543;

        System.out.println("Estado: " + prestamoLibro.estadoPrestamo);

        System.out.println("Datos del prestamo: " + prestamoLibro.consultarDatosPrestamo());

    }
}