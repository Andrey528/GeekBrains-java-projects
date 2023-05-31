package javaOOP.homeWork6.Task1.Models;

public class Persister implements Save{
	private User user;

	public Persister(User user){
		this.user = user;
	}

	public void save(){
		System.out.println("Save user: " + user.getName());
	}
}