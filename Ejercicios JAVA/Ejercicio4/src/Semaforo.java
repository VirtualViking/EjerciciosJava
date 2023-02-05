public class Semaforo {

    public String colorBolmbilla;
    public String estadoBombilla;

    public void cambiarColor() {
        if (colorBolmbilla == ("AMARILLO")) {
            this.colorBolmbilla = "VERDE";
        }
    }

    public String apagarSemaforno() {
        if (estadoBombilla == ("no")) {
            return "Apagado";
        } else {
            return "encendido";

        }

    }

    public String encenderSemaforo(){
        if (estadoBombilla == ("ok")){
            return "Encendido";
        }else{
            return "apagado";
        }
    }

    public String mostrarMensajeAlConductor(){
        if (colorBolmbilla == ("VERDE")){
            return "El semaforo está de color " + colorBolmbilla + " puede seguir ";
        } else if (colorBolmbilla == ("ROJO")) {
            return "El semaforo está de color " + colorBolmbilla + " debe detenerse";
        }else {
            return "null";
        }
    }
}
