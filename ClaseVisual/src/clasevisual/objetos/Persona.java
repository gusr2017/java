/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasevisual.objetos;

/**
 *
 * @author Hugo Chanampe
 */
public class Persona {
    private String apellido;
    private String  nombre;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return apellido+", "+ nombre ;
    }
    
    
    
}
