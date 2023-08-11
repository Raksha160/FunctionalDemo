package com.casestudy;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;


public class Ex4 {

	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Roo", "City A", 150.0f));
        customers.add(new Customer("Bat", "City B", 250.0f));
        customers.add(new Customer("Ani", "City C", 100.0f));

        customers.sort(Comparator.comparingDouble(Customer::getPlanAmount));

        Predicate<Customer> filter = customer -> customer.getPlanAmount() >= 200.0f;
        customers.removeIf(filter.negate());

        
        for (Customer customer : customers) {
            System.out.println(customer.customerName + " - " + customer.planAmount);
        }

	}

}
