import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
  int a,b,noofstudineacteam,remaining;
  a=s.nextInt();
  b=s.nextInt();
  noofstudineacteam=a/b;
  remaining=a%b;
  System.out.printf("The number of students in each team is "+noofstudineacteam);
 System.out.printf(" and left out is " +remaining);
}
}