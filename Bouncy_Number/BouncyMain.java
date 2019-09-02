//
// Created by Rahul Mahendru
//
// Main function for the Bouncy functions
//

import java.util.*;

class BouncyMain{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        BouncyNumber ob = new BouncyNumber();
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        ob.isBouncy(n);
    }
}
