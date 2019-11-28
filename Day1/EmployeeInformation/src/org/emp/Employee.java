package org.emp;
import org.company.Company;
import org.client.Client;
import org.project.Project;

public class Employee {
	private void empName() {
		System.out.println("Employee name is Siva");
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		Company comp = new Company();
		Client cli = new Client();
		Project proj = new Project();
		emp.empName();
		comp.companyName();
		cli.clientName();
		proj.projectName();
	}
}
