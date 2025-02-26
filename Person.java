package task;

public class Person {
	String name;
	int age;
	
	public void introduce(String name,int age) {
		this.name=name;
		this.age=age;
		
		System.out.println(name);
		System.out.println(age);
	}
  public static void main(String [] args) {
	  Person a = new Person();
	  a.introduce("Jomesh",19);
  }
}
