package com.roop;

public abstract class Validator {
	
	 Validator next;
	
	public Validator linkWith(Validator validator) {
		this.next=validator;
		return this;
	}
	
	  public abstract boolean validate(User user);

}

 class UsernameValidator extends Validator{

	@Override
	public boolean validate(User user) {
		if(user.getUsername()==null || user.getUsername().isEmpty()) {
			 System.out.println("Validation failed: Username is empty.");
             return false;
		}if(user.getUsername()!=null) return next.validate(user);
		
		return true;
		
	}
 }
	
 class EmailValidtor extends Validator{
	 @Override
	public boolean validate(User user) {
		 if(user.getEmail()==null || user.getEmail().isEmpty()) {
			 System.out.println("Validation failed: Invalid email format.");
             return false;
		 }if(user.getEmail()!=null) return next.validate(user);
		
		return true;
	}
 }
 class PasswordValidtor extends Validator{
	 @Override
	 public boolean validate(User user) {
		 if(user.getPassword()==null || user.getPassword().isEmpty()) {
			 System.out.println("Validation failed: Invalid Passwprd format.");
			 return false;
		 }
		 
		 return true;
	 }
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
	 
	 
	
