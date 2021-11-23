package Java_LAB5;
import java.util.Scanner;
public class Dot
{	
	private  int CordX;
	private  int CordY;
	
	
	public Dot(int initCordX, int initCordY){
	   
	    
	    CordX = initCordX;
	    CordY = initCordY;
	
	}
	public Dot setDot(Dot point)
	{
		Scanner in = new Scanner(System.in);
		CordX =in.nextInt();
	
		CordY =in.nextInt();
		return point;
	}
	public void getDot(Dot point)
	{
		System.out.printf("(%d,",point.CordX);
		System.out.printf("%d)",point.CordY);
		System.out.println();
	}
}