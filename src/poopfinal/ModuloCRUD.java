package poopfinal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author De La Cruz Padilla Marlene Mariana, Gutierrez Carbajal Adrian
 */
public class ModuloCRUD {
    
        int contador = 0;
        MGDatosPersonales direccion = new MGDatosPersonales();
        MGNombres alu = new MGNombres();
        MGDatosPersonales edad = new MGDatosPersonales();
        MGNumDeInscripcion numInscripcion = new MGNumDeInscripcion();
        MGRegistrosAcademicos registrosA = new MGRegistrosAcademicos();
        List<Alumno> alumnos = new ArrayList<Alumno>();
        generadorCSV csv = new generadorCSV();
        
    public void generarAlumno(){
        Alumno alumno = new Alumno();
        
        alumno.setID(contador+1);
        System.out.println("Alumno "+ alumno.getID() + ": ");
        //Se le asiga una edad aleatoria al Alumno
        alumno.setSemestre(registrosA.generaSemestre());
                
        alumno.setEdad(edad.generaEdad(alumno.getSemestre()));
        System.out.println("Edad: " + alumno.getEdad());

        //Se asiga un nombre aleatorio al alumno
        alumno.setNombre(alu.generaNombre());
        System.out.println("Nombre: " + alumno.getNombre());

        //Se asigna un apellido aleatorio al alumno
        alumno.setApellidos(alu.generaApellido());
        System.out.println("Apellidos: " + alumno.getApellidos());

        //Se asigna una direccion aleatoria al alumno
        alumno.setDireccion(direccion.generaDireccion(direccion.leerArchivo()));
        System.out.println("Direccion: " + alumno.getDireccion());
                
        //
        alumno.setPromedio(registrosA.generaPromedio());
        System.out.println("Promedio: " + alumno.getPromedio());
                
                
        //
        System.out.println("Semestre: " + alumno.getSemestre());
                
        //Para obtener numero de creditos necesitamos materias
        alumno.setMateriasAprobadas(registrosA.generaMateriasAprobadasTotales(alumno.getSemestre()));
        System.out.println("Materias aprobadas: " + alumno.getMateriasAprobadas());
                
        //
        alumno.setNumCreditos(registrosA.creditosTotales(alumno.getMateriasAprobadas()));
        System.out.println("Creditos totales: " + alumno.getNumCreditos());
                
        //
        alumno.setNumInscripcion(numInscripcion.generaNumInscripcion(alumno.getMateriasAprobadas(), alumno.getPromedio(), alumno.getNumCreditos(), alumno.getSemestre()));
        System.out.println("Numero de Inscripcion: " + alumno.getNumInscripcion());
                
        contador++;
                
        alumnos.add(alumno);
        System.out.println("");
            
    }
   
    public void generarNumeroDeAlumnos(int numeroDeAlumnos){
        int cuenta = 0;
        while(cuenta < numeroDeAlumnos){
            try{
                generarAlumno();
                cuenta++;
            }catch(ArrayIndexOutOfBoundsException aiobe){
                System.out.println("Error al mostar la lista de alumnos");
            }
        }
    }
    
    public void crearAlumno(){
        Alumno alumno = new Alumno();
        
        alumno.setID(contador+1);
        System.out.println("Alumno "+ alumno.getID() + ": ");
        //Se le asiga una edad aleatoria al Alumno
        alumno.setSemestre(registrosA.generaSemestre());
        
        System.out.println("Ingresa la edad del alumno: ");
        
        alumno.setEdad(Teclado.entero());
        System.out.println("Edad: " + alumno.getEdad());

        //Se asiga un nombre aleatorio al alumno
        System.out.println("Ingresa el nombre del alumno: ");
        alumno.setNombre(Teclado.cadena());
        System.out.println("Nombre: " + alumno.getNombre());

        //Se asigna un apellido aleatorio al alumno
        System.out.println("Ingresa el apellido del alumno");
        alumno.setApellidos(Teclado.cadena());
        System.out.println("Apellidos: " + alumno.getApellidos());

        //Se asigna una direccion aleatoria al alumno
        System.out.println("Ingresa la direccion del alumno");
        alumno.setDireccion(Teclado.cadena());
        System.out.println("Direccion: " + alumno.getDireccion());
                
        //
        alumno.setPromedio(registrosA.generaPromedio());
        System.out.println("Promedio: " + alumno.getPromedio());
                
                
        //
        System.out.println("Semestre: " + alumno.getSemestre());
                
        //Para obtener numero de creditos necesitamos materias
        alumno.setMateriasAprobadas(registrosA.generaMateriasAprobadasTotales(alumno.getSemestre()));
        System.out.println("Materias aprobadas: " + alumno.getMateriasAprobadas());
                
        //
        alumno.setNumCreditos(registrosA.creditosTotales(alumno.getMateriasAprobadas()));
        System.out.println("Creditos totales: " + alumno.getNumCreditos());
                
        //
        alumno.setNumInscripcion(numInscripcion.generaNumInscripcion(alumno.getMateriasAprobadas(), alumno.getPromedio(), alumno.getNumCreditos(), alumno.getSemestre()));
        System.out.println("Numero de Inscripcion: " + alumno.getNumInscripcion());
                
        contador++;
                
        alumnos.add(alumno);
        generarCSV();
    }
    
    public void buscarAlumno(int idAlumno){
        Alumno alumno = alumnos.get(idAlumno-1);
     
        System.out.println("Alumno "+ alumno.getID() + ": ");
        //Se le asiga una edad aleatoria al Alumno
        
        System.out.println("Edad: " + alumno.getEdad());
        
        //Se asiga un nombre aleatorio al alumn
        System.out.println("Nombre: " + alumno.getNombre());

        //Se asigna un apellido aleatorio al alum
        System.out.println("Apellidos: " + alumno.getApellidos());

        //Se asigna una direccion aleatoria al alumno
        System.out.println("Direccion: " + alumno.getDireccion());
                
        //
        System.out.println("Promedio: " + alumno.getPromedio());
                      
        //
        System.out.println("Semestre: " + alumno.getSemestre());
                
        //Para obtener numero de creditos necesitamos materia
        System.out.println("Materias aprobadas: " + alumno.getMateriasAprobadas());
                
        //
        System.out.println("Creditos totales: " + alumno.getNumCreditos());
                
        //
        System.out.println("Numero de Inscripcion: " + alumno.getNumInscripcion());
    }
    
    public void actualizarAlumno(int idAlumno){
        Alumno alumno = alumnos.get(idAlumno-1);
      
        System.out.println("Alumno "+ alumno.getID() + ": ");
        //Se le asiga una edad aleatoria al Alumno
        
        System.out.println("Ingresa la edad del alumno: ");
        
        alumno.setEdad(Teclado.entero());
        System.out.println("Edad: " + alumno.getEdad());

        //Se asiga un nombre aleatorio al alumno
        System.out.println("Ingresa el nombre del alumno: ");
        alumno.setNombre(Teclado.cadena());
        System.out.println("Nombre: " + alumno.getNombre());

        //Se asigna un apellido aleatorio al alumno
        System.out.println("Ingresa el apellido del alumno");
        alumno.setApellidos(Teclado.cadena());
        System.out.println("Apellidos: " + alumno.getApellidos());

        //Se asigna una direccion aleatoria al alumno
        System.out.println("Ingresa la direccion del alumno");
        alumno.setDireccion(Teclado.cadena());
        System.out.println("Direccion: " + alumno.getDireccion());
                
        //
        System.out.println("Promedio: " + alumno.getPromedio());
                       
        //
        System.out.println("Semestre: " + alumno.getSemestre());
                
        //Para obtener numero de creditos necesitamos materias
        System.out.println("Materias aprobadas: " + alumno.getMateriasAprobadas());
                
        //
        System.out.println("Creditos totales: " + alumno.getNumCreditos());
                
        //
        System.out.println("Numero de Inscripcion: " + alumno.getNumInscripcion());
                
        alumnos.set(idAlumno-1,alumno);
        generarCSV();
    }
    
    public void borrarAlumno(int idAlumno){
        alumnos.remove(idAlumno-1);
        generarCSV();
    }
    
    public void imprimirAlumnos(){
        System.out.println(contador);
        for (int i = 1; i < contador+1; i++) {
            System.out.println("i"+i);
            buscarAlumno(i);
        }
        generarCSV();
    }
    
    public void generarCSV(){
        csv.writeToCSV(alumnos);
    }
}
