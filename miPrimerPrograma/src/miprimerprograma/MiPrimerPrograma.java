/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerprograma;
import java.awt.Rectangle;

/**
 *
 * @author Hugo Chanampe
 */
public class MiPrimerPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //declarar
        Jugador a,b,c;
        //instanaciar
        a = new Jugador("Michel", "Jordan", 23, 2.1);
        b = new Jugador("Koby", "Bryant", 8, 1.98);
        c = b;
        
        
        Equipo prueba;
        prueba = new Equipo("Bulls");
        prueba.add(a);
        prueba.add(b);
        prueba.add(c);
        
        prueba.listarJugadores();
        
        

//System.out.println("HOla Mundo!!");
        System.out.println(prueba.size());
    
    }
    
}
