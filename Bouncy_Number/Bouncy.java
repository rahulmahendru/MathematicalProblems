//
// Created by Rahul Mahendru
//
// Program to check if a user inputted number is a bouncy number or not
//

import java.util.*;

class Bouncy{
    
    //Function to check whether a number is Increasing
    boolean isIncreasing(int n){
        
        String s = Integer.toString(n);
        char ch;
        int f = 0;
        
        for(int i=0; i<s.length()-1; i++)
        {
            ch = s.charAt(i);
            if(ch>s.charAt(i+1))// If any digit is more than next digit then we have to stop checking
            {
                f = 1;
                break;
            }
        }
        
        if(f==1)
            return false;
        else
            return true;
    }
    
    //Function to check whether a number is Decreasing
    boolean isDecreasing(int n){
        
        String s = Integer.toString(n);
        char ch;
        int f = 0;
        for(int i=0; i<s.length()-1; i++)
        {
            ch = s.charAt(i);
            if(ch<s.charAt(i+1))// If any digit is less than next digit then we have to stop checking
            {
                f = 1;
                break;
            }
        }
        
        if(f==1)
            return false;
        else
            return true;
    }
    
    void isBouncy(int n){
        
        if(isIncreasing(n)==true){
            System.out.println("The number " + n + " is Increasing and Not Bouncy");
        }
        
        else if(isDecreasing(n)==true){
            System.out.println("The number " + n + " is Decreasing and Not Bouncy");
        }
        
        else{
            System.out.println("The number " + n + " is bouncy");
        }
    }
}
