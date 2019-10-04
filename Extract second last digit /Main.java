import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
      int n;
      n=s.nextInt();
      int c=(n%100)/10;
      System.out.println(c);
	}
}