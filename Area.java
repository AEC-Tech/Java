class Area
{
	public static void area(float side)
	{
		float a = side * side;
		System.out.println("Area of Square is " + a);
	}
	public static void area(float length,float breadth)
	{
		float a = length * breadth;
		System.out.println("Area of Rectangle is " + a);
	}
	public static void area(float side1,float side2, float side3)
	{
		float s = (side1+side2+side3)/2;
		float a = (float)Math.sqrt(Math.abs(s * (s-side1) * (s-side2) * (s-side3)));
		System.out.println("Area of Triangle is " + a);
	}
	public static void main(String args[])
	{
		area(8.2f);
		area(4,2.3f,8);
		area(4,6.5f);
		area(4.5f);
	}
}