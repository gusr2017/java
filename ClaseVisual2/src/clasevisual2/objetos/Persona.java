/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasevisual2.objetos;

/**
 *
 * @author Hugo Chanampe
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Integer documento;

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    private TipoDocumento tipoDocumento;

    @Override
    public String toString() {
        return apellido+", "+nombre+" - Edad:"+edad+" - Documento:"+getTipoDocumento()+" "+documento;
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

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    private Integer edad;
    
    
    
    
}
