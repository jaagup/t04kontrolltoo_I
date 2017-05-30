public class KTyl2{
  	public static String korrutis(int[] m){
  		int arv = 1;
  		double aste = m.length;
  		for (int i = 0; i<m.length; i++) {
  			arv = arv * m[i];
  		}
  		return "Korrutis on " + arv + ". Poordvaartuse astendaja on " + aste + ". Vastus on " + Math.pow(arv, 1.0/aste);
  	} 	
  	
  	public static void main(String[] args){
  		int[] arvud={5, 3, 2, 6};
  		System.out.println(korrutis(arvud));
  	}
 } 
 
 /*
Korrutis on 180. Poordvaartuse astendaja on 4.0. Vastus on 3.6628415014847064
*/