package bruchrechner;

/**
 * @author JNK / VP
 */

public class Fract {
	private int numerator;
	private int denom;
	
	//Default Constructor
	public Fract() {
	this.numerator = 0;
	this.denom = 1;
	}
	
	//flexible Constructor
	public Fract(int numerator, int denom) {
		this.numerator = numerator;
		this.denom = denom;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenom(){
		return denom;
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public void setDenom(int denom) {
		this.denom = denom;
	}
	
	public void showFrac() {
		System.out.println(this.numerator + "/" + this.denom);
	}
	
	//multiplication
	public Fract mul(Fract b2) {
		Fract product = new Fract();
		product.setNumerator(this.numerator * b2.numerator);
		product.setDenom(this.denom * b2.denom);
		return product;
	}
	
	//division
	public Fract div(Fract b2) {
		Fract quot = new Fract();
		quot.setNumerator(this.numerator * b2.denom);
		quot.setDenom(this.denom * b2.numerator);
		return quot;
	}

	//addition
	public Fract add(Fract b2) {
		Fract sum = new Fract();
		sum.setNumerator(this.numerator + b2.numerator);
		sum.setDenom(this.denom + b2.denom);
		return sum;
	}

	//subtraction
	public Fract sub(Fract b2) {
		Fract diff = new Fract();
		diff.setNumerator(this.numerator - b2.denom);
		diff.setDenom(this.denom - b2.numerator);
		return diff;}

	//placeholder
}

