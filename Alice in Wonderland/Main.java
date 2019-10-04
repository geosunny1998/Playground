import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      int n,n1,sum=0,lastdigit;
      n=s.nextInt();
      n1=n;
      while(n1!=0)
      {
        lastdigit=n1%10;
        sum=sum+lastdigit;
        n1=n1/10;
      }
      System.out.println("Alice must go in path-"+sum);
	}
}