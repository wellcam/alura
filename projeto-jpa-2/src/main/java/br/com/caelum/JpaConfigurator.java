package br.com.caelum;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableTransactionManagement
public class JpaConfigurator {

	/*DATASOURCE SPRING*/
//	@Bean
//	public DataSource getDataSource() {
//	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
//
//	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//	    dataSource.setUrl("jdbc:mysql://localhost/projeto_jpa");
//	    dataSource.setUsername("alura");
//	    dataSource.setPassword("alura");	
//	    
//	    setDriveragain(dataSource);
//	    
//	    return dataSource;
//	}
	
	/*DATASOURCE C3P0*/
	@Bean
	public DataSource getDataSource() throws PropertyVetoException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		
	    dataSource.setDriverClass("com.mysql.jdbc.Driver");
	    dataSource.setJdbcUrl("jdbc:mysql://localhost/projeto_jpa");
	    dataSource.setUser("alura");
	    dataSource.setPassword("alura");
	    
	    dataSource.setMinPoolSize(3); //Minimo de conexões
	    dataSource.setMaxPoolSize(5); //Maximo de conexões | Padrão 15
	    dataSource.setNumHelperThreads(15); //Distribuição de threads
	    
	    
	    return dataSource;
	}
	
	private void setDriveragain(DriverManagerDataSource dataSource) {
	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost/projeto_jpa");
	    dataSource.setUsername("alura");
	    dataSource.setPassword("alura");		
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean getEntityManagerFactory(DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();

		entityManagerFactory.setPackagesToScan("br.com.caelum");
		entityManagerFactory.setDataSource(dataSource);

		entityManagerFactory
				.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

		Properties props = new Properties();

		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
		props.setProperty("hibernate.show_sql", "true");
		props.setProperty("hibernate.hbm2ddl.auto", "create-drop");

		entityManagerFactory.setJpaProperties(props);
		return entityManagerFactory;
	}

	@Bean
	public JpaTransactionManager getTransactionManager(EntityManagerFactory emf) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(emf);

		return transactionManager;
	}

}