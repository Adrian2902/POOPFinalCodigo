package poopfinal;

import java.io.*;

/**
 *
 * @author De La Cruz Padilla Marlene Mariana, Gutierrez Carbajal Adrian
 */
public class Teclado {
    static private String cadena;
    static private BufferedReader in;
	 
    public static String cadena(String prompt) {
		  return  leerCadena(prompt);
    }

    public static String cadena() {
        return leerCadena("");
    }

    public static int entero(String prompt) {
        return leerEntero(prompt);
    }

    public static int entero() {
        return leerEntero("");
    }

    private static void inicializar() {
	     if (in==null)
        	in = new BufferedReader(new InputStreamReader(System.in));
    }

    private static String leerCadena(String prompt) {
        try {
        		inicializar();
            if (prompt.compareTo("")==0)
                System.out.print(" >");
            else
                System.out.print(prompt);
            cadena = in.readLine();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: ");
        }
        return cadena;
    }

    private static int leerEntero(String prompt) {
        int i=0;
        boolean ok;
        try {
        		inicializar();
            do {
                if (prompt.compareTo("")==0)
                    System.out.print(" >");
                else
                    System.out.print(prompt);
                try {
                    i = Integer.parseInt(in.readLine());
                    ok = true;
                } catch (java.lang.NumberFormatException e) {
                    System.out.println("Ha ocurrido un error: "+e.toString());
                    ok = false;
                }
            }
            while (!ok);
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: "+e.toString());
        }
        return i;
    }

}
