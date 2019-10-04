import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
      int x,a,b,profit;
      x=s.nextInt();
      a=s.nextInt();
      b=s.nextInt();
      profit=((x*a)-(x*b))-100;
      System.out.println("The profit obtained is Rs."+profit);
	}
}