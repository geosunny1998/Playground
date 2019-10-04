import java.util.Scanner;
class Main
{
  public static int a,b;
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

      a=s.nextInt();
      b=s.nextInt();
      if(a>b)
      {
        System.out.println(a+" greater than "+b);
      }
      else if(a<b)
      {
        System.out.println(a+" less than "+b);
      }
      else
      {
        System.out.println(a+" and "+b+" are equal");
      }
    }
}
      
        
