import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      Float a,b,c,d,e,avg;
     a=s.nextFloat();
       b=s.nextFloat();
       c=s.nextFloat();
       d=s.nextFloat();
       e=s.nextFloat();
      avg=(a+b+c+d+e)/5;
      System.out.println(avg);
    }
}