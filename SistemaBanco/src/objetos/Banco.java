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
public class Banco {
    
    private ArrayList clientes;

    public Banco() {
        clientes= new ArrayList();
                
    }

    public boolean add(Object e) {
        return clientes.add(e);
    }

    public boolean remove(Object o) {
        return clientes.remove(o);
    }

    public Iterator iterator() {
        return clientes.iterator();
    }
}
