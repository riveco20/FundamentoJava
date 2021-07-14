/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FundamentosDos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Richard Vellojin
 */
public class Listas {
    public static void main(String[] args) {
        List<String>materias = new ArrayList<String>();
        
        materias.add("Calculo");
        materias.add("Fisica");
        materias.add("Quimica"); 
        
        System.out.println(materias);
        
        for (int i = 0; i < materias.size(); i++) {
            System.out.println("materias: "+materias.get(i));
            
        }
        
        materias.remove(0); 
        materias.remove("Fisica");
        
        System.out.println("listas nuevas " + materias);
    
        List<Integer>numeros= new ArrayList<Integer>();
        for (int i = 0; i < 10; i+=2) {
            numeros.add(i); 
                        
        }
        
        for (Integer numero : numeros) {
            System.out.println("numero: " + numero);
            
        }
        
    
    }
    
}
