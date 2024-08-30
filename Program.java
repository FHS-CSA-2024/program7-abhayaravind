//import stuff here

//Your code here
package src.main.java;
//import stuff here
import java.util.Scanner;
//Your code here

public class Program7{
    //Define your final variables here
    // **HINT: Maybe the conversion rates?????**


    public static void main(String[] args){
        Scanner numScanner = new Scanner(System.in);
        
        int schruteBucks = 0;
        int stanleyNickels = 0;
        int klevins = 0;
     
        
        System.out.println("Enter SchruteBucks");
            schruteBucks = numScanner.nextInt();
            
        System.out.println("Enter klevins");
            klevins = numScanner.nextInt();
            
        System.out.println("Enter Stanley Nickels");
            stanleyNickels = numScanner.nextInt();
            
        
        
        double finalStanleyNickels = (double) klevins/12;
        
        int schToKlev = 20;
        int klevToStan = 12;

        final double oldConversion = schToKlev*klevToStan;
        final double totalStanleyNickels = 12*klevins + stanleyNickels + oldConversion*schruteBucks;
        
        final double newConversion = totalStanleyNickels/oldConversion;
        
        double newConversion1 = newConversion*100;
        int newConversion2 = (int) newConversion1; 
        double finalConversion = (double) newConversion2/100;
        
        
            
        System.out.println(finalConversion);
        
        


        
    }
    
    
    
    /*public double convertMoney(int schruteBucks, int stanleyNickels, int klevins){
        //implement a function that converts from the old format to the new format        
    }*/
    
    
}
    
    /*public double convertMoney(int schruteBucks, int stanleyNickels, int klevins){
        //implement a function that converts from the old format to the new format        
    }*/
    
    
}
//Paste console output below:
/*
Enter SchruteBucks
5
Enter klevins
2
Enter Stanley Nickels
8
5.13

*/
