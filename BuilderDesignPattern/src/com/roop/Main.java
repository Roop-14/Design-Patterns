package com.roop;

public class Main {
	public static void main(String[] args) {
//		Employee e1=new Employee.Builder(101, "Roopa Mondal")
//				.department("IT")
//				.email("roopammondal14@gmail.com")
//				.build();
//		
//		System.out.println(e1);
//		
		
		User user=new User.Builder("14", "snigdha")
				.setUserAge("26")
				.build();
		
		System.out.println(user);
	}

}
