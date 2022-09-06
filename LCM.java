import java.util.Scanner;

public class LCM {
    static int min(int a, int b){
        if(a>=b)
            return a;
        return b;
    }
   
    static int lCM(int a, int b){
        int lcm=0;
        if(b%a==0)
            lcm= b;
        int comnFactr=1;
        for(int i=1;i<=min(a,b);i++){
            if(b%i==0 && a%i==0){
                comnFactr=i;
            }
        }
        lcm=b*a/comnFactr;
        return lcm;
    }

    public static void main(String[] agrs) {
       Scanner sc=new Scanner(System.in);
       int x=0, y=0; 
       System.out.println("enter 1st no.: ");
       x=sc.nextInt();
       System.out.println("enter 2nd no.: ");
       y=sc.nextInt();
       System.out.println("lcm is: "+lCM(x, y));
    }
}
