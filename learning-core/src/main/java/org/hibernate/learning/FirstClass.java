package main.java.org.hibernate.learning;

public class FirstClass {
	private static final String primaryMsg = " >>> FirstClass.java class :  main()";
	public static void main(String[] args) {
		PrintClass printMsg = new PrintClass();
		printMsg.logToSystem( primaryMsg, "\t\tSTARTED" );

		printMsg.printIntegers( 1, 10 );

		printMsg.logToSystem( primaryMsg, "\t\tCOMPLETED!!!!" );
	}
}
