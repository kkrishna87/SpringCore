package krishna.imcs.beans;

public class Department {

		private int DeptID;
		private String DeptName;
		
		
		//Constructor
		public Department(int deptID, String deptName) {
			super();
			DeptID = deptID;
			DeptName = deptName;
		}

		//Default Constructor
		public Department() {

		}

		public int getDeptID() {
			return DeptID;
		}

		public void setDeptID(int deptID) {
			DeptID = deptID;
		}

		public String getDeptName() {
			return DeptName;
		}

		public void setDeptName(String deptName) {
			DeptName = deptName;
		}

		@Override
		public String toString() {
			return "Depertment [DeptID=" + DeptID + ", DeptName=" + DeptName + "]";
		}

	

}
