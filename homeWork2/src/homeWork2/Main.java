package homeWork2;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.name = "Java";
		course1.price = 200;
		course1.lesson = 10;
		
		Course course2=new Course("C#",250,14);
		
		Course course3=new Course("C",14);
		
		Course[] courses = {course1,course2,course3};
		for (Course course : courses) {
			System.out.println(course.name + " " + course.price + " "+ course.lesson);
			
		}
		
		
		Teacher teacher1=new Teacher("Engin Demiroð", 27, 5);
		Teacher teacher2= new Teacher("Enis Makaracý", 20, 1);
		
		Teacher[] teachers= {teacher1,teacher2};
		for (Teacher teacher : teachers) {
			System.out.println(teacher.name+ " " +teacher.age+ " " +teacher.rating);
			
		}
		
		
		//example
		
		WishListManager wishListManager = new WishListManager();
		wishListManager.addWishList(course3, teacher2);
		wishListManager.addWishList(course1, teacher1);
		wishListManager.addWishList(course2, teacher2);
		
		
	
		
	
		

	}

}
