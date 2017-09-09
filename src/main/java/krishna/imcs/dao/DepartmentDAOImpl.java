package krishna.imcs.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import krishna.imcs.beans.Department;

@Repository
public interface DepartmentDAOImpl {
	
	List<Department> getDeptList();

	Department getDepartment(int deptNo);
	
	
}
