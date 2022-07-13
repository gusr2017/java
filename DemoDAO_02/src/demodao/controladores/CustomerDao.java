/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodao.controladores;

import demodao.objetos.Customer;

import java.util.List;


/**
 *
 * @author Hugo Chanampe
 */
public interface CustomerDao {
    
    
   public List<Customer> getAllCustomers();
   public Customer getCustomer(Integer id);
   
   public void insertCustomer(Customer customer);
   public void updateCustomer(Customer customer);
   public void deleteCustomer(Customer customer);
    
}
