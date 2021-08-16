package poopfinal;
/**
 *
 * @author r2tay
 */
public class MGNumDeInscripcion {
    
    public float generaNumInscripcion(float materiasAprobadas, float promedio, float creditosTotales, float semestre){
        float numInscripcion; 
        float escolaridad;
        float velocidad;
        
        escolaridad = escolaridad(semestre, materiasAprobadas); 
        velocidad = velocidad(semestre, creditosTotales);
        numInscripcion = promedio*escolaridad*velocidad;
        return numInscripcion;
    }
    
    private float escolaridad(float semestre, float materiasAprobadas){
        float var;
        var = (materiasAprobadas/materiasEsperadas(semestre))*100;
        return var;
    }
    
    private float velocidad(float semestre, float creditosTotales){
        float var2;
        var2 = (creditosTotales/creditosEsperados(semestre))*100;
        return var2;
    }
    
    private float materiasEsperadas(float semestre){
        float var3;
        var3 =semestre*5;
        return var3;
        
    }
    
    private float creditosEsperados(float semestre){
        float creditosSemestreEsperado;
        creditosSemestreEsperado = (semestre*5)*7;
        return creditosSemestreEsperado;
    }
}
