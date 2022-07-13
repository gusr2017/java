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
public class Customer {
    
    private String name;
    private String lastName;
    private Integer id;
    private Integer idCardNumber;

    public Integer getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(Integer idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", lastName=" + lastName + ", idCardNumber=" + idCardNumber + '}';
    }
    
    
    public Customer(String name, String lastName, Integer id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
    }
    
    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    
    
}
