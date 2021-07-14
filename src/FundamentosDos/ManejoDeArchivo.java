//Guardar informacion de nombre, apellido, edad, profesion, telefono, estado civil 
package FundamentosDos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Richard Vellojin
 */
public class ManejoDeArchivo {
 
    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se a creado un archivo con nombre " + nombreArchivo);
        } catch (IOException ex) {
            System.out.println("Ocurrio un error al crear el archivo");
        }
    }
    
    
    
}
