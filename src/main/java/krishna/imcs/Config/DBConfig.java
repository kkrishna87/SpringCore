package krishna.imcs.Config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBConfig {

	@Bean
	DataSource getDataSource() {
		org.apache.commons.dbcp2.BasicDataSource datasource = new BasicDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/employeedata");
		datasource.setUsername("root");
		datasource.setPassword("root");
		
		return datasource;
	}
	

}
