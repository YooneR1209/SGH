package sistemaGestionHospital;

public class  Enfermero extends Persona {  //Atributos

    private String identificacion;

    //Relaciones

    private Paciente[] pacienteList;
    private Doctor[] doctorList;
    private CitaMedica[] citaMedicaList;
}
