package poopfinal;

import java.util.Random;

/**
 *
 * @author De La Cruz Padilla Marlene Mariana, Gutierrez Carbajal Adrian
 */
public class MGNombres {
    
    public String generaNombre(){
   
        String Nombres[] = {"Juan Miguel", "Luis Felipe", "Laura", "Susana", "Alvaro", "Sara", "Carlos Alberto", "Jose Alvaro", "Maria Lucinda", "Jesus", "Hector Gerardo", "Josefina Maria", "Maria Dolores", 
                            "Manuel", "Jorge", "Erick", "Paloma", "Mario Arturo", "Patricia", "Celia", "Carlos Alfonso", "Maria Isabel", "Rafael", "Maria Asuncion", "Francisco Javier", "Pablo", "Jose", "Jose Dante",
                            "Maria del Carmen", "Arturo", "Alberto Manuel", "Rogelio", "Joaquin", "Angel Antonio", "Heriberto", "Maria de Lourdes", "Roberto", "Ruben", "Jose Antonio", "Cuauhtemoc", "Juan Socorro", 
                            "Jose Hugo", "Jaime Jacobo", "Lourdes", "Andrea", "Oscar Gerardo", "Pedro", "Ana", "Cristina", "Adrian"};

        Random nombreAlu = new Random();
        int nNombre = nombreAlu.nextInt(49-0+1) + 0;

        String nombre = Nombres[nNombre];
            
        return nombre;
    }
    
    public String generaApellido(){
        String Apellidos [] = {"Vera Lastra", "Aguilar Navarro", "Salinas Aguilar", "Aguirre Cruz", "Alberu Gomez", "Alcantar Curiel", "Alcaraz Verduzco", "Alcocer Varela", "Alexanderson Rosas", "Almeda Valdes",
                            "Alonson Vanegas", "Alpuche Aranda", "Barrangan Garcia", "Barquera Cervera", "Barrera Saldaña", "Barrientos Melendez", "Blanco Favela", "Calderon Colmenero", "Calva Mercado",
                            "Cardona Perez", "Carranza Lira", "Carrillo Ruiz", "Castillo Martinez", "Chavez Negrete", "De La Fuente Ramirez", "Del Rio Navarro", "Diaz Quiñonez", "Dominguez Carrillo", "Elizondo Riojas",
                            "Escalante Acosta","Eslava Campos", "Espinola Zavaleta", "Fajardo Ortiz", "Feria Bernal", "Flores Rivera", "Fuente Del Campo", "Gomez Perez", "Gonzalez Ortiz", "Guadalajara Boo",
                            "Hernandez Avila", "Herrera Abarca", "Hinojosa Becerril", "Iglesias Morales", "Jimenez Ponce", "Jung Cook", "Kimura Fujikami", "Lara Muñoz", "Lemus Bravo", "Madrazo Navarro"};
        
        Random apellidoAlu = new Random();
        int nApellido = apellidoAlu.nextInt(49-0+1) + 0;

        String apellido = Apellidos[nApellido];
        
        return apellido;
    }
    
}
