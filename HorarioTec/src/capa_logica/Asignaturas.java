/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capa_logica;

/**
 *
 * @author 
 */
public class Asignaturas {
    
    String nombre;
    int creditos;  // cada credito = 3h por semana
    byte tipo; //  0 = teorico , 1 = practica

    public Asignaturas() {
    }

    public Asignaturas(String nombre, int creditos, byte tipo) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.tipo = tipo;
    }
    
}
