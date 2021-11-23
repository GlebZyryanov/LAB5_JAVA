package Java_LAB5;
import java.util.Scanner;
public class Triangle
{
	private Dot[] list = new Dot[3];
	public Triangle(int X,int Y) {
		this.list[0] = new Dot(X,Y);
		this.list[1] = new Dot(X,Y);
		this.list[2] = new Dot(X,Y);
	}
	public Triangle setTriangle(Triangle T) {
		Scanner in = new Scanner(System.in);
		T.list[0].setDot(list[0]);
		T.list[1].setDot(list[1]);
		T.list[2].setDot(list[2]);
		return T;
	}
	public void getTriangle(Triangle T) {
		T.list[0].getDot(list[0]);
		T.list[1].getDot(list[1]);
		T.list[2].getDot(list[2]);
	}
}