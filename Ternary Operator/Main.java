import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      int a;
      a=s.nextInt();
      if(a%2==0)
      {
        System.out.println("Even");
      }
      else
      {
        System.out.println("Odd");
      }
    }
}