package javaProgram;

public class Salary {
	int Id;
	int Salary;
	
	public void setSalary(int myId,int mysalary) {
		if(mysalary <5000) {
			System.out.println("Your salary is Low");
		}else {
			this.Salary=mysalary;
			this.Id=myId;
		}
		
	}
	public int getSalary() {
		return Salary;
	}
	public static void main(String[] args) {
		Salary sa = new Salary();
		sa.setSalary(10, 1000);
		System.out.println(sa.getSalary());
	}

}
