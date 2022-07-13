/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodao.controladores;

import demodao.dominio.ConnectionFactory;
import demodao.objetos.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hugo Chanampe
 */
public class ClienteDaoImpl implements ClienteDao{

    @Override
    public List<Cliente> listarClientes() {
         Connection connection = ConnectionFactory.getConnection();
        try{
            
            Statement stmt = connection.createStatement();
            String sql = "SELECT * FROM clientes";
            ResultSet rs   = stmt.executeQuery(sql);
            List<Cliente> clientes = new ArrayList();
            while(rs.next()){
                
                Cliente cliente = extraerClientesDesdeRS(rs);
                System.out.println(cliente);
                clientes.add(cliente);
                
            }
            //System.out.println(cont);
            return clientes;
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    private Cliente extraerClientesDesdeRS (ResultSet rs) throws SQLException {

    Cliente cliente = new Cliente();

    cliente.setId( rs.getInt("id") );

    cliente.setNombre( rs.getString("nombre") );

    cliente.setCuil(rs.getString("cuil"));
    
    cliente.setRazonSocial(rs.getString("razon_social"));

    return cliente;
    }
    
    

    @Override
    public Cliente obtenerCliente(Integer id) {
        Connection connection = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM clientes WHERE id=?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if(rs.next())
            {
                Cliente cliente = extraerClientesDesdeRS(rs);
                return cliente;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void insertarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
