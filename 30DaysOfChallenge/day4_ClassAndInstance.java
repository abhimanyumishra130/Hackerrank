//question link---https://www.hackerrank.com/challenges/30-class-vs-instance/problem


import java.io.*;
import java.util.*;

public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
                  if(initialAge<0){
                          System.out.println("Age is not valid, setting age to 0.");
                          initialAge=0;
                  }
                  else {
                        age = initialAge;
                  }
	}

	public void amIOld() {
               
                if(age<13){
                        
                        System.out.println("You are young.");
                }else if(age>=13 && age<18){
                       
                        System.out.println("You are a teenager.");
                }else{
                       
                        System.out.println("You are old.");
                }
  		// Write code determining if this person's age is old and print the correct statement:
        //System.out.println(state);
	}

	public void yearPasses() {
  		// Increment this person's age.
                 age++;
	}

	public static void main(String[] args) {
