import java.util.Scanner;
class Main
{
  public static int a,b,temp;
  public static Scanner s=new Scanner(System.in);
    public static void main(String args[])
    {
        a=s.nextInt();
      b=s.nextInt();
      temp=a;
      a=b;
      b=temp;
      System.out.println(+a);
      System.out.println(+b);
    }
    }
