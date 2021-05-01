package homeWork2;

public class Course {
		
	
	public Course(String name, int price, int lesson) {
		
		this.name=name;
		this.price=price;
		this.lesson=lesson;
		
		
	}
	
	public Course() {
	
	}
	
	public Course(String name,int lesson) {
		this.name=name;
		this.lesson=lesson;
	}
	
	
	String name;
	int price;
	int lesson;
}
