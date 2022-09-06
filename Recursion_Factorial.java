import java.util.Scanner;
import java.lang.Math;

/* note- iterative solution is preferred because 
 time complexity of iterative is Theta(n) and auxiliary space is Theta(1)
 time complexity of recursive is Theta(n) and auxiliary space is Theta(n)
*/
class Recursion_fact{
     static int factorial(int n){
        if(n==0)
        return 1;
        else
        return(n*factorial(n-1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any no: ");
        int a=sc.nextInt();
        int fact=factorial(a);
        System.out.println("factorial is:"+fact);
        int digits=(int)(Math.log10(fact)+1);
        System.out.println("no. of digits in factorial is: "+digits);
    }
}