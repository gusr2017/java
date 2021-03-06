/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodao.dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hugo Chanampe
 */
public class ConnectionFactory {
    
//static reference to itself
	private static ConnectionFactory instance = new ConnectionFactory();
	public static final String URL = "jdbc:postgresql://127.0.0.1:5432/salessystem";
	public static final String USER = "postgres";
	public static final String PASSWORD = "123456";
	public static final String DRIVER_CLASS = "org.postgresql.Driver"; 
	
	//private constructor
	private ConnectionFactory() {
		try {
			Class.forName(DRIVER_CLASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private Connection createConnection() {
		Connection connection = null;
		
                
                try {
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			System.out.println("ERROR: Unable to Connect to Database.");
		}
		return connection;
	}	
	
	public static Connection getConnection() {
		return instance.createConnection();
	}
}
