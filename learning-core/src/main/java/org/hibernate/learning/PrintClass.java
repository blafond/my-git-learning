package main.java.org.hibernate.learning;

public class PrintClass {
	public void logToSystem(String msg) {
		System.out.println(msg);
	}

	public void logToSystem(String msg, String anotherMsg) {
		System.out.println(msg + "\n" + anotherMsg);
	}

	public void printIntegers( int start, int howMany) {
		logToSystem( "\nSTART = " + start + " How many = " + howMany );
		for( int i = start; i< howMany; i++) {
			System.out.println("\t" + i);
		}

	}

	public void printIntegersWithMultiplier( int start, int howMany, int multiplier) {
		logToSystem( "\nSTART = " + start + " How many = " + howMany + " Multiplier = " + multiplier);
		for( int i = start; i< howMany; i++) {
			System.out.println("\t" + i*multiplier);
		}
	}
}
