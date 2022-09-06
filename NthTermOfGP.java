import java.util.Scanner;

public class NthTermOfGP {
    static float termOfGP(int a, int b, int n){
        float r=(float)b/a;
        if(n==1)
            return a;
        if(n==2)
            return b;
        float term=(float)((float)a*Math.pow(r,n-1));
        return term;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,z;
        System.out.println("enter 1st term: ");
        x=sc.nextInt();
        System.out.println("enter 2nd term: ");
        y=sc.nextInt();
        System.out.println("enter no. of terms: ");
        z=sc.nextInt();
        System.out.println("required term is: "+termOfGP(x, y, z));
    }
}
// time complexity=O(1) auxiliary space complexity=Theta(1)