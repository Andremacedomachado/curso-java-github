package entities;

public class EmployeeS {
	private Integer id;
	private String name;
	private Double salary;

	// constructors
	public EmployeeS() {

	}

	public EmployeeS(Integer id, String name, Double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// encapsulation
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	// methods
	public void increaseSalary(double percentage) {
		this.salary *= (1 + percentage);
	}

}
