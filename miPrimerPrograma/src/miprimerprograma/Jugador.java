/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerprograma;

/**
 *
 * @author Hugo Chanampe
 */
public class Jugador {
    
    private String nombre;
    
    private String apellido;
    
    private Integer dorsal;
    
    private Double altura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador(String nombre, String apellido, Integer dorsal, Double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dorsal = dorsal;
        this.altura = altura;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", dorsal=" + dorsal + ", altura=" + altura + '}';
    }
    
    
    
    
    
    
    
    
}
