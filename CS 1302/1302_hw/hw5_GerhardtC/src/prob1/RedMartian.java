
package prob1;

public class RedMartian extends Martian {

	public RedMartian(int id, int vol) {
		super(id,vol);
		// TODO Auto-generated constructor stub
	}

	
	public String speak() {
		String result = String.format( "id= %d ,Rubldy Rock" , getId());
		return result;
	}
	
	public String toString(){
		String result = String.format("id= %d, vol= %d", getId() , getVolume()); 
		return result;
	}

	public String toString2(){
		String result = String.format("%d-Red", getId()); 
		return result;
	}
}
