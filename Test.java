class Message extends Thread
{
	private int n;
	private String msg;
	public Message(int x, String y)
	{
		n = x;
		msg = y;
	}
	public void run() 
	{
		try{
		for(int i = 1; i<=n;i++)
		{
		System.out.println(msg+" "+i);
		Thread.sleep(200);
		}}
		catch(Exception e)
		{}
	}
}
class Test
{
	public static void main(String args[])
	{
		Message m1 = new Message(8,"Hello");
		Message m2 = new Message(12,"Bye");
		try
		{
		m1.start();
		m2.start();
		for(int i = 1; i<=10;i++)
		{
		System.out.println("Main "+i);
		Thread.sleep(200);
		}
		
		}
		catch(Exception e)
		{
		}
	}
}
