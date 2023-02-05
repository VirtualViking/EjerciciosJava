public class Main {
    public static void main(String[] args) {

        REclamo rEclamo = new REclamo();

        rEclamo.numeroReclamo = 5432;
        rEclamo.setNombrePersona("Jaime");
        rEclamo.setAsunto("Demora en el envío");
        rEclamo.descripcionReclamos = "'Se envió hace 7 dias y no ha llegado'";
        rEclamo.setEstadoReclamo("en revision");

        System.out.println(rEclamo.validarEstadoReclamo());
        System.out.println(rEclamo.mensajeRecepcionReclamo());

    }
}