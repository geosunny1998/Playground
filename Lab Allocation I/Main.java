import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
          int L1,L2,L3;
      L1=s.nextInt();
      L2=s.nextInt();
      L3=s.nextInt();
      if(L1<L2)
      {
       System.out.println("L1");
      }
     else if(L2<L1)
      {
       System.out.println("L2");
      }
     else
      {
       System.out.println("L3");
      }
    }
}