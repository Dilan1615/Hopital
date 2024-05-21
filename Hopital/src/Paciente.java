public class Paciente extends Persona {
    private Doctor doctor; // Asociación con Doctor
    private Enfermero enfermero; // Asociación con Enfermero

    public Paciente(String nombre, String identificacion, String direccion, Doctor doctor) {
        super(nombre, identificacion, direccion);
        this.doctor = doctor;
    }

    public Doctor obtenerDoctor() {
        return doctor;
    }

    public Enfermero obtenerEnfermero() {
        return new Enfermero("Maria", "Gomez", "Pasillo a la derecha");
    }

    public GestionCitas obtenerCita() {

        return new GestionCitas();
    }
}
