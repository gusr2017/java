/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodao.controladores;


import demodao.objetos.Cliente;
import java.util.List;

/**
 *
 * @author Hugo Chanampe
 */
public interface ClienteDao {
    
   public List<Cliente> listarClientes();
   public Cliente obtenerCliente(Integer id);
   public void insertarCliente(Cliente cliente);
   public void actualizarCliente(Cliente cliente);
   public void borrarCliente(Cliente cliente);
    
}
