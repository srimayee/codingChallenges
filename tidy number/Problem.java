package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {

		Scanner scanner;
		try {
			scanner = new Scanner(new File("C:\\Users\\smadasu\\Downloads\\Problem 1.in"));
			//skip first line
			scanner.nextInt();
			//iterate on lines from input file
			int lineNum = 1;
			while(scanner.hasNextInt()){
				System.out.println("Case #"+ lineNum++ +": "+findTidyNumber(scanner.nextInt()));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Input file not found");
			e.printStackTrace();
		}
	}

	public static Integer findTidyNumber(Integer n) {
		/*
		 * if(n < 10) { return n; } //this can be included in the while loop
		 */
		while(n > 9){ //if n is less than 10 then return n
			if(isTidy(n)){
				break;//if tidy number is found, break out of loop and return n
			}
			n --;
		}
		return n;
	}

	public static Boolean isTidy(Integer n) {
		//convert integer to char array
		char[] charArray = n.toString().toCharArray();
		//point index to the last character and iterate in reverse order
		int index = charArray.length-1;
		while(index > 0) {
			//compare a digit with previous digit.
			if(charArray[index] < charArray[index-1]) { //this will not execute when index is 0
				return false;
			}
			index--;
		}
		return true;
	}

}
