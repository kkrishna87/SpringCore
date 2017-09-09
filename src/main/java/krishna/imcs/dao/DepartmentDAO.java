package krishna.imcs.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import krishna.imcs.beans.Department;


@Repository
public class DepartmentDAO implements DepartmentDAOImpl {
	
	List<Department> deptlist = new ArrayList();
	@Override
	public List<Department> getDeptList() {
		deptlist.add(new Department(11, "ComputerScience"));
		deptlist.add(new Department(12, "EEE"));
		deptlist.add(new Department(12, "Electrical"));
		return deptlist;

		}
	@Override
	public Department getDepartment(int deptNo) {
		deptlist = getDeptList();
		for (Department d : deptlist) {
		if (d.getDeptID() == deptNo) {
		return d;
		}
		}

		return null;
		}

	
	

}
