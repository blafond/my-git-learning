package main.java.org.hibernate.learning;

public class FirstClass {
	public static void main(String[] args) {
		PrintClass printMsg = new PrintClass();
		String msg = " >>> FirstClass.java class :  main()";
		printMsg.logToSystem( msg, "\t\tSTARTED" );
		printMsg.logToSystem( msg, "\t\tCOMPLETED!!!!" );
	}
}
