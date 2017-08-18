package com.yasinokumus.edu.rm;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class UnderstandingRoundingMode {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter value, or q to quit: ");
            String next = s.next();
            
            if(!next.toLowerCase().equals("q")){
                
                BigDecimal num;
                try {
                    num = new BigDecimal(next);
                } catch (NumberFormatException nfe) {
                    System.out.println("Number format is not supported, try again or enter Q/q to quit.");
                    continue;
                }
                
                RoundingMode[] values = RoundingMode.values();
                
                for (RoundingMode m : values) {
                    if(m != RoundingMode.UNNECESSARY){
                        System.out.println(m.toString() + "\t: " + num.setScale(2, m));
                    }
                }
                
            }
            else{
                s.close();
                break;
            }
        }
    }
}
