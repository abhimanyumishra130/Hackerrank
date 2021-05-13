//question link--https://www.hackerrank.com/challenges/30-inheritance/problem?isFullScreen=false



import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] testScores){
            super(firstName,lastName,id);
            this.firstName=firstName;
            this.lastName=lastName;
            this.idNumber=id;
            this.testScores=testScores;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    
    public char calculate(){
    int sum=0;
    int avg=0;
    for(int i=0;i<testScores.length;i++){
            sum=sum+testScores[i];
    }
    avg=sum/testScores.length;
    if(avg<=100 && avg>=90){
            return 'O';
            
    }else if(avg<90 && avg>=80){
            return 'E';
            
    }else if(avg<80 && avg>=70){
            return 'A';
            
    }else if(avg<70 && avg>=55){
            return 'P';
            
    }else if(avg<55 && avg>=40){
            return 'D';
            
    }else if(avg<40 && avg>=0){
            return 'T';      
    }
    else{
            return '0';
    }
    }
}

class Solution {
