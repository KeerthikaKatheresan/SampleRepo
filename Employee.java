package com.mphasis.Day1MavenProject;

public class Employee {

			// TODO Auto-generated method stub
		private String employee;
		private int empId;
		private String desg;
		private String mobileNum;
		public Employee(String employee, int empId, String desg, String mobileNum) {
			super();
			this.employee = employee;
			this.empId = empId;
			this.desg = desg;
			this.mobileNum = mobileNum;
		}
		public Employee() {
			super();
		}
		public String getEmployee() {
			return employee;
		}
		public void setEmployee(String employee) {
			this.employee = employee;
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getDesg() {
			return desg;
		}
		public void setDesg(String desg) {
			this.desg = desg;
		}
		public String getMobileNum() {
			return mobileNum;
		}
		public void setMobileNum(String mobileNum) {
			this.mobileNum = mobileNum;
		}
		@Override
		public String toString() {
			return "Employee [employee=" + employee + ", empId=" + empId + ", desg=" + desg + ", mobileNum=" + mobileNum
					+ "]";
		}
		

	

	
}
