package krishna.imcs.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import krishna.imcs.dao.DepartmentDAO;

@ComponentScan (basePackages = {"krishna.imcs"})
@Configuration
@Import(DBConfig.class)
//@DependsOn("dataSource")
public class AppConfig {

	
	@Bean
	public DepartmentDAO getDepartment() {
		DepartmentDAO dao = new DepartmentDAO();
		return dao;
	}


}
