package exception_examples1;

public class Example1 {
	public static void main(String[] args) {
		System.out.println("Answers:");
		System.out.println("a. StringIndexOutOfBoundsException ");
		System.out.println("b. 8 is out of the index range ");
		System.out.println("c. line 11 is where exception was thrown, line 6 was the call to method ");
		System.out.println("d. no it doesnt execute because when the exception is thrown the program terminates");

		char c = getCharAt("help", 8);
		System.out.println( c );

	}
	
	public static char getCharAt(String msg, int pos) {
		return msg.charAt(pos);
	}

}
