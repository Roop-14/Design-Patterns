import java.lang.reflect.Constructor;

class Student{
	private int id;
	private String name;
	private String address;
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
}
public class ReflectionDemo {
	public static void main(String[] args) throws ClassNotFoundException{
		
		Class<?> studentClass=Class.forName("Student");
		
		Constructor<?>[] constructors=studentClass.getConstructors();
		for(Constructor constructor:constructors) {
			System.out.println(constructor);
		}
	}

}
