import java.util.Scanner;

public class Recursion_Fibonacci {
    static int fibo(int n){
        if(n==0||n==1){
            return 0;
        }
        return fibo(n-1)+fibo(n-2);
     }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of terms in series: ");
        int a=sc.nextInt();
        System.out.println(fibo(a));
    }
}
