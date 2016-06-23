package bruchrechner;

/**
 *
 * @author JNK / VP
 *
 */

public class FractMain {

	public static void main(String[] args) {
		Fract b1 = new Fract(1,3);
		Fract b2 = new Fract(1,3);


		Fract resultM = b1.mul(b2); // b1*b2
		Fract resultD = b1.div(b2); // b1:b2
		Fract resultA = b1.add(b2); // b1+b2
		Fract resultS = b1.sub(b2); // b1-b2
		
		//TODO: division of negative fractions
		resultM.showFrac();
		resultD.showFrac();
		resultA.showFrac();
		resultS.showFrac();
	}
}
