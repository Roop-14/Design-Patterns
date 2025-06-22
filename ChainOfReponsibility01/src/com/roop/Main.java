package com.roop;

public class Main {

	public static void main(String[] args) {
		Validator username=new UsernameValidator();
		username.linkWith(new EmailValidtor()).linkWith(new PasswordValidtor());
		
		User user =new User("Roopam", "roopam@gmail.com", "140793");
		System.out.println(username.validate(user));
		

	}

}
