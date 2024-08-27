import java.util.*;

class Complex
{
    private int real,img;
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real part : ");
        real = sc.nextInt();
        System.out.println("Enter the imaginary part : ");
        img = sc.nextInt();
    }
    public void show()
    {
        System.out.println("Complex No is "+this.real + " + i"+this.img);
    }
    public boolean equals(Complex x)
    {
        if(this.real == x.real && this.img == x.img)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public Complex add(Complex x)
    {
        Complex res = new Complex();
        res.real = this.real + x.real;
        res.img = this.img + x.img;
        return res;
    }
}
class F1
{
    public static void main(String args[])
    {
        Complex a,b,c;
        a = new Complex();
        b = new Complex();
        a.input();
        b.input();
        a.show();
        b.show();
        if(a.equals(b))
        System.out.println("Complex Nos are same");
        else
        System.out.println("Complex Nos. are not same");

        c = a.add(b);
        System.out.println("Sum of Complex Nos. is ");
        c.show();
    }
    
}
