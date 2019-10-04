import java.util.Scanner;
class Main
{
  public static void main(String[]args)
  {
  float saleAmount,unitPrice;
		Scanner s= new Scanner(System.in);
	 unitPrice = s.nextFloat();	
	
		saleAmount = s.nextFloat();
		float a=unitPrice/12;
    float b,c;
		if(a==saleAmount )
		{
		
			System.out.println("No profit nor loss");
		}
		else if(a > saleAmount)
		{
			b=a-saleAmount;
          c=b*12;
			System.out.printf("Loss : Rs.%.2f",c);
		}
		else
		{b=saleAmount-a;
         c=b*12;
			System.out.printf("Profit : Rs.%.f",c);
		}
	}
}
  