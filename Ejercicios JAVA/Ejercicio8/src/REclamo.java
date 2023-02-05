public class REclamo {
    public int numeroReclamo;
    private String nombrePersona;
    private String asunto;
    public String descripcionReclamos;
    private String estadoReclamo;

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getEstadoReclamo() {
        return estadoReclamo;
    }

    public void setEstadoReclamo(String estadoReclamo) {
        this.estadoReclamo = estadoReclamo;
    }

    public String validarEstadoReclamo() {
        if (estadoReclamo == ("en revision")) {
            return "Su reclamo está siendo revisado";
        } else {
            return "Su reclamo no ha sido revisado aún";
        }
    }

    public String mensajeRecepcionReclamo(){
        return "El reclamo con el numero: " + numeroReclamo + "De la persona: " + nombrePersona + ": " + descripcionReclamos + ". Ha sido recibido";
    }
}

