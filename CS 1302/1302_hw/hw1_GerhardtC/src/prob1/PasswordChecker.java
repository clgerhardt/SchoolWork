package prob1;

import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Password: ");
		String password = keyboard.nextLine();
		if (password.length() < 6) {
			System.out.print("Is not long enough");
		} else {
			System.out.println("isLevel1():" + isLevel1(password));
			System.out.println("isLevel2():" + isLevel2(password));
		}

	}

	public static boolean isLevel1(String str) {

		return isUpperCase(str) && isLowerCase(str) || isLowerCase(str) && isDigit(str)
				|| isDigit(str) && isUpperCase(str);

	}

	public static boolean isLevel2(String str) {

		return isUpperCase(str) && isLowerCase(str) && isDigit(str);

	}

	public static boolean isUpperCase(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i)))
				return true;
		}

		return false;
		

	}

	public static boolean isLowerCase(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i)))
				return true;
		}
		return false;

	}

	public static boolean isDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				return true;
		}
		return false;

	}
}
