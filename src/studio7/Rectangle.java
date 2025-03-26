package studio7;

public class Rectangle {
	private int length; 
	private int width; 
	
	public Rectangle (int theWidth, int theLength) {
		length = theLength; 
		width = theWidth; 
	}
	public int area () {
		return length * width; 	
	}
	public int perimeter () {
		return length + length + width + width;  
	}
	public boolean compare (Rectangle now) {
		//this.area() new.area()
		if (this.area() > now.area()) {
			return true;
		} else {
			return false; 
		}
	}
	 public boolean square () {
		 if (length == width) {
			 return true; 
		 } else {
			 return false; 
		 }
	 }
	 
	public static void main (String[]args){
		Rectangle fin = new Rectangle (5, 7); 
		Rectangle Bradley = new Rectangle (2, 9); 
		System.out.println(Bradley.area()); 
		System.out.println(fin.compare(Bradley)); 
		
	}
	
	
	public String toString() {
		return "";
	}
	
}
