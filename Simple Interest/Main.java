import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
      int principalamount,period;
      float rateofinterest,simpleinterest;
      principalamount=s.nextInt();
      period=s.nextInt();
      rateofinterest=s.nextFloat();
      simpleinterest=(float)(principalamount*period*rateofinterest)/100;
    System.out.println(simpleinterest);
         
    }
}