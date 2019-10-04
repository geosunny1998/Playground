import java.util.Scanner;
public class Main
{
 public static void main(String args[])
    {   
   Scanner s=new Scanner(System.in);
int curYear;
   curYear=s.nextInt();
   int birthYear;

   birthYear=s.nextInt();
  if(birthYear==00)
  {
    int a=curYear-birthYear;
    System.out.println(a);
  }
  else if(birthYear>curYear)
  {
    int b=birthYear-curYear;
    System.out.println(b);
  }
  else if(birthYear<curYear)
  {
    int c=100-curYear+birthYear;
    System.out.println(c);
  }
 }
}
