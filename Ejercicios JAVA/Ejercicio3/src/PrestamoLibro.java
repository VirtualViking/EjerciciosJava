public class PrestamoLibro {

    public int codPrestamo;
    public String fechaPrestamo;
    public String nombreLibro;
    public int codigoUsuario;
    public byte diasDePrestamo;
    public String estadoPrestamo;

    public String consultarEstadoPrestamo(){
        if (estadoPrestamo.equals("activo")){
            return "prestamo activo";
        } else{
            return "prestamo inactivo";
        }

    }
    public String consultarDatosPrestamo(){
        if (estadoPrestamo.equals("activo")){
            return "Codigo prestamo: " + codPrestamo + " fecha prestamo: " + fechaPrestamo + " Libro: " + nombreLibro + " Num dias: " + diasDePrestamo;
        } else {
            return "Inactivo";
        }

    }
}