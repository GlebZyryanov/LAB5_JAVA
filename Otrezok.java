package lab7_java;

import java.util.Scanner;
public class Otrezok
{
	private  Dot first;
	private  Dot second;
	

	public Otrezok(int X, int Y) {//����������� �������
		
		this.first = new Dot(X,Y);
		this.second  = new Dot(X,Y);
	}
	public Otrezok setOtrezok(Otrezok otrezok) {
		Scanner in = new Scanner(System.in);
		otrezok.first.setDot(first);
		otrezok.second.setDot(second);
		return otrezok;
	}
	public void getOtrezok(Otrezok O)//���������� �� �����
	{
		O.first.getDot(first);
		O.second.getDot(second);
	}
	
}