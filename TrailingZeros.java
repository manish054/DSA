import java.util.Scanner;

public class TrailingZeros {
    static int countZeros(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;
        }
        int count=0;
        while(fact%10==0){
            count++;
            fact=fact/10;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.: ");
        int a=sc.nextInt();
        System.out.println("Nos. of trailing Zeros= "+countZeros(a));
    }
}
