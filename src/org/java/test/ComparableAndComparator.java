package org.java.test;

import java.util.Comparator;

//测试comparable与comparator的用法
public class ComparableAndComparator
{
	public static void main(String[] args){
		Student[] students =   {new Student("Leo",20,88f),
								new Student("Tim",20,89f),
								new Student("Libra",20,90f),
								new Student("Green",20,93f),
								new Student("Sara",20,71f)};
		
		for(Student s : students){
			System.out.println(s);
		}
		System.out.println();
		java.util.Arrays.sort(students);
		for(Student s : students){
			System.out.println(s);
		}
		
		Teacher[] teachers = {new Teacher("Leo",20,8888),
							  new Teacher("Tim",20,8923),
							  new Teacher("Libra",20,9000),
							  new Teacher("Green",20,933),
							  new Teacher("Sara",20,7156)};
		
		for(Teacher t : teachers){
			System.out.println(t);
		}
		
		java.util.Arrays.sort(teachers,new TeacherComparator());
		
		for(Teacher t : teachers){
			System.out.println(t);
		}
	}
}

class Student implements Comparable<Student>{
	
	private String name;
	private int age;
	private float score;
	
	
	public Student(String name, int age, float score)
	{
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public String toString(){
		return name+"|"+age+"|"+score;
	}
	
	@Override
	public int compareTo(Student o)
	{
		if(this.score > o.score){
			return 1;
		}
		else if(this.score < o.score){
			return -1;
		}
		else{
			return 0;
		}
	}
}

class Teacher {
	private String name;
	private int age;
	private int salary;
	
	public Teacher(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString(){
		return name+"|"+age+"|"+salary;
	}
}

class TeacherComparator implements Comparator<Teacher>{

	@Override
	public int compare(Teacher o1, Teacher o2) {
		if(o1.getSalary() < o2.getSalary()){
			return -1;
		}
		else if(o1.getSalary() > o2.getSalary()){
			return 1;
		}
		else{
			return 0;
		}
	}
}