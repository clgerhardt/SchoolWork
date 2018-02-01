package prob1;

public class Airport implements Comparable<Airport>{
	 
	private String code;
	private double lat;
	private double longt;
	private String city;
	private String state;
	
	public Airport(String code, double lat, double longt, String city, String state){
		this.code = code;
		this.lat = lat;
		this.longt = longt;
		this.city = city;
		this.state = state;
	}
	
	public Airport(String code){
		this.code = code;
	}
	public int compareTo(Airport a){
		
		double diff = this.code.compareTo(a.getCode());
		if(diff < 0) return -1;
		else if(diff > 0) return 1;
		else return 0;
	}

	public boolean equals(Object o){
		Airport a = (Airport)o;
		//System.out.println(this.code + " \\\\\\" + a.getCode());
		return this.code.equals(a.getCode());
	}
	
	public String getCode() {
		return code;
	}

	public String setCode(String code) {
		this.code = code;
		return code;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLongt() {
		return longt;
	}

	public void setLongt(double longt) {
		this.longt = longt;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public String toString(){
		String result = String.format("%s-%s, %s: %.2f, %.2f", getCode(), getCity(), getState(), getLat(), getLongt());
		return result;
	}


}
