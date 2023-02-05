import java.time.LocalDate;

public class CitaMedica {
    public int codCita;
    public LocalDate fecha;
    public String consultorio;

    public String nombreMedico;
    public String nombrePaciente;

    public CitaMedica(int codCita, LocalDate fecha, String consultorio, String nombreMedico, String nombrePaciente) {
        this.codCita = codCita;
        this.fecha = fecha;
        this.consultorio = consultorio;
        this.nombreMedico = nombreMedico;
        this.nombrePaciente = nombrePaciente;
    }
    public CitaMedica(){

    }
public void mostrarInformacion(){
    System.out.println(" El nombre del Paciente es: " +nombrePaciente+ " El nombre del Medico es :"+nombreMedico+ " Numero del Consultorio " +consultorio);
}
}
