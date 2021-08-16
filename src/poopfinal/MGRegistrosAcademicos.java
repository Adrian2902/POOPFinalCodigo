package poopfinal;

import java.util.Random;

/**
 *
 * @author De La Cruz Padilla Marlene Mariana, Gutierrez Carbajal Adrian
 */
public class MGRegistrosAcademicos {
    
    public float generaSemestre(){
        Random semestre = new Random();
        float nSemestre = semestre.nextInt(10-1+1) + 1;
        return nSemestre;
    }
    
    public float generaPromedio(){
        Random promedio = new Random();
        float nPromedio = promedio.nextInt(10-5+1) + 5;
        return nPromedio;
    }
    
    public float generaMateriasAprobadasTotales(float semestre){
        Random materiasAprobadasTotales = new Random();
        int var = (int)semestre;
        switch(var){
            case 1:
                return materiasAprobadasTotales.nextInt(5-0+1) + 0;
            case 2:
                return materiasAprobadasTotales.nextInt(10-0+1) + 0;
            case 3:
                return materiasAprobadasTotales.nextInt(15-0+1) + 0;
            case 4:
                return materiasAprobadasTotales.nextInt(20-0+1) + 0;
            case 5:
                return materiasAprobadasTotales.nextInt(25-0+1) + 0;
            case 6:
                return materiasAprobadasTotales.nextInt(30-0+1) + 0;
            case 7:
                return materiasAprobadasTotales.nextInt(35-0+1) + 0;
            case 8:
                return materiasAprobadasTotales.nextInt(40-0+1) + 0;
            case 9:
                return materiasAprobadasTotales.nextInt(45-0+1) + 0;
            case 10:
                return materiasAprobadasTotales.nextInt(50-0+1) + 0;
            default:
                return 0;
        }
    }
      
    public float creditosTotales(float materiasAprobadas){
        float creditos;
        creditos = materiasAprobadas*7;
        return creditos;
    }
}
