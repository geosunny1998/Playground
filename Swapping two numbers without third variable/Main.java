import java.util.Scanner;
class Main
{
  public static int a,b;
  public static Scanner s=new Scanner(System.in);
    public static void main(String args[])
    {
      a=s.nextInt();
      b=s.nextInt();
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println(a);
    System.out.println(b);
    }
}