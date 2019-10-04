import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      int base,power;
      base=s.nextInt();
      power=s.nextInt();
      int result=1;
      while(power!=0)
      {
        result*=base;
        --power;
      }
        System.out.println(result);
      
    }
}