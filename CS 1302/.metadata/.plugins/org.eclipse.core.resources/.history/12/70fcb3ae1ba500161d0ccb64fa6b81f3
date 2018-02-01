package prob2;

import java.util.Scanner;

public class WordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input String: ");
		String str = keyboard.nextLine();
		//
		System.out.println("reverseWords(): " + reverse(str));
	}

	public static String reverse(String str) {
		String[] sent = str.split(" ");

		String str2 = "";
		for (int i = sent.length - 1; i >= 0; i--) {
			str2 += sent[i] + " ";
		}
		return str2;
	}
	/*
	 * i was trying to use lastOf to get the reverse of the string but was
	 * running into issues, also trying to use some recursion, you had mentioned
	 * it in class today but i got interested in how to do it. if you can figure
	 * anything out lemme know. 
	 
	 * public static String reverseString(String str){
	 * int i = str.indexOf(" "); return reverse(str.substring(i+1)) + " " +
	 * str.substring(0, i);
	  
	}
	 */
}
