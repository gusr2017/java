/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodao;

import demodao.controladores.ClienteDaoImpl;
import demodao.objetos.Customer;
import demodao.controladores.CustomerDaoImpl;
import demodao.objetos.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hugo Chanampe
 */
public class DemoDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        ClienteDaoImpl clienteDao = new ClienteDaoImpl();
        //muestra el cliente obtenido
        System.out.println(clienteDao.obtenerCliente(2));
        

       
    
}
}