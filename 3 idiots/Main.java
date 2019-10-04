import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
    int x1,x2,y1,y2;
    float a,b;
    x1=s.nextInt();
    y1=s.nextInt();
    x2=s.nextInt();
    y2=s.nextInt();
    a=(float)(x1+x2)/2;
    b=(float)(y1+y2)/2;
    System.out.printf("Binoy's house is located at (%.1f,%.1f)",a,b);
  
  }
}