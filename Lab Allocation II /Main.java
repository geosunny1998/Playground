import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      int L1,L2,L3;
      String a;
     
      L1=s.nextInt();
      L2=s.nextInt();
      L3=s.nextInt();
      s.nextLine();
       a=s.nextLine();
  
      if(a.equals("L1"))
      {
        if(L2>L3)
          System.out.println("L3");
        else
          System.out.println("L2");
      }
       if(a.equals("L2"))
      {
        if(L1>L3)
          System.out.println("L3");
        else
          System.out.println("L1");
      }
          
    
          if(a.equals("L3"))
      {
        if(L1>L2)
          System.out.println("L2");
        else
          System.out.println("L1");
      } 
       
  
        
    }
}