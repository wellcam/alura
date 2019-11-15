package br.com.caelum;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestePool {

	public static void main(String[] args) throws PropertyVetoException, SQLException {
		// TODO Auto-generated method stub
		
		ComboPooledDataSource dataSource = (ComboPooledDataSource) new JpaConfigurator().getDataSource();
		for (int i = 0; i < 6 ;i++) {
		Connection connection = dataSource.getConnection();
		
		System.out.println("Conexões usadas: " + dataSource.getNumBusyConnections());
		System.out.println("Conexões minimo: " + dataSource.getNumIdleConnections());
		System.out.println("==========");
		}
	}

}
