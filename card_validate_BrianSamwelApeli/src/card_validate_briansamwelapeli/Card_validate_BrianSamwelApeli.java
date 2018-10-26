/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card_validate_briansamwelapeli;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Card_validate_BrianSamwelApeli {
public static boolean creditCheck(int numD,int sum){//boolean to check if sum of octal digits == final digit of initial value
        if(numD==sum){
            return true;
        }else{
            return false;
        }
    }
            
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
         
        int x,z = 0,dec,sum = 0, numD,rem,quo = 0, i=1,j,octSum;
         
         
        System.out.print("enter numbers: ");
          String values=input.nextLine();
          
          
          int y = Integer.parseInt(values);//changes sting input to integer
          
          if(values.length()==5)//----->checks length of input value
            {
                x = y%10;
                numD = x;//the last digit is saved at numD
                
//              System.out.println("The last digit(x) is:"+x);
                
                octSum = x;
                z = (y-x)/10;//------>calculation to find the values to calculate octal
//             System.out.println("The remainder(z)is: "+ z);
             
            }
         
          int octal = Integer.parseInt(Integer.toOctalString(z));//-------->Predefined method to calculate octal value
          System.out.println("The octal of z is: "+ octal);
           
          
          //calculate sum of octal digits
            while(octal > 0)
            {
            rem = octal % 10;
            sum =sum + rem;
            
            octal = octal/10;
            }
         //  System.out.println("The remainder is: " + sum); 
        
           
    }
    
}
