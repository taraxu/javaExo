
public class Test {

	public static void main(String[] args) {
		//Compte c1 = new Compte();
//		
//		int x;
//		int[] t = {2, 4, 6};
//		t[c1.sold] = 3;
//		t[1] =c1.numero;
//		for(int i=0; i<= t.length; i++) {
//			for (int j =0; j<=t.length; j++) {
//				System.out.print(j);
//			}
//			System.out.println(i);
//		}
		
//		System.out.println(t[c1.sold]);
//		System.out.println(t[1]);
//	}
//		Compte c2 = new Compte();
//		c1.sold = 100;
//		c2.sold = 200;
//		c1.titulaire = "yang";
//		c2.titulaire = "romain";
//		//c2 = c1;
//		c1.affichage();
//		c2.affichage();
//		c1.deposer(200);
//		System.out.println("titulaire "+ c1.titulaire +" a " + c1.sold + "€ dans le compte");
//		System.out.println("titulaire "+ c2.titulaire +" a " + c2.sold + "€ dans le compte");
		
		Personne p1 = new Personne();
		p1.nom = "yang";
		p1.naissance = new Date();
		//Date d2 = new Date();
		p1.naissance.date = 31;
		p1.naissance.month = 10;
		p1.naissance.year = 1978;
//		p1.naissance.afficherDate();
//		System.out.println(p1.naissance.bissextile(1978));
//		System.out.println(Date.longeur(10, 1978));
		p1.naissance.lendemain();
		
	}
		
}
