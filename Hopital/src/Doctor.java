public class Doctor extends Persona {
    private Paciente paciente; // Atributo de tipo Paciente
    private Enfermero enfermero; // Asociacion de tipo Enfermero
    private Especialidad especialidad; // Atributo de tipo Especialidad


    // Constructor que incluye la especialidad y los atributos de la clase Persona
    public Doctor(String nombre, String identificacion, String direccion, Especialidad especialidad) {
        super(nombre, identificacion, direccion);
        this.especialidad = Especialidad.PEDIATRIA;
    }

    // Método para obtener la especialidad
    public Especialidad obtenerEspecialidad() {
        return especialidad;
    }

    // Método para obtener un paciente
    public Paciente obtenerPaciente(){
        return new Paciente("David", "Hurtado", "110273649"); //
    }
}
