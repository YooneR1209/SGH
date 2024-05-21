package sistemaGestionHospital;

public class CitaMedica {

    //Atributos
    private String fecha;
    private int hora;
    private String motivo;
    private String estadoCita;
    private int numeroCitas;
    //Relaciones
    private Estado estado;
    private Paciente paciente;
    private Doctor doctor;
    private Sistema sistema;
}
