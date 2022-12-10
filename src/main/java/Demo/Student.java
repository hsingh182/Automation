package Demo;

public class Student implements Comparable<Student> {

	String name;
	Double math;
	Double physics;
	Double chemistry;
	Double totmark;
	public Student(String name, Double math, Double physics, Double chemistry) {
		super();
		this.name = name;
		this.math = math;
		this.physics = physics;
		this.chemistry = chemistry;
		this.totmark = math +physics+ chemistry ;
	}
	public int compareTo(Student o) {
		
		if (this.totmark == o.totmark )
		return 0;
		else if(this.totmark > o.totmark) 
		return -1;
		else 
		return 1;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", math=" + math + ", physics=" + physics + ", chemistry=" + chemistry
				+ ", totmark=" + totmark + "]";
	}
	
	
}
