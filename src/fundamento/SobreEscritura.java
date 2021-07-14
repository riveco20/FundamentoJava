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
public class SobreEscritura {
    
    protected String nombre;
    protected double sueldo;
    
    public SobreEscritura(String nombre,double sueldo){
        this.nombre=nombre;
        this.sueldo=sueldo;
    }
    
    public String obtenerDetalles(){
        return "Nombre" + this.nombre + ", Sueldo: " +this.sueldo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "SobreEscritura{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
    
    
    
}
