package com.mycompany.digitcounter;

import java.util.Scanner;

/**
 *
 * @author Erik
 */
public class DigitCounter {
    public static void main(String[] args) {
        String Option;
        int number;
    
    Scanner InDate=new Scanner(System.in);
        do{
            do{
                System.out.println("Enter Number greater than zero");
                number=InDate.nextInt();   
            }while(number<0);
            int cifras=0;
            for(int i=number; i>0;i/=10){
                cifras++;
            }
            System.out.println("The number "+number+ " have :"+cifras+" digits");
            System.out.println("do you wish to continue? Y / N");
            Option=InDate.next();
           
        }while("Y".equals(Option));
    }
}
