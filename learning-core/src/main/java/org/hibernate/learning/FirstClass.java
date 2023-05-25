package main.java.org.hibernate.learning;

public class FirstClass {
	private static final String primaryMsg = " >>> FirstClass.java class :  main()";
	public static void main(String[] args) {
		PrintClass printMsg = new PrintClass();
		printMsg.logToSystem( primaryMsg, "\t\tSTARTED" );
		printMsg.logToSystem( primaryMsg, "\t\tCOMPLETED!!!!" );
	}
}
