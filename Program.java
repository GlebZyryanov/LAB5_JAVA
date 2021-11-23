package Java_LAB5;

public class Program{
	public static void main(String[] args){
		System.out.println("Set the coordinates of Dot:");
		Dot dot = new Dot(0,0);
		dot.setDot(dot);
		System.out.println("The coordinates of Dot is: ");
		dot.getDot(dot);
		System.out.println("\nSet the coordinates of Otrezok:");
		Otrezok O = new Otrezok(0,0);
		O.setOtrezok(O);
		System.out.println("The coordinates of Otrezok is: ");
		O.getOtrezok(O);
		System.out.println("\nSet the coordinates of Triangle:");
		Triangle T = new Triangle(0,0);
		T.setTriangle(T);
		System.out.println("The coordinates of Triangle is: ");
		T.getTriangle(T);
		System.out.println("\nSet the coordinates of Squaer:");
		Squaer S = new Squaer(0,0);
		S.setSquaer(S);
		System.out.println("The coordinates of Squaer is: ");
		S.getSquaer(S);
		System.out.println("\nSet the coordinates of Pentagon:");
		Pentagon P = new Pentagon(0,0);
		P.setPentagon(P);
		System.out.println("The coordinates of Pentagon is: ");
		P.getPentagon(P);
	}
}