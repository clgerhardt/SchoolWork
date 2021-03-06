package prob1;

import java.io.File; 
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AirportLoader {

	// Write this method. It should read the airport file and return
	// a list of Airports.
	public static List<Airport> getAirportList(String fileName) throws IOException {

		List<Airport> AirportList = new ArrayList<>();
		String s = "src/prob1/" + fileName;

		File inFile = new File(s);

		try {
			Scanner input = new Scanner(inFile);
			while (input.hasNext()) {

				String code = input.next();
				Double lat = input.nextDouble();
				Double longt = input.nextDouble();
				String city = input.next();
				String state = input.next();

				Airport a = new Airport(code, lat, longt, city, state);
				
				//System.out.println(a);
				if(!AirportList.contains(a)){
					AirportList.add(a);
					//System.out.println("added:" + a);
				}
				else{
				Airport DummyA = new Airport(code, lat, longt, city, state);
				//System.out.println("not added:" + DummyA);
				}
				
				}
			
			input.close();
			
			//
			//System.out.println(AirportList);
		}

		catch (IOException e) {
			System.out.println(e);
		}

		
		return AirportList;
	}
}
