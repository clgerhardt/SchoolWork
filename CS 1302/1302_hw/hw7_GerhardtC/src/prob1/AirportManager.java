package prob1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AirportManager {

	private List<Airport> AirportManagerList = new ArrayList<>();
	private List<Airport> ChangeManagerList = new ArrayList<>();

	public AirportManager(List<Airport> AirportManagerList) {
		this.AirportManagerList = AirportManagerList;
		this.ChangeManagerList = AirportManagerList;
	}

	public Airport getAirport(String code) {
		int indexOfAirport = 0;
		Airport DummyA = new Airport(code);
		for (Airport a : AirportManagerList) {
			// System.out.println(a + "|||||| " + DummyA);
			if ((a).getCode().equals(DummyA.getCode())) {
				indexOfAirport = AirportManagerList.indexOf(a);
			}
		}

		return AirportManagerList.get(indexOfAirport);
	}

	public double getDistanceBetween(Airport airport1, Airport airport2) {
		return DistanceCalculator.getDistance(airport1.getLat(), airport1.getLongt(), airport2.getLat(),
				airport2.getLongt());
	}

	public double getDistanceBetween(String code1, String code2) {

		Airport airport1 = this.getAirport((code1));
		Airport airport2 = this.getAirport((code2));

		return DistanceCalculator.getDistance(airport1.getLat(), airport1.getLongt(), airport2.getLat(),
				airport2.getLongt());

	}

	public Airport getAirportClosestTo(String code) {

		Airport airport1 = this.getAirport((code));
		double minDiff = Integer.MAX_VALUE;
		Airport closea = null;
		for (Airport a : AirportManagerList) {
			if (!(a).getCode().equals(airport1.getCode())) {
				double distance = DistanceCalculator.getDistance(airport1.getLat(), airport1.getLongt(), a.getLat(),
						a.getLongt());
				if (distance < minDiff) {
					minDiff = distance;
					closea = a;
				}
			}
		}

		return closea;
	}

	public List<Airport> getAirportsWithin(String code, double withinDist) {

		List<Airport> withinDistance = new ArrayList<>();

		Airport airport1 = this.getAirport((code));

		for (Airport a : AirportManagerList) {
			if (!(a).getCode().equals(airport1.getCode())) {
				double distance = DistanceCalculator.getDistance(airport1.getLat(), airport1.getLongt(), a.getLat(),
						a.getLongt());
				if (distance <= withinDist) {

					withinDistance.add(a);

				}
			}
		}

		return withinDistance;
	}

	public List<Airport> getAirportsWithin(String code1, String code2, double withinDist) {
		List<Airport> code1List = this.getAirportsWithin(code1, withinDist);
		// System.out.println("THIS LIST" + code1List);
		List<Airport> code2List = this.getAirportsWithin(code2, withinDist);
		// System.out.println("THIS LIST" + code2List);
		List<Airport> newList = new ArrayList<>();

		for (int i = 0; i < code1List.size(); i++) {
			Airport a = code1List.get(i);
			if (code2List.contains(a)) {
				newList.add(a);
			}
		}

		return newList;
	}

	public List<Airport> getAirportsSortedBy(String sortType) {

		AirportCityComparator citycomp = new AirportCityComparator();
		AirportStateComparator statecomp = new AirportStateComparator();
		if (sortType == "City") {
			Collections.sort(ChangeManagerList, citycomp);
			return ChangeManagerList;
		} else {
			Collections.sort(ChangeManagerList, statecomp);
			return ChangeManagerList;
		}
	}

	public List<Airport> getAirportsClosestTo(String code, int num) {
		// List<Airport> theclosest = new ArrayList<>();
		// List<Double> closest = new ArrayList<>();
		//
		// //AirportDistanceComparator disComp = new
		// AirportDistanceComparator();
		//
		// //System.out.println("MANAGER LIST"+AirportManagerList);
		//
		// Airport airport1 = this.getAirport((code));
		// for(Airport a : AirportManagerList ){
		// if(!(a).getCode().equals(airport1.getCode())){
		// double distance =
		// DistanceCalculator.getDistance(airport1.getLat(),airport1.getLongt(),a.getLat(),a.getLongt());
		// closest.add(distance);
		// }
		// }
		// Collections.sort(closest);
		// //System.out.println(closest);
		// for(int i = 0; i < num;i++){
		// Double d = closest.get(i);
		// for(Airport a : AirportManagerList){
		// if(!(a).getCode().equals(airport1.getCode()) ||
		// !theclosest.contains(a)){
		// double distance =
		// DistanceCalculator.getDistance(airport1.getLat(),airport1.getLongt(),a.getLat(),a.getLongt());
		// if(distance == d){
		// theclosest.add(a);
		// }
		// }
		// else{
		// continue;
		// }
		// }
		// }
		//
		// return theclosest;

		List<Airport> closest = new ArrayList<>();

		List<Airport> dummyA = new ArrayList<>();

		for (int i = 0; i < AirportManagerList.size(); i++) {
			dummyA.add(AirportManagerList.get(i));
		}

		for (int i = 0; i < num; i++) {
			Airport a = this.getAirportClosestTo(code);
			closest.add(a);
			AirportManagerList.remove(a);
		}

		AirportManagerList = dummyA;

		return closest;

	}

	public String toString() {
		String result = "The Manager list: \n";
		for (Airport a : AirportManagerList) {
			result += a.toString() + "\n";
		}
		return result;
	}

}
