package lab7_java;
import java.util.Scanner;
public class Program{
	public static void main(String[] args){
		System.out.print("/n1 - the main program/n2 - the lab7Dopmaterials\n");
		Scanner scan = new Scanner(System.in);
		if(scan.nextInt() == 1) {
			
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
		}else {
			IntMetodReturn point = new IntMetodReturn(0,0);
			point.setIntMetodReturn();
			point.printMetodReturn();
			int amaunt;
			System.out.print("\nThe amaunt of two numbers is:\n");
			amaunt = point.returnedPlusInt();
			System.out.print(amaunt);
			//демонстрация строк
			   ThePerson ThePerson = new ThePerson();
		       ThePerson.setThePerson();
		       ThePerson.printInfo();
		       ThePerson.getPersonFIO();

		}
	}
	
}