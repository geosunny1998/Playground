import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     Scanner s=new Scanner(System.in);
       char ch;
      
        ch = s.next().charAt(0);
		
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            	System.out.print("Vowel");
          else
            System.out.print("Consonant");
        }
        else
        {
            System.out.print( "Not an alphabet");
        }
    }
}