
public class cribledErathostene {

	public static void main(String[] args) {

	}
	
	static boolean[] cribleErathosteneCreation (int n) {
		boolean res[] ;
		int tab[];
			if (n==1) {
				tab[] = [1];
				res[0]=true;
			} else if (n>1) {
				for(int i=2; i<tab.length; i++){
					for(n = 2; n<= tab.length; n++){
						if(n % i == 0) {
							n = n;
						} else {
							res.n = false
						  }
						res.push(res.n[i])
					}
					return res;
					}
	}

}
