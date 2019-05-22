import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Simplex {

	public static void main(String[] args) {
		
	}
	
//	public static void simplex() {
//		List<Integer> zCoef = Arrays.asList(6, 7, 8, 0, 0, 0);
//		List<String> var = Arrays.asList("x1", "x2", "x3", "x4", "x5", "x6");
//		List<Integer> sc1Coef = Arrays.asList(1, 2, 1, 1, 0, 0);
//		List<Integer> sc2Coef = Arrays.asList(3, 4, 2, 0, 1, 0);
//		List<Integer> sc3Coef = Arrays.asList(2, 6, 4, 0, 0, 1);
//		int[] qy = {100, 120, 200}; 
//		Integer veCoef = Collections.max(zCoef);
//		Integer veIdx = zCoef.indexOf(veCoef);
//		//String ve = var.get(veIdx);
//		List<Integer> cp = Arrays.asList(0, 0, 0);
//		
//		List<Integer> vdb = new ArrayList<Integer>();
//		for(int i=3; i<zCoef.size(); i++) {
//			if (zCoef.get(i)==0) {
//				vdb.add(zCoef.get(i));
//			}
//		}
//		
//		
//		int ratio;
//		List<Integer> ratios = new ArrayList<Integer>();
//		Integer vsCoef;
//		List<List<Integer>> scCoefs= new ArrayList<List<Integer>>();
//		scCoefs.add(sc1Coef);
//		scCoefs.add(sc2Coef);
//		scCoefs.add(sc3Coef);
//		
//		for(int i=0; i<qy.length; i++) {			
//			ratio = qy[i]/scCoefs.get(i).get(veIdx);
//			ratios.add(ratio);
//		};	
//		int maxRatio = Collections.min(ratios);
//		Integer vsIdx = ratios.indexOf(maxRatio);
//		List<Integer> scS = scCoefs.get(vsIdx);
//		int pivot = scS.get(veIdx);
//		
//	
//		
//		
//		//List<Integer> zj = new ArrayList<Integer>();
//		//zj.add()
//		
//		System.out.println(veCoef);
//		System.out.println(ratios);
//		System.out.println(scS);
//		System.out.println(veIdx);
//		System.out.println(pivot);
//		System.out.println(cp);
//		System.out.println(vdb);
//	}

}
