package sistemaGestionHospital;

public abstract class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;

    //Relaciones

    private Paciente paciente;
    private Doctor doctor;
    private Enfermero enfermero;

}