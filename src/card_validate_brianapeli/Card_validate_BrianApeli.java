 
package card_validate_brianapeli;
 
import java.util.Scanner;

public class Card_validate_BrianApeli {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter value: ");
    String value = input.nextLine();
    
    if(value.length()==4){
        
         int dec, rem,quo, i=1,j;
         int oct[] = new int[100];
         
            quo = Integer.parseInt(value);
            while(quo != 0)
            {
            oct[i++] = quo%8;
            quo = quo/8;
            }
            
            for(j=i-1;j>0;j--)
            {
             System.out.print(oct[j]);
            }
         
        }
    }
     
}
    }
    
}
