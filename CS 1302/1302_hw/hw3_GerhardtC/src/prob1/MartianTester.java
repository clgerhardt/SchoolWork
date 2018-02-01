package prob1;

public class MartianTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		MartianManager RedVsGreen = new MartianManager();
		//The number entered is the id of the individual martian but also correlates 
		//with their power level.
		RedMartian DarthVader = new RedMartian(8750);
		RedMartian KyloRen = new RedMartian(6830);
		RedMartian SithLord = new RedMartian(9356);
		RedMartian GeneralGrievous = new RedMartian(7890);
		RedMartian DarthMual = new RedMartian(5007);
		
		
		GreenMartian Yoda = new GreenMartian(9370);
		GreenMartian LukeSkywalker = new GreenMartian(9000);
		GreenMartian Chewbacca = new GreenMartian(5555);
		GreenMartian HanSolo = new GreenMartian(5703);
		GreenMartian R2D2 = new GreenMartian(9000);
		
		//RedVsGreen.addMartian(new RedMartian(23));
		
		System.out.println("A long time ago in a galaxy far, far away....");
		System.out.println("Each force gathers their best fighters.");
		System.out.print(RedVsGreen.addMartian(DarthVader) + ", ");	
		DarthVader.setVolume(43);
		System.out.print(RedVsGreen.addMartian(KyloRen) + ", ");
		KyloRen.setVolume(25);
		System.out.print(RedVsGreen.addMartian(SithLord) + ", ");
		SithLord.setVolume(23);
		System.out.print(RedVsGreen.addMartian(GeneralGrievous) + ", ");
		GeneralGrievous.setVolume(74);
		System.out.print(RedVsGreen.addMartian(DarthMual) + ", ");
		DarthMual.setVolume(32);

		System.out.print(RedVsGreen.addMartian(Yoda) + ", ");
		Yoda.setVolume(14);
		System.out.print(RedVsGreen.addMartian(LukeSkywalker) + ", ");	
		LukeSkywalker.setVolume(28);
		System.out.print(RedVsGreen.addMartian(Chewbacca) + ", ");
		Chewbacca.setVolume(68);
		System.out.print(RedVsGreen.addMartian(HanSolo) + ", ");
		HanSolo.setVolume(35);
		System.out.println(RedVsGreen.addMartian(R2D2) + "\n");
		R2D2.setVolume(54);
		
		System.out.println("Is LukeSkywalker equal to R2D2 :" + LukeSkywalker.equals(R2D2));
		System.out.println("Lets Bring Luke with us instead of R2D2");
		
		System.out.println("Now lets warp drive to the Death Star. ");
		System.out.println(RedVsGreen.groupTeleport("Death Star"));
		
		System.out.println("**ToString**");
		System.out.print(Chewbacca + ", \n");	
		System.out.println(GeneralGrievous + " \n");
		
		System.out.println("**CompareTo**");
		System.out.println("DarthVader compared to Yoda:" + DarthVader.compareTo(Yoda));
		System.out.println("LukeSkywalker compared to R2D2:" + LukeSkywalker.compareTo(R2D2));

		System.out.println("\n**Equals** aka battle between father and son");
		System.out.println("Is HanSolo equal to KyloRen :" + HanSolo.equals(KyloRen));
		System.out.println("KyloRen take out HanSolo: " + RedVsGreen.removeMartian(5703));
		
		
		System.out.println("\nEach Group shouts there fighing words:");
		System.out.println(RedVsGreen.groupSpeak());
		
		Martian JengoFett = new RedMartian(3420);
		JengoFett.setVolume(36);
		Martian CloneTrooper = (Martian)JengoFett.clone();
		CloneTrooper.setVolume(40);
		System.out.println("JengoFett Original:" + JengoFett.getId() + ", " + JengoFett.getVolume());
		System.out.println("CloneTrooper:" + CloneTrooper.getId() + ", " + CloneTrooper.getVolume());
		
		System.out.println("\nSorting the two groups based on there power levels(id)");
		System.out.println(RedVsGreen.sortedMartians());
		System.out.println("\nOriginal order:");
		System.out.println(RedVsGreen.groupSpeak());
		
		System.out.println("\nWho needs to fight the Sith Lord?");
		System.out.println(RedVsGreen.getMartianClosestToId(9366));
		System.out.println("So it'll be Yoda who fights the Sith Lord.");
		System.out.println("Not Strong enough the force was in this one-Yoda:" + SithLord.equals(Yoda) + ", " + RedVsGreen.removeMartian(9356));
		System.out.println(RedVsGreen.groupSpeak());
		
		MartianManager RedVsGreenClone = (MartianManager)RedVsGreen.clone();
		
		System.out.println("\nChewwy blow the death star, *plants bomb*, *click*");
		RedVsGreen.obliterateTeleporters();
		System.out.println(RedVsGreen.groupSpeak());
		
		System.out.println("\n");
		System.out.println(RedVsGreenClone.addMartian(CloneTrooper));
		System.out.println("Clonetrooper slays Yoda from behind, ");
		System.out.println(RedVsGreenClone.removeMartian(9370));
		System.out.println(RedVsGreenClone.groupSpeak());
		System.out.println(RedVsGreen.groupSpeak());
		System.out.println("\n...THE CLONE WARS...");
		System.out.println("...To be continued...");
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("TESTING GM CLONE METHOD");
		System.out.println();
		System.out.println("making a mm");
		System.out.println("MartianManager mm = new MartianManager();");
		MartianManager mm = new MartianManager();
		Martian gm = new GreenMartian(35);
		mm.addMartian(gm);
		MartianManager mc = (MartianManager)mm.clone();
		Martian gm2 = new GreenMartian(36);
		mc.addMartian(gm2);
		gm2.setVolume(3);
		//ITeleporter tel1 = (ITeleporter)gm;
		//ITeleporter tel2 = (ITeleporter)gm2;
		System.out.println("mm teleporters " + mm.toString());
		System.out.println();
		System.out.println("mc teleporters " + mc.toString());
		
	
	}

}
