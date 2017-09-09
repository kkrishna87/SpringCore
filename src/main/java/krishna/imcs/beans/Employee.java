package krishna.imcs.beans;

import java.util.Date;

public class Employee {

	private int EmpNum;
	private int DeptNum;
	private Date DOJ;
	private Date DOB;
	private double Salary;
	private int EmpSalGrade;

	public Employee(int empNum, int deptNum, Date dOJ, Date dOB, double salary, int empSalGrade) {
		super();
		EmpNum = empNum;
		DeptNum = deptNum;
		DOJ = dOJ;
		DOB = dOB;
		Salary = salary;
		EmpSalGrade = empSalGrade;
	}

	public Employee() {

	}

	@Override
	public String toString() {
		return "Employee [EmpNum=" + EmpNum + ", DeptNum=" + DeptNum + ", DOJ=" + DOJ + ", DOB=" + DOB + ", Salary="
				+ Salary + ", EmpSalGrade=" + EmpSalGrade + "]";
	}

	public int getEmpNum() {
		return EmpNum;
	}

	public void setEmpNum(int empNum) {
		EmpNum = empNum;
	}

	public int getDeptNum() {
		return DeptNum;
	}

	public void setDeptNum(int deptNum) {
		DeptNum = deptNum;
	}

	public Date getDOJ() {
		return DOJ;
	}

	public void setDOJ(Date dOJ) {
		DOJ = dOJ;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public int getEmpSalGrade() {
		return EmpSalGrade;
	}

	public void setEmpSalGrade(int empSalGrade) {
		EmpSalGrade = empSalGrade;
	}

}
