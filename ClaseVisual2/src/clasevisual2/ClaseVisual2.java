/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasevisual2;

import clasevisual2.objetos.TipoDocumento;
import clasevisual2.ui.Principal;
import clasevisual2.ui.Principal2;
import java.util.ArrayList;

/**
 *
 * @author Hugo Chanampe
 */
public class ClaseVisual2 {
        public static ArrayList<TipoDocumento> tiposDocumento = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        tiposDocumento.add(new TipoDocumento("DNI", "Documento Nacional de Identidad"));
        tiposDocumento.add(new TipoDocumento("PASS", "Pasaporte"));
        tiposDocumento.add(new TipoDocumento("LC", "Libreta Civica"));
        tiposDocumento.add(new TipoDocumento("LE", "Libreta de Enrolamiento"));
        tiposDocumento.add(new TipoDocumento("CF", "Cedula Federal"));
        Principal2 principal = new Principal2();
        principal.setVisible(true);
        
    }
    
}
