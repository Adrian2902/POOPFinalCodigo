package poopfinal;

/**
 * @author De La Cruz Padilla Marlene Mariana, Gutierrez Carbajal Adrian
 */
public class Alumno {
    
    private int ID;
    private String Nombre;
    private String Apellidos; 
    private String Direccion;
    private int Edad; 
    private float promedio;
    private float NumCreditos;
    private float NumInscripcion; 
    private float Semestre;
    private float materiasAprobadas;
    
    public Alumno(){
    }

    public Alumno(String Nombre, String Apellidos, String Direccion, int Edad, int NumInscripcion) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
        this.Edad = Edad;
        this.NumInscripcion = NumInscripcion;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public int getEdad() {
        return Edad;
    }
    
    public float getPromedio() {
        return promedio;
    }

    public float getNumCreditos() {
        return NumCreditos;
    }
    
    public float getNumInscripcion() {
        return NumInscripcion;
    }

    public float getSemestre() {
        return Semestre;
    }

    public float getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public int getID() {
        return ID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setNumInscripcion(float NumInscripcion) {
        this.NumInscripcion = NumInscripcion;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public void setNumCreditos(float NumCreditos) {
        this.NumCreditos = NumCreditos;
    }

    public void setSemestre(float Semestre) {
        this.Semestre = Semestre;
    }

    public void setMateriasAprobadas(float materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Alumno{" + "ID=" + ID + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Direccion=" + Direccion + ", Edad=" + Edad + ", promedio=" + promedio + ", NumCreditos=" + NumCreditos + ", NumInscripcion=" + NumInscripcion + ", Semestre=" + Semestre + ", materiasAprobadas=" + materiasAprobadas + '}';
    }

    

   
 
}
