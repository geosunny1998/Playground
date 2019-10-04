import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
     String a;
       int b,c,d;
      float result;
      a=s.nextLine();
     
      b=s.nextInt();
      c=s.nextInt();
      d=s.nextInt();
        if(a.equals("MSDS"))
        {
         result=b+c; 
        System.out.printf("%.2f",result);
        }
      else if(a.equals("MSH"))
      {
        result=b+d;
        System.out.printf("%.2f",result);
      }
      else if(a.equals("MGSDS"))
      {
        result=((b*150)/100)+c;
         System.out.printf("%.2f",result);
      }
      else if(a.equals("MGSH"))
      {
        result=((b*150)/100)+d;
         System.out.printf("%.2f",result);
      }
    }
}