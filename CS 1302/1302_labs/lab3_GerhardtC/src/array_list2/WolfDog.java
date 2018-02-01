package array_list2;

public class WolfDog extends Dog {
	public WolfDog(String name) {
		super(name);
	}
	
	public String howl() {
		return getName() + " is howling";
	}
	@Override
	public String bark() {
		return getName() + " is WolfDog BARKING";
	}

	@Override
	public String toString() {
		return "WolfDog named " + getName();
	}
}
