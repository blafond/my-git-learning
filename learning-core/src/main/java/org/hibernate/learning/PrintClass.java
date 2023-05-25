package main.java.org.hibernate.learning;

public class PrintClass {
	public void logToSystem(String msg) {
		System.out.println(msg);
	}

	public void logToSystem(String msg, String anotherMsg) {
		System.out.println(msg + "\n" + anotherMsg);
	}
}
