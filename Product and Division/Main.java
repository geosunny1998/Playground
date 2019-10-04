import java.util.Scanner;
class Main
{
  public static int a,b,product,quatient,remainder;
  public static Scanner s=new Scanner(System.in);
    public static void main(String args[])
    {
       a=s.nextInt();
      b=s.nextInt();
      product=a*b;
      System.out.println(+product);
      quatient=a/b;
      System.out.println(+quatient);
      remainder=a%b;
      System.out.println(+remainder);
    }
}