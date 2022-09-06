import java.util.Scanner;

public class GCD {
    static int gCD(int a, int b){
        if(b%a==0)
            return a;
        return gCD(b%a, b=a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x, y;
        System.out.println("enter 1st no.: ");
        x=sc.nextInt();
        System.out.println("enter 2nd no.: ");
        y=sc.nextInt();
        System.out.println("gcd is: "+gCD(x, y));
    }
}
