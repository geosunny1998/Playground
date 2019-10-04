import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
      int a=s.nextInt();
         int b=s.nextInt();
         
     int n=s.nextInt();
      for(int i=0;i<=a;i++)
      {
        for(int j=0;j<b;j++)
        {
      if(n%2==0)
      {
        System.out.println("No");
        break;
      }
      else
        System.out.println("Yes");
          break;
        }
        break;
      }
	}
}