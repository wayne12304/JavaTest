package junit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sIn = new Scanner(System.in);
		do { 
			int score = sIn.nextInt();
			System.out.println(Grade.letterGrade(score));
		} while(true);
	}

} 
