
public class Date {
	int date;
	int month;
	int year;
	
	public Date() {
		this.date = 1;
		this.month = 1;
		this.year = 1;
	}
	
	public Date(int j, int m, int a) {
		if (m >0 && m< 13 && j<= longeur(m,a)) {
			this.date = j;
			this.month = m;
			this.year = a;
		} else {
			throw new ErreurDate();
		}
	}
	
	void afficherDate() {
		System.out.println("La date de naissance : " + this.date + this.month + this.year);
	}
	
	public static boolean bissextile(int a ) {
		return ((a%4 ==0) && (a%100 == 0) && (a%400 == 0));
	}
	
	public static int longeur(int m, int a) {
		if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			return 31;
		} else if (m == 2 ) {
			if (bissextile(a)) {
				return 29;
			} else return 28;
		} else return 30;
	}
	
	public void lendemain () {
		if (this.date < longeur(this.month, this.year)) {
			this.date = this.date + 1;
		} else if (this.month == 12) {
			this.date = 1;
			this.month = 1;
			this.year = this.year + 1;
		} else {
			this.date = 1;
			this.month = this.month + 1;
		}
		System.out.println("Le lendemain est " + this.date + "-" + this.month + "-"+ this.year);
	}

}
