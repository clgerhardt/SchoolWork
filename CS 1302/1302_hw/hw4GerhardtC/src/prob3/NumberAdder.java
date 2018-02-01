package prob3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberAdder {

	public static void main(String[] args) {
		ArrayList<Integer> ints = new ArrayList<>();
		File inFile = new File("src/prob3/values1.txt");
		
//		System.out.println("File exists   : " + inFile.exists());
//		System.out.println("File size     : " + inFile.length() + " bytes");
//		System.out.println("Can be read   : " + inFile.canRead());
//		System.out.println("Can be written: " + inFile.canWrite());
//		System.out.println("Is a directory: " + inFile.isDirectory());
//		System.out.println("Is a file     : " + inFile.isFile());
//		System.out.println("Is hidden     : " + inFile.isHidden());
//		System.out.println("Absolute path : " + inFile.getAbsolutePath());
//		System.out.println("Path          : " + inFile.getPath());
//		System.out.println("Parent        : " + inFile.getParent());
//		System.out.println("Name          : " + inFile.getName());
//		// Must compute the "true" path
//		String absPath = inFile.getAbsolutePath();
//		int begOfFileName = absPath.lastIndexOf(inFile.getName());
//		String truePath = absPath.substring(0,begOfFileName);
//		System.out.println("True path     : " + truePath);
//
//		System.out.println("Last modified : " + new java.util.Date(inFile.lastModified()));
//
		
		try {
			Scanner input = new Scanner(inFile);
			int sum = 0;
			while(input.hasNext()) {
				if (input.hasNextInt()) {
					int newInt = input.nextInt();
					sum += newInt;
				}
				else if (input.hasNext()) {
					String token = input.next();
					// System.out.println(token);
					String number = token.substring(1);
					// System.out.println(number);
					Integer num = Integer.valueOf(number);
					// System.out.println(num);
					for(int x = 0; x < num; x++){
						int bleh =	input.nextInt();
						ints.add(bleh);
					}

				}

			}
			input.close();
			System.out.println("Sum = " + sum);
			System.out.println("Skipped Numbers: " + ints);

			
		}

		catch (IOException e) {
			System.out.println(e);
		}

	}
}
