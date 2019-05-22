import java.util.Scanner;
import java.util.Arrays;
import java.util.List;


public class exception {

	public static void main(String[] args) throws Exc1, Exc2, Exc3 {
		
		String [] menue = {"menue1", "menue2", "menue3"};
		afficherMenue(menue);
		saisirChoix(0);

	}
	
public static void saisirChoix(int n) throws Exc1, Exc2, Exc3 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir un nombre entre 1 et 10 " );
		String y = sc.nextLine();
		sc.close();
		if(y.isBlank()) {
			throw new Exc3();
		} else {
			int x = Integer.parseInt(y);
			if(x<=1) {
				throw new Exc1();
			} else if (x<1 || x>10) {
				throw new Exc2();
			  }
		}		
					
}
	
	
public static void afficherMenue(String[] menue) {
	 System.out.println("menue");
	
}
	

}	

class Exc1 extends Exception{}
class Exc2 extends Exception{}
class Exc3 extends Exception{}
