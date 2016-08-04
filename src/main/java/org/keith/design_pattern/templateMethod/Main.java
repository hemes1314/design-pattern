package org.keith.design_pattern.templateMethod;


public class Main {

	public static void main(String[] args) {
		
		TestPaper test1 = new TestPaper1();
		test1.question1();
		test1.question2();
		test1.question3();
		TestPaper test2 = new TestPaper2();
		test2.question1();
		test2.question2();
		test2.question3();
	}
}
