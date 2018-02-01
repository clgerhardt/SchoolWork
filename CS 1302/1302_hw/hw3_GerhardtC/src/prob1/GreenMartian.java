package prob1;

public class GreenMartian extends Martian implements ITeleporter {

	public GreenMartian(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public String speak() {
		String result = String.format( "id= %d ,Grobldy Grock" , getId());

		return result;
	}
	public String teleport(String dest){
		String result = String.format( "id= %d teleporting to %s " , getId() , dest);
		return result;
	}
	public String toString(){
		String result = String.format("id= %d, vol= %d", getId() , getVolume()); 
		return result;
	}


}
