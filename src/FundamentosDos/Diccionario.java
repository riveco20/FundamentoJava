/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FundamentosDos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Richard Vellojin
 */
public class Diccionario {
    public static void main(String[] args) {
        Map<String,String> informacion = new HashMap<String,String>();
        
        informacion.put("Nombre: ", "Richard");
        informacion.put("Apellido: ", "Vellojin");
        informacion.put("Edad: ", "29");
        informacion.put("Telefono: ", "3046760007");
        
        System.out.println(informacion);
        
        
    }
    
}
