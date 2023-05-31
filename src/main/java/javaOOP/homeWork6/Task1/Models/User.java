package javaOOP.homeWork6.Task1.Models;

public class User implements Report {
	private String name;
	
	public User(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	public void report(){
		System.out.println("Report for user: " + name);
	}
}