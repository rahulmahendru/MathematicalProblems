//
// Created by Rahul Mahendru
//
// Program that checks if the user inputted integer is a pronic number or not

import java.util.*;

class Pronic
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int flag = 0;         // Flag to check if the required condition has been met
        int i=1;
        while (flag == 0 && i < n){
            if(i*(i+1) == n)
            {
                flag = 1;
            }
            i++;
        }
        
        if(flag == 1)
            System.out.println("Pronic Number.");
        else
            System.out.println("Not a Pronic Number.");
    }
}

