package solution;

import java.util.Scanner;


public class Dial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		

		int time = 0 ;

		String input = scan.nextLine();

		

		for(int i = 0 ; i < input.length(); i ++) {
			char charIndex = input.charAt(i);
			if( charIndex >='A' && charIndex <= 'C' ) {
				time += 3;
			} else if( charIndex >='D' && charIndex <= 'F' ) {
				time += 4;
			} else if( charIndex >='G' && charIndex <= 'I' ) {
				time += 5;
			} else if( charIndex >='J' && charIndex <= 'L' ) {
				time += 6;
			} else if( charIndex >='M' && charIndex <= 'O' ) {
				time += 7;
			} else if( charIndex >='P' && charIndex <= 'S' ) {
				time += 8;
			} else if( charIndex >='T' && charIndex <= 'V' ) {
				time += 9;
			} else if( charIndex >='W' && charIndex <= 'Z' ) {
				time += 10;
			}			
		}		

		System.out.println(time);

		

	}



}

