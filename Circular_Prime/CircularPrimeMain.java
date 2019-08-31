import java.util.*;

class CircularPrimeMain{
    
    public static void main(String args[]){
        
        CircularPrime ob = new CircularPrime();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        ob.isCircularPrime(n);
    }
}
