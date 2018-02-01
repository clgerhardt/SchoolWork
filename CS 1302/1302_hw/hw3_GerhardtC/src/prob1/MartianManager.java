package prob1;

import java.util.ArrayList;
import java.util.Collections;

public class MartianManager implements Cloneable {
	private ArrayList<Martian> martians;
	private ArrayList<ITeleporter> teleporters;

	public MartianManager() {
		martians = new ArrayList<>();
		teleporters = new ArrayList<>();
	}

	public boolean addMartian(Martian m) { // done checked
		if (!martians.contains(m)) {
			martians.add(m);
			if (m instanceof GreenMartian) {
				ITeleporter tel = ((GreenMartian) m);
				teleporters.add(tel);
			}
			return true;
		}
		return false;
	}

	public Object clone() throws CloneNotSupportedException { // done
		MartianManager mc = (MartianManager) super.clone();
		mc.martians = new ArrayList<>();
		mc.teleporters = new ArrayList<>();
		for (Martian e : martians) {
			mc.addMartian((Martian) e.clone());
		}

		return mc;
	}

	public Martian getMartianClosestToId(int id) { // done figure out how to set
													// the min to the first
													// elements id in element
		int Diff;
		int minDiff = Integer.MAX_VALUE;
		Martian closem = null;
		for (Martian m : martians) {
			Diff = Math.abs(m.getId() - id);// reverse subtraction maybe??
			if (Diff < minDiff) {
				minDiff = Diff;
				closem = m;

			}

		}
		return closem;
	}

	public String groupSpeak() {
		String result = " ";
		for (Martian e : martians) {
			result += e.speak() + "\n";
		}
		;
		return result;
	}

	public String groupTeleport(String dest) {
		String result = " ";
		for (ITeleporter t : teleporters)
			result += t.teleport(dest) + "\n";
		return result;
	}

	public void obliterateTeleporters() {
		teleporters.clear();
		int i = martians.size() - 1;
		while (i >= 0) {
			if (martians.get(i) instanceof GreenMartian) {
				martians.remove(i);
			}
			i--;
		}
	}

	public boolean removeMartian(int id) {
		int i = martians.size() - 1;
		Martian m = martians.get(i);
		while (i >= 0) {
			if (m.getId()==id) {
				martians.remove(m);
				if (m instanceof GreenMartian) {
					ITeleporter t = (GreenMartian) m;
					teleporters.remove(t);
				}
				return true;
			}
			i--;
			m = martians.get(i);
		}
		return false;
		
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Martian> sortedMartians() {
		ArrayList<Martian> clonedSortedM = (ArrayList<Martian>) martians.clone();

		Collections.sort(clonedSortedM);
		return clonedSortedM;

	}
	
	public String toString() {
		String s = "";
		for(ITeleporter gm : teleporters) {
			s += gm.toString();
		}
		return s;
	}

}
