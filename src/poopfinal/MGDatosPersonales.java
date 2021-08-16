package poopfinal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author De La Cruz Padilla Marlene Mariana, Gutierrez Carbajal Adrian
 */

public class MGDatosPersonales{
    
    public int generaEdad(float semestre){
        /**@param GENERADOR DE EDADES, dentro del rango de 18 a 27 */
        int nEdad;
        if(semestre >= 5){
            Random edad = new Random();
            nEdad = edad.nextInt(27-19+1) + 19;
        }else{
            Random edad = new Random();
            nEdad = edad.nextInt(27-18+1) + 18;
        }
        return nEdad;
    }
    public ArrayList <String> leerArchivo(){
        ArrayList<String> lista = new ArrayList();
        FileReader fr = null;
        BufferedReader br;
        try{
            fr = new FileReader("DireccionesCDMX.txt");
            br = new BufferedReader(fr);
            String linea;
            
            while((linea = br.readLine()) != null){
                lista.add(linea);
            }
        }catch(IOException e){
            System.out.println("Error");
        }finally{
            try{
                if (fr != null) {
                    fr.close();
                }
            }catch(IOException e2){
                System.out.println("Error");
            }
        }
        
        return lista;
    }
    
    public String generaDireccion(ArrayList lista){
        Random direccionAlu = new Random();
        int nDireccion = direccionAlu.nextInt(1500-0+1) + 0;
    
        String direccion = (String) lista.get(nDireccion);
        return direccion;
    }

}

