package studio7;

public class Fraction {
	private int numerator;
	private int denominator; 
	
	public Fraction (int n, int d) {
		numerator = n; 
		denominator = d; 
	}
	
	public String sum (Fraction now) {
		if (this.denominator == now.denominator) {
			return this.numerator + now.numerator + "/" + this.denominator; 
		} else {
			this.denominator *= now.denominator; 
			now.denominator *= this.denominator; 
			this.numerator *= now.denominator; 
			now.numerator *= this.denominator; 
			return this.numerator + now.numerator + "/" + this.denominator; 
		}
			
	}
	
	public String product (Fraction now) {
		return this.numerator * now.numerator + "/" + this.denominator * now.denominator; 
	}
	
	public String reciprocal () {
		return denominator + "/" + numerator; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction Mia = new Fraction (11, 10); 
		Fraction Ambrose = new Fraction (1, 10); 
		System.out.println(Mia.sum(Ambrose));
		System.out.println(Mia.product(Ambrose));
		System.out.println(Mia.reciprocal()); 
	}

}
