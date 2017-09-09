package krishna.imcs.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import krishna.imcs.beans.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	PreparedStatement pst;
	Connection con;
	@Autowired
	DataSource datasource;

	public boolean create(Employee employee) throws SQLException {
		con = datasource.getConnection();
		pst = (PreparedStatement) con.prepareStatement(
				" insert into employee (EmpNum,DeptNum,DOJ,DOB,Salary,EmpSalGrade) values(?,?,?,?,?,?)");
		pst.setInt(1, employee.getEmpNum());
		pst.setInt(2, employee.getDeptNum());
		pst.setDate(3, new Date(employee.getDOJ().getTime()));
		pst.setDate(4, new Date(employee.getDOB().getTime()));
		pst.setDouble(5, employee.getSalary());
		pst.setInt(6, employee.getEmpSalGrade());

		int flag = pst.executeUpdate();

		if (flag > 0) {
			System.out.println("Employee created Successfully");
			return true;

		}
		return false;
	}

	public Employee read(int id) throws SQLException {
		Employee employee = new Employee();
		con = datasource.getConnection();

		pst = (PreparedStatement) con.prepareStatement("select * from employee where EmpNum=?");

		pst.setInt(1, id);

		ResultSet rs = pst.executeQuery();

		if (rs.next()) {
			employee.setEmpNum(rs.getInt("EmpNum"));
			employee.setDeptNum(rs.getInt("EmpNum"));
			employee.setDOJ(rs.getDate("DOJ"));
			employee.setDOB(rs.getDate("DOB"));
			employee.setSalary(rs.getDouble("Salary"));
			employee.setEmpSalGrade(rs.getInt("EmpSAlGrade"));

		}

		return employee;

	}

	public boolean update(Employee employee) throws SQLException {

		con = datasource.getConnection();

		pst = (PreparedStatement) con.prepareStatement(
				" update employee set DeptNum=?,DOJ=?,DOB=?,Salary=?,EmpSalGrade=?  where EmpNum = ? and flag=1");

		pst.setInt(1, employee.getDeptNum());
		pst.setDate(2, new Date(employee.getDOJ().getTime()));
		pst.setDate(3, new Date(employee.getDOB().getTime()));
		pst.setDouble(4, employee.getSalary());
		pst.setInt(5, employee.getEmpSalGrade());
		pst.setInt(6, employee.getEmpNum());

		int flag = pst.executeUpdate();

		if (flag > 0) {

			return true;
		} else {

			return false;
		}
	}

	public boolean delete(int id) throws SQLException {

		con = datasource.getConnection();

		try {
			pst = con.prepareStatement("update Employee set flag = 0   where id=? and flag=1");

			pst.setInt(1, id);
			int rs = pst.executeUpdate();
			if (rs == 0) {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;

	}

	public List<Employee> findAll() throws SQLException {

		List<Employee> employee = new ArrayList<Employee>();
		con =datasource.getConnection();

		pst = con.prepareStatement("select EmpNum,DeptNum,DOJ,DOB,Salary,EmpSalGrade from employee where flag=1");

		ResultSet rs = pst.executeQuery();

		while (rs.next()) {
			
			Employee emp = new Employee();
			emp.setEmpNum(rs.getInt("EmpNum"));
			emp.setDeptNum(rs.getInt("DeptNum"));
			emp.setDOJ(rs.getDate("DOJ"));
			emp.setDOB(rs.getDate("DOB"));
			emp.setSalary(rs.getDouble("salary"));
			emp.setEmpSalGrade(rs.getInt("EmpSalGrade"));
			employee.add(emp);

		}

		return employee;
	}

	
	

}
