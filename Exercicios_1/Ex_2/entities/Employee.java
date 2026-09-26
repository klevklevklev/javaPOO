package entities;

public class Employee {

	public String name;
	public double tax, grossSalary;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double porcentage) {
		this.grossSalary += grossSalary * porcentage / 100;
	}
}
