/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodao.controladores;

import demodao.objetos.Customer;
import demodao.controladores.CustomerDao;
import demodao.dominio.ConnectionFactory;
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
public class CustomerDaoImpl implements CustomerDao{

    @Override
    public List<Customer> getAllCustomers() {
        Connection connection = ConnectionFactory.getConnection();
        try{
            
            Statement stmt = connection.createStatement();
            String sql = "SELECT * FROM customers";
            ResultSet rs   = stmt.executeQuery(sql);
            List<Customer> customers = new ArrayList();
            if(rs.next()){
                
                Customer customer = extractCustomerFromResultSet(rs);
                System.out.println(customer);
                customers.add(customer);
                
            }
            //System.out.println(cont);
            return customers;
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Customer getCustomer(Integer id) {
      
        Connection connection = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM customers WHERE id=" + id;
        try {
            

            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if(rs.next())

            {
                 Customer customer = new Customer();

                 customer.setId( rs.getInt("id") );

                 customer.setName( rs.getString("name") );

                customer.setLastName(rs.getString("last_name") );

                customer.setIdCardNumber(rs.getInt("id_card_number") );

                return customer;
                //return extractCustomerFromResultSet(rs);

            }

        } catch (SQLException ex) {

            ex.printStackTrace();

        }

    return null;
    
    }
    
    @Override
    public void insertCustomer(Customer customer) {
        Connection connection = ConnectionFactory.getConnection();
        String sql ="INSERT INTO customers (name,last_name,id_card_number) VALUES (?,?,?)";
        try {
            PreparedStatement ps= connection.prepareStatement(sql);
            ps.setString(1, customer.getName());
            ps.setString(2, customer.getLastName());
            ps.setInt(3, customer.getIdCardNumber());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void updateCustomer(Customer customer) {
        Connection connection = ConnectionFactory.getConnection();
        String sql ="UPDATE customers SET name=?,last_name=?,id_card_number=?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, customer.getName());
            ps.setString(2, customer.getName());
            ps.setInt(3, customer.getIdCardNumber());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteCustomer(Customer customer) {
         Connection connection = ConnectionFactory.getConnection();
        try {
            Statement stmt = connection.createStatement();
             String sql="DELETE FROM custonmer WHERE id="+customer.getId();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    private Customer extractCustomerFromResultSet(ResultSet rs) throws SQLException {

    Customer customer = new Customer();

    customer.setId( rs.getInt("id") );

    customer.setName( rs.getString("name") );

    customer.setLastName(rs.getString("last_name") );

    customer.setIdCardNumber(rs.getInt("id_card_number") );

    return customer;
    }

   

}
    
    

