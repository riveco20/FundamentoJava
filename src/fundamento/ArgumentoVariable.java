/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamento;

/**
 *
 * @author Usuario
 */
public class ArgumentoVariable {
    public static void main(String[] args) {
        
        imprimirNumeros(3,4,5);
        imprimirNumeros(1,2);
        variosParametros("jose",1,2,3);
    }
    
    private static void variosParametros(String nombre,int...numeros){
        System.out.println(nombre);
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros(int...numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            
        }
   
    }
    
}
