package javaOOP.homeWork6.Task1;
import javaOOP.homeWork6.Task1.Models.Persister;
import javaOOP.homeWork6.Task1.Models.User;

/**
 * Реструктуризировать проект HomeWork с учетом теоретических основ SOLID’а
 */

public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		Persister persister = new Persister(user);
		user.report();
		persister.save();
	}
}