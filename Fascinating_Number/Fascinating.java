//
// Created by Rahul Mahendru
//
// Program to check if the user inputed ingteger is a fascinating number or not

import java.util.*;

class Fascinating{
    
    boolean isUnique(String q){
        
        int A[] = {0,0,0,0,0,0,0,0,0,0}; //to store frequency of every digit from '0' to '9'
        int i, flag = 0;
        char ch;
        for(i=0; i<q.length(); i++)
        {
            ch = q.charAt(i);
            A[ch-48]++;
            /*  increasing A[5] if ch='5' as '5'-48 = 53-48=5
             *  (ASCII values of '0' to '9' are 48 to 57) */
        }
        
        for(i=1; i<10; i++)
        {
            //checking if every digit from '1' to '9' are present exactly once or not
            if(A[i]!=1)
            {
                flag = 1; //flag is set to 1 if frequency is not 1
                break;
            }
        }
        
        if(flag == 1)
            return false;
        else
            return true;
    }
    
    String concatenate(int n){
        return Integer.toString(n*1) + Integer.toString(n*2) + Integer.toString(n*3);
        /*  Joining the first, second and third multiple of the number
         *  by converting them to Strings and concatenating them*/
    }
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        Fascinating ob = new Fascinating();
        
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        String p = Integer.toString(n); //converting the number to String
        
        if(p.length()<3)
            System.out.println("Number should be of atleast 3 digits.");
        
        else
        {
            String s = ob.concatenate(n);
            if(ob.isUnique(s))
                System.out.println(n+" is a Fascinating Number.");
            else
                System.out.println(n+" is not a Fascinating Number.");
        }
    }
}

