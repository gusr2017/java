/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodao.controladores;

import demodao.dominio.ConnectionFactory;
import demodao.objetos.Cliente;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hugo Chanampe
 */
public class ClienteDaoImpl implements ClienteDao{
    private Statement stmt;
    private String sql;
    private ResultSet rs;
    private Connection connection;
    
    @Override
    public List<Cliente> listarClientes() {
         connection = ConnectionFactory.getConnection();
        try{
            
            this.stmt = connection.createStatement();
            this.sql = "SELECT * FROM clientes";
            this.rs   = stmt.executeQuery(sql);
            
            List<Cliente> clientes = new ArrayList();
            
            while(rs.next()){
                
                Cliente cliente = extraerClientesDesdeRS(rs);
                //System.out.println(cliente);
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
        connection = ConnectionFactory.getConnection();
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
        connection = ConnectionFactory.getConnection();
        String sql = "INSERT INTO clientes (nombre,cuil,razon_social) VALUES (?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getCuil());
            ps.setString(3, cliente.getRazonSocial());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, cliente);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void actualizarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public DefaultTableModel llenarGrilla(){
        this.connection = ConnectionFactory.getConnection();
        
        DefaultTableModel model;
        
        String[] columnas = {"id","nombre","cuil","razon social"};
        
        String[] rows = new String[4];
        
        model= new DefaultTableModel(null,columnas);
        
        try {
            this.stmt = connection.createStatement();
            this.sql = "SELECT * FROM clientes";
            this.rs   = stmt.executeQuery(sql);
            
            while(this.rs.next()){
            
            rows[0] = String.valueOf(rs.getInt("id"));
            rows[1] = rs.getString("nombre");
            rows[2] = rs.getString("cuil");
            rows[3] = rs.getString("razon_social");
            
            model.addRow(rows);
            
            }
            return model;
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
            
         return null;
        
        
    
    }
    
    public DefaultTableModel llenarGrilla2(){
        this.connection = ConnectionFactory.getConnection();
        this.sql ="SELECT * FROM clientes";
        String[] columnas = {"id","nombre","cuil","razon social"};
        String[] filas = new String[4];
        DefaultTableModel model;
        
        model = new DefaultTableModel(null, columnas);
        
        try {
            
            this.stmt = connection.createStatement();
            rs =stmt.executeQuery(sql);
            
            while(rs.next()){
            filas[0] = String.valueOf(rs.getInt("id"));
            filas[1] = rs.getString("nombre");
            filas[2] = rs.getString("cuil");
            filas[3] = rs.getString("razon_social");
            
            model.addRow(filas);
                        
            }
            
            return model;
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    
    }
}
