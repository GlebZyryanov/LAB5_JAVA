package Java_LAB5;
import java.util.Scanner;
public class Otrezok
{
	private  Dot first;
	private  Dot second;
	

	public Otrezok(int X, int Y) {//конструктор отрезка
		
		this.first = new Dot(X,Y);
		this.second  = new Dot(X,Y);
	}
	public Otrezok setOtrezok(Otrezok otrezok) {
		Scanner in = new Scanner(System.in);
		otrezok.first.setDot(first);
		otrezok.second.setDot(second);
		return otrezok;
	}
	public void getOtrezok(Otrezok O)//распечатка на экран
	{
		O.first.getDot(first);
		O.second.getDot(second);
	}
	
}