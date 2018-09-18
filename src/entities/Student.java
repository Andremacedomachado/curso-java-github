package entities;

public class Student {
	public String name;
	public double n1;
	public double n2;
	public double n3;

	public double finalGrade() {
		return (n1 + n2 + n3);
	}

	public String approvedOrDisapproved() {
		if (finalGrade() >= 60.0) {
			return "PASS";
		} else {
			return "FAILED \nMISSING "+ missing()+ " POINTS";
		}
	}
	
	public double missing(){
		return  60.0 - finalGrade();
	}
	
	public String toString(){
		return "FINAL GRADE = "+ finalGrade() +"\n" + approvedOrDisapproved();
	}
}
