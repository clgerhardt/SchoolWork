package prob1;

public abstract class Martian implements Cloneable, Comparable<Martian>{
	private int id;
	private int volume;
	
	public Martian(int id){
		this.id = id;
		this.volume = 1;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public int compareTo(Martian m){

		double diff = this.id - m.id;
		if(diff < 0) return -1;
		else if(diff > 0) return 1;
		else return 0;
		
	}
	public boolean equals(Object o){
		Martian m = (Martian)(o);
		return id == m.getId();
	}
	
	public int getId() {
		return id;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int level) {
		this.volume = level;
	}
	
	public abstract String speak();
	
	public String toString(){
		String result = String.format("id= %d, vol= %d", getId() , getVolume()); 
		return result;
	}
}
