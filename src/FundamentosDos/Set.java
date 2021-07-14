/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FundamentosDos;

import java.util.HashSet;

/**
 *
 * @author Richard Vellojin
 */
public class Set {
    public static void main(String[] args) {
        HashSet numeros = new HashSet();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        
        System.out.println(numeros);
        
        for (Object numero : numeros) {
            System.out.println(numero);
            
        }
        numeros.remove(1);
        System.out.println(numeros);
    }
    
    
    
}
