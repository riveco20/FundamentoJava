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
public class Gerente extends SobreEscritura{
    public String departamento; 
    
    public Gerente(String nombre, double sueldo, String departamento){
       super(nombre, sueldo);
       this.departamento=departamento;
    }
    
}
