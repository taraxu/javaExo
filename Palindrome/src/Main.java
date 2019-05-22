import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		
	}
	
	public Main() {
	    ArrayList<String> list1= new ArrayList<>();
	    list1.add("r");
	    list1.add("a");
	    list1.add("d");
	    list1.add("a");
	    list1.add("r");
	    ArrayList<String> list2 = new ArrayList<>();
	    
	    //list2 = Collections.reverse(list1);
	    
	    list2.add("r");
	    list2.add("a");
	    list2.add("d");
	    list2.add("a");
	    list2.add("r");
	    
	    if (list1 == list2) {
	        System.out.println(" le mot radar est un mot palindrom");
	    } else {
	        System.out.println(" le mot radar n'est un mot palindrom");
	    }
	
	}
}
