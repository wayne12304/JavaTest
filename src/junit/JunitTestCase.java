package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestCase {

	@Test
	public void testA() {
		int score = 99;
		assertEquals('A', Grade.letterGrade(score));
		System.out.println(Grade.letterGrade(score));
		score = 90; 
		assertEquals('A', Grade.letterGrade(score));
		System.out.println(Grade.letterGrade(score));
	}
	
	@Test
	public void testB() {
		int score = 89;
		assertEquals('B', Grade.letterGrade(score));
		System.out.println(Grade.letterGrade(score));
		score = 80;
		assertEquals('B', Grade.letterGrade(score));
		System.out.println(Grade.letterGrade(score));
	}
	
	@Test
	public void testC() {
		int score = 79;
		assertEquals('C', Grade.letterGrade(score));
		System.out.println(Grade.letterGrade(score));
		score = 70;
		assertEquals('C', Grade.letterGrade(score));
		System.out.println(Grade.letterGrade(score));
	}
	
	@Test
	public void testD() {
		int score = 69;
		assertEquals('D', Grade.letterGrade(score));
		System.out.println(Grade.letterGrade(score));
		score = 60;
		assertEquals('D', Grade.letterGrade(score));
		System.out.println(Grade.letterGrade(score));
	}
	
	@Test
	public void testF() {
		int score = 59;
		assertEquals('F', Grade.letterGrade(score));
		System.out.println(Grade.letterGrade(score));
		score = 0;
		assertEquals('F', Grade.letterGrade(score));
		System.out.println(Grade.letterGrade(score));
	}
	
	@Test
	public void testX() {
		int score = 101;
		assertEquals('X', Grade.letterGrade(score));
		System.out.println(Grade.letterGrade(score));
		score = -1;
		assertEquals('X', Grade.letterGrade(score));
		System.out.println(Grade.letterGrade(score));
	}


}
