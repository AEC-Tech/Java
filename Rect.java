import java.util.*;
class Rectangle
{
	private int length,breadth;
	public Rectangle()
	{
		length = breadth = 1;
	}
	public void Input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length : ");
		length = sc.nextInt();
		System.out.println("Enter Breadth : ");
		breadth = sc.nextInt();
	}
	public void Output()
	{
		System.out.println("Length is " + length);
		System.out.println("Breadth is " + breadth);
	}
	public void CalcArea()
	{
		System.out.println("Area is " + (length*breadth) );
	}
}
class Rect
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		r.Input();
		r.Output();
		r.CalcArea();
	}
}