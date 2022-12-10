package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortStudent {
	static ArrayList<Student> list=new ArrayList<Student>();
	
	public static void listuser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student name.....");
		String n = sc.next();
		for(int i =0;i<list.size(); i++) {
			if(list.get(i).name.equalsIgnoreCase(n)) {
				System.out.println("Math :"+list.get(i).math);
				System.out.println("physice :"+list.get(i).physics);
				System.out.println("Chemistry :"+list.get(i).chemistry);
			}
			else
			{
				System.out.println("Name doesn't exist");
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student("Rajan",20.0,10.0,20.0);
		Student s2 = new Student("Manmahs",01.0,1.0,2.0);
		Student s3 = new Student("Raj",40.0,20.0,30.0);
		Student s4 = new Student("Munu",80.0,70.0,90.0);
		Student s5 = new Student("Buntu",80.0,80.0,60.0);
		
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Collections.sort(list);
		
//		for(Student s : list) {
//			System.out.println(s.name+" "+s.totmark);
//		}
//	//	System.out.println(list.get(0));
		
		for(int i=0; i<3; i++) {
			System.out.println(list.get(i).name+" "+list.get(i).totmark);
		}
		
		listuser();
	}

}
