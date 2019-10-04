import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
      
                int side = scanner.nextInt();
               int areaOfSquare= side * side;
                System.out.println(areaOfSquare);
               
           
                
                int length = scanner.nextInt();
                
                int breadth = scanner.nextInt();
               int areaOfRectangle= length * breadth;
;
                System.out.println(areaOfRectangle);
               
         float radius = scanner.nextFloat();
       float PI=3.14f;
                float areaOfCircle =PI*(radius*radius);
        
                System.out.printf("%.3f",areaOfCircle);
    }
}
        
        
   
        
 
   
    
      