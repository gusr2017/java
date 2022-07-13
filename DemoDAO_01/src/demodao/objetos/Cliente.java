/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodao.objetos;

/**
 *
 * @author Hugo Chanampe
 */
public class Cliente {
    
    private Integer id;
    private String nombre;
    private String cuil;
    private String razonSocial;
    
    
    
    
    public Cliente() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", cuil=" + cuil + ", razonSocial=" + razonSocial + '}';
    }
    
    
}
