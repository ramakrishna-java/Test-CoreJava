package comparablee.test;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort1 {
	public static void main(String args[]){  
		ArrayList<Student> al=new ArrayList<Student>(); 
		
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21)); 
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
	}
	

}
//java TestSort1 "rama" "krishna"