package poopfinal;

import java.io.*;
import java.util.List;
/**
 *
 * @author De La Cruz Padilla Marlene Mariana, Gutierrez Carbajal Adrian
 */
public class generadorCSV {
    private String separador = ",";
    public void writeToCSV(List<Alumno> alumnos)
    {
        try
        {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("RegistrosEscolares.csv"), "UTF-8"));
            
                
            for (Alumno alumno : alumnos)
            {
                StringBuffer oneLine = new StringBuffer();
                oneLine.append(alumno.getID());
                oneLine.append(separador);
                oneLine.append(alumno.getNombre());
                oneLine.append(separador);
                oneLine.append(alumno.getApellidos());
                oneLine.append(separador);
                oneLine.append(alumno.getEdad());
                oneLine.append(separador);
                oneLine.append(alumno.getDireccion());
                oneLine.append(separador);
                oneLine.append(alumno.getSemestre());
                oneLine.append(separador);
                oneLine.append(alumno.getPromedio());
                oneLine.append(separador);
                oneLine.append(alumno.getMateriasAprobadas());
                oneLine.append(separador);
                oneLine.append(alumno.getNumCreditos());
                oneLine.append(separador);
                oneLine.append(alumno.getNumInscripcion());
                
                bw.write(oneLine.toString());
                bw.newLine();
            }
            bw.flush();
            bw.close();
        }
        catch (UnsupportedEncodingException e) {}
        catch (FileNotFoundException e){}
        catch (IOException e){}
    }
}
