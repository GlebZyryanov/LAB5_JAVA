package Java_LAB5;

import java.util.Scanner;
public class Pentagon
{
	private Dot[] listP = new Dot[5];
	public Pentagon(int X,int Y) {
		for(int i = 0;i<5;i++){
			this.listP[i] = new Dot(X,Y);
		}
	}
	public Pentagon setPentagon(Pentagon T) {
		Scanner in = new Scanner(System.in);
		for(int i =0;i<5;i++){
			T.listP[i].setDot(listP[i]);
		}
		return T;
	}
	public void getPentagon(Pentagon T) {
		for(int i = 0;i<5;i++){
			T.listP[i].getDot(listP[i]);
		}
	}
}