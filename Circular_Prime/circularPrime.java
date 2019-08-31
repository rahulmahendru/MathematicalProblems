//
// Created by Rahul Mahendru
//
// This program is a basic mathematical technique to check if a number is a circular prime
// number or not

import java.util.*;

class CircularPrime{
    
    // Function for checking whether a number is prime or not
    boolean isPrime(int n){
        
        int c = 0;                 // counter to count the factors of the number
        for(int i = 1; i<=n; i++)
        {
            if(n%i == 0)
                c++;
        }
        
        if(c == 2)                // to check if the number has only two factors, 1 and itself
            return true;
        else
            return false;
    }
    
    //Function for circulating the digits to form new number
    int circulate(int n){
        
        String s = Integer.toString(n);        // Converts the integer to string to easily circulate the number
        s = s.substring(1) + s.charAt(0);
        int a = Integer.parseInt(s);
        return a;
    }
    
    //Function to check for circular prime
    void isCircularPrime(int n){
        
        int f = 0;                 // To set a check counter
        int a = n;                 // Assigns the value of n to a for circulation and retaining the original number
        
        do
        {
            if(isPrime(a)==false)
            {
                f = 1;
            }
            a = circulate(a);
        }while(a!=n);
        
        if(f==1)
            System.out.println(n+" IS NOT A CIRCULAR PRIME");
        else
            System.out.println(n+" IS A CIRCULAR PRIME");
    }
    
    
}

