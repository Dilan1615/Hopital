

public class Enfermero extends Persona {
    private Doctor doctor; // Asociación con Doctor
    private Paciente paciente; // Asociación con Paciente
    public Enfermero(String nombre, String identificacion, String direccion) {
        super(nombre, identificacion, direccion);
    }

    // Método para obtener un doctor
    public Doctor asisitirDoctor(){
        return new Doctor("Nombre", "Identificacion", "Direccion", Especialidad.PEDIATRIA);
    }

    public Paciente atenderPaciente(){
        return new Paciente("David", "Hurtado", "110273649"); //
    }
}
