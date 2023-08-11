package com.casestudy;
import java.util.List;
import java.util.ArrayList;


public class Ex2 {

	public static void main(String[] args) {
		 List<Person> personList = new ArrayList<>();

	        personList.add(new Person("Alice", "roh@example2.com"));
	        personList.add(new Person("Bob", "alexa@example2.com"));
	        personList.add(new Person("Ali", "suh@example2.com"));

	        personList.forEach(person -> System.out.println(person.getPersonName() + ": " + person.getEmailld()));

	}

}
