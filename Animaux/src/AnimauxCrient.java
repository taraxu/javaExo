
public class AnimauxCrient {

	public static void main(String[] args) {
		
		AvecCrier[] tab = new AvecCrier[3];
		tab[0] = new Chien();
		tab[1] = new Chat();
		tab[2] = new Lapin();
		for (int i=0; i<3; i++) {
			System.out.println(tab[i].crier());
		}
	}

}
