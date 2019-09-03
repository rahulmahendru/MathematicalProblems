//
// Created by Rahul Mahendru
//
// Program that checks if the user inputted integer is an evil number or not

import java.util.*;

class Evil{
    
    // Function to convert a number to Binary
    String toBinary(int n){
        
        int r;
        String s=""; //variable for storing the result
        
        char dig[]={'0','1'}; //array storing the digits (as characters) in a binary number system
        
        while(n>0)
        {
            r=n%2; //finding remainder by dividing the number by 2
            s=dig[r]+s; //adding the remainder to the result and reversing at the same time
            n=n/2;
        }
        return s;
    }
    
    // Function to count no of 1's in binary number
    int countOne(String s)
    {
        
        int c = 0, l = s.length();
        char ch;
        for(int i=0; i<l; i++)
        {
            ch=s.charAt(i);
            if(ch=='1')
            {
                c++;
            }
        }
        return c;
    }
    
    public static void main(String args[])
    {
        Evil ob = new Evil();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive number : ");
        int n = sc.nextInt();
        
        String bin = ob.toBinary(n);
        System.out.println("Binary Equivalent = "+bin);
        
        int x = ob.countOne(bin);
        System.out.println("Number of Ones = "+x);
        
        if(x%2==0)
            System.out.println(n+" is an Evil Number.");
        else
            System.out.println(n+" is Not an Evil Number.");
    }
    
}
