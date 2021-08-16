package poopfinal;

import java.io.IOException;

/**
 *
 * @author De La Cruz Padilla Marlene Mariana, Gutierrez Carbajal Adrian 
 */
public class POOPFinal{

    public static void main(String[] args) throws IOException, RuntimeException{
        
        Menu menu = new Menu();
        ModuloCRUD crud = new ModuloCRUD();
        
        int opcion = 0;
        
        crud.generarNumeroDeAlumnos(500);
        do {
            opcion = menu.DespliegaMenu("Menu: \n 1- Crear alumno \n 2- Buscar alumno \n 3- Actualizar alumno \n 4- Borrar \n 5- Imprimir lista de alumnos \n 6- Salir \n Selecciona una opcion: ", 6);
            switch(opcion){
                case 1:
                    crud.crearAlumno();
                    System.out.println("");
                break;
                case 2:
                    System.out.println("Ingresa el id del alumno a buscar: ");
                    crud.buscarAlumno(Teclado.entero());
                    System.out.println("");
                break;
                case 3:
                    System.out.println("ID del alumno a actualizar: ");
                    crud.actualizarAlumno(Teclado.entero());
                    System.out.println("Alumno actualizado \n");
                break;
                case 4:
                    System.out.println("Ingresa el id del alumno a borrar: ");
                    int buscarAlumno = Teclado.entero();
                    crud.buscarAlumno(buscarAlumno);
                    crud.borrarAlumno(buscarAlumno);
                    System.out.println("Alumno borrado \n");
                break;
                case 5:
                    crud.imprimirAlumnos();
                    System.out.println("");
                break;
            }
        } while (opcion != 6);
        

    }
}
