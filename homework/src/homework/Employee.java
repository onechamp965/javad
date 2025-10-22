package homework;

abstract class Employee {
	protected String name;
	protected String employeeId;
	
	protected Employee ( String name, String employeeId) {
		this.employeeId = employeeId;
		this.name = name;
	}
	
	public abstract int calculatePay();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmplyeeId() {
		return employeeId;
	}

	public void setEmplyeeId(String emplyeeId) {
		this.employeeId = emplyeeId;
	}
	
	
	
}
