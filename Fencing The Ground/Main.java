import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int l,b,lengthofrope,quantityofcarper;
    l=s.nextInt();
    b=s.nextInt();
    lengthofrope=(2*l)+(2*b);
      quantityofcarper=l*b;
    System.out.println(lengthofrope+"m");
    System.out.println(quantityofcarper+"sqm");
  }
}