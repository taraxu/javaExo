
public class Compte {
	private int sold;
	private String titulaire;
	private int numero;
	
	public Compte() {}

	public Compte(String titulaire) {
		this.titulaire = titulaire;
	}
	
//	void affichage () {
//		System.out.println("votre sold est" + this.sold);
//	}
	
	void deposer (int montant) {
		this.sold = this.sold + montant;
	}
	
	void retirer (int montant) {
		this.sold = this.sold - montant;
	}
	
	void virerVers (int montant, Compte destination) {
		this.retirer(montant);
		destination.deposer(montant);
	}
	
	void afficher () {
		if (this.titulaire == null) {
			System.out.println("votre solde est" + this.sold);
		} else {
			System.out.println("le sold de " + this.titulaire + "est: " +this.sold);
		}
	}

}
