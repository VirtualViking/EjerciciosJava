import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CitaMedica citaMedica = new CitaMedica();
        citaMedica.nombreMedico = "Gerardo";
        citaMedica.mostrarInformacion();
        CitaMedica citaMedica1 = new CitaMedica(2005, LocalDate.of(2023,01,30),"Numero Uno", "John", "Toro");
        citaMedica1.mostrarInformacion();
    }
}

//Constructor define los valores de los atributos de la clase.