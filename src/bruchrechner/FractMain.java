package bruchrechner;

/**
 * 
 * @author JNK / VP
 * test
 */

public class FractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Fract b1 = new Fract(5,8);
		Fract b2 = new Fract(-1,2);
		//
		
		Fract resultM = b1.mul(b2); // b1*b2
		
		Fract resultD = b1.div(b2); // b1:b2
		//
		
		//TODO: division of negative fractions
		resultM.showFrac();
		resultD.showFrac();
	}
}
