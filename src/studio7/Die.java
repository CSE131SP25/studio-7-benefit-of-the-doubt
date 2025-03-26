package studio7;

public class Die {
	private int sides; 
	
	public Die (int S) {
		sides = S; 
	}
	public int result () {
		int roll = (int) Math.random() * sides + 1; 
		return roll; 
	}
	public static void main(String[] args) {
		Die Zayn = new Die (6); 
		System.out.println(Zayn.result()); 
	}

}
