import java.util.Scanner;
class Main
{
    public static void main(String[]args)
    {
      Scanner s=new Scanner(System.in);
        int L1,L2,L3,n;
          L1=s.nextInt();
        L2=s.nextInt();
       L3=s.nextInt();
        
       n=s.nextInt();
      int c=0;
     
      if(n<=L1)
      {
       c++;
      }
      //System.out.println(c);
      if(n<=L2)
      {
       c++;
      }
     // System.out.println(c);
      if(n<=L3)
      {
       c++;
      }
       System.out.println(c);
           
      
      
        
        
  
      
       
    }
}