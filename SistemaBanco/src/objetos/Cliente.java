/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Hugo Chanampe
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private ArrayList cuentas;
    private ArrayList tarjetabanco;

    public boolean add(Object e) {
        return cuentas.add(e);
    }

    public boolean remove(Object o) {
        return cuentas.remove(o);
    }

    public Iterator iterator() {
        return cuentas.iterator();
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
   
}
