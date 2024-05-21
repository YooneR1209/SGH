package sistemaGestionHospital;

public class Doctor extends Persona implements GestionCitas {
        //Atributos
        private String especialidad;
    private String identificacion;

    @Override
    public void asignarCita() {

    }
    //Relaciones
    private Enfermero[] enfermeroList;
    private Paciente[] pacienteList;
    private EspecialidadMedica especialidadMedica;
    private CitaMedica[] citaMedicaList;
    private CitaMedica citasNumero;

}
