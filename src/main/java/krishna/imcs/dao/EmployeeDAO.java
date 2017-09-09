package krishna.imcs.dao;

import java.sql.SQLException;
import java.util.List;

import krishna.imcs.beans.Employee;

public interface EmployeeDAO {
	
	 boolean create(Employee employee) throws SQLException;
	 
	 Employee read(int id) throws SQLException;
	 
	 boolean update(Employee employee) throws SQLException;
	 
	 boolean delete(int id2) throws SQLException;
	 
	 List<Employee> findAll() throws SQLException;

}
