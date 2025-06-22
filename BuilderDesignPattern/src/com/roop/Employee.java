package com.roop;

public class Employee {
	  // Required fields
    private final int id;
    private final String name;

    // Optional fields
    private final String department;
    private final double salary;
    private final String email;

    // Private constructor to force use of builder
    private Employee(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.department = builder.department;
        this.salary = builder.salary;
        this.email = builder.email;
    }

    // Getters only (immutable pattern)
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public String getEmail() { return email; }

    public static class Builder{
    	 // Required fields
        private final int id;
        private final String name;

        // Optional fields
        private String department;
        private double salary;
        private String email;
        
        public Builder(int id,String name) {
        	this.id=id;
        	this.name=name;
        }
        
        public Builder department(String department) {
        	this.department=department;
        	return this;
        }
        
        public Builder salary(double salary) {
        	this.salary=salary;
        	return this;
        }
        
        public Builder email(String email) {
        	this.email=email;
        	return this;
        }
        
        public Employee build() {
        	return new Employee(this);
        }
     
    }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", email=" + email + "]";
	}
    
}
