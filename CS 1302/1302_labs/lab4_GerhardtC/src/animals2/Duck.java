package animals2;

public class Duck implements Swimmer, Flyer {

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "duck flying";
	}

	@Override
	public String swim() {
		// TODO Auto-generated method stub
		return "duck swimming";
	}

	@Override
	public String dive() {
		// TODO Auto-generated method stub
		return "duck diving";
	}

}
