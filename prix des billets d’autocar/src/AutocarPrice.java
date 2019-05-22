import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AutocarPrice {

	public static void main(String[] args) {
		String cities[]= {"Vierzon", "Salbris", "Nouans", "Lamotte-Beuvron", "La Ferté Saint-Aubin", "Orléans"};
		double prices[]= {3.20, 1.80, 2.30, 4.20, 5.00};
		double reductions[]= {0, 0.1, 0.2, 0.3, 0.4};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisissez une ville de départ: ");
		String cityDepart = sc.nextLine();
		System.out.println("Saisissez une ville d'arrivée: ");
		String cityArrival = sc.nextLine();
		
//		for(int i=0; i<city.length; i++) {
//			if(cityDepart == city[i]){
//				System.out.println("L'indice de la ville de départ est: " + i);
//			} 
//		}
		
		int cityDepartIndice = Arrays.asList(cities).indexOf(cityDepart);
		int cityArrivalIndice = Arrays.asList(cities).indexOf(cityArrival);
		List<double[]> pricesTravel = Arrays.asList(prices).subList(cityDepartIndice, cityDepartIndice);

		System.out.println("L'indice de la ville de départ est " + cityDepartIndice);		
		System.out.println("L'indice de la ville d'arrivée est " + cityArrivalIndice);
		
		double price = 0;
		if(cityDepartIndice < cityArrivalIndice) {
			for(int i= cityDepartIndice; i< cityArrivalIndice; i++) {
				if ((cityArrivalIndice - cityDepartIndice) == 1) {
					price = prices[i];
				} else if ((cityArrivalIndice - cityDepartIndice)>1) {
						price = price + (prices[i]- (prices[i]*(reductions[section])));
						System.out.println("Le prix de votre billet est "+ price);
					 
				 }
			}
			System.out.println("Le prix de votre billet est "+ price);

			
//		} else if(cityArrivalIndice < cityDepartIndice){
//			for(int i= cityArrivalIndice; i< cityDepartIndice; i++) {
//				if ((cityDepartIndice - cityArrivalIndice) == 1) {
//					price = prices[i];
//				}else if ((cityDepartIndice - cityArrivalIndice) > 1) {
//					for(section = 1; section<i; section++) {
//						price = price +prices[i]*0.1;
//					}
//				}
//			}
//			System.out.println("Le prix de votre billet est "+ price);
		}
				
	}
}
