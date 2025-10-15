package javarun;

import java.util.Scanner;

public class Testjava {

	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age:");
		Scanner in= new Scanner (System.in);
		age=in.nextInt();
		if (age>=18)
		{
			System.out.println("You are Eligible for Vote");   //if statement
		}
		else
		{
			System.out.println("You are Not Eligible for vote"); //if else
		}
		
	

	}

}
