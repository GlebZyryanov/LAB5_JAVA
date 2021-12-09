package lab7_java;

import java.util.Scanner;

public class IntMetodReturn {
	private int a1;
	private int a2;
	public IntMetodReturn(int a1,int a2) {
		this.a1 = a1;
		this.a2 = a2;
	}
	public void setIntMetodReturn() {
		Scanner scan = new Scanner(System.in);
		System.out.print("\nSet the number one\n");
		a1 = scan.nextInt();
		System.out.print("\nSet the number two\n");
		a2 = scan.nextInt();
		
	}
	public void printMetodReturn() {
		System.out.print("\nthe number one = ");
		System.out.print(a1);
		System.out.print("\nthe number two = ");
		System.out.print(a2);
	}
	public int returnedPlusInt() {
		int amaunt = a1+a2;
		return amaunt;
	}
}
