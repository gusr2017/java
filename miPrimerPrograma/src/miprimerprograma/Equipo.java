/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerprograma;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author Hugo Chanampe
 */
public class Equipo {
    
    private String nombre;
    
    private ArrayList<Jugador> jugadores;

    public int size() {
        return jugadores.size();
    }

    public void add(Jugador e) {
        jugadores.add(e);
    }

    public boolean remove(Object o) {
        return jugadores.remove(o);
    }

    public Iterator<Jugador> iterator() {
        return jugadores.iterator();
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList();
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + '}';
    }

 public void listarJugadores() {
        Iterator<Jugador> iter = jugadores.iterator();
        
        while(iter.hasNext())
        {
            Jugador j = iter.next();
            System.out.println("Nombre:"+j.getNombre()+" Apellido:"+j.getApellido()+" Altura: "+j.getAltura());
        }
        
        
    }
   
    
    
    
}
