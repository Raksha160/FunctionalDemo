package com.casestudy;
import java.util.function.Predicate;

public class Ex3 {

	public static void main(String[] args) {
int[] ageArray = {12, 23, 11, 19, 35, 22};
		
        Candidate candidate = new Candidate();
        Predicate<Integer> agePredicate = candidate::checkAge;
        for (int age : ageArray) {
            agePredicate.test(age);
        }

	}

}
