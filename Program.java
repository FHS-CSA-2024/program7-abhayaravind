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
            
           
        System.out.println(schruteBucks + "." + stanleyNickels + "." + klevins);
        
        final double finalSchruteBucks = schruteBucks;
        
        
        double finalStanleyNickels = (double) klevins/12;
        
        final double schToKlev = 1/20;
        final double klevToStan = 1/12;
        
        final double conversion = schToKlev*klevToStan;
        
        double totalStanleyNickels = 12*klevins + stanleyNickels;
        
        
        
       
        //int final conversion = schruteBucks2;
        //int finalschruteBucks = 20*klevins;
        //int finalKlevins = 12*stanleyNickels;
        //int stanleyNickels2 = 0;
        //int schruteBucks2 = 100 * stanleyNickels2;
        
        System.out.println(totalStanleyNickels);
        
        

    
      
     

        
    }
    
    
    
    /*public double convertMoney(int schruteBucks, int stanleyNickels, int klevins){
        //implement a function that converts from the old format to the new format        
    }*/
    
    
}
//Paste console output below:
/*


*/
