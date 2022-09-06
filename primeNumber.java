
public class primeNumber {
    /* static boolean isPrime(int n){
        boolean flag=true;
        for(int i=2; i<=(int)n/2; i++){
            if(n/i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
    */

    /* static boolean isPrime(int n){
        boolean flag=false;
        for(int i=2; i<=(int)Math.sqrt(n); i++){
            if(n%i==0){
                flag=true;
                break;
            }
        }
        return flag;
    } */

    static boolean isPrime(int n){
        if(n==1)
            return false;
        if(n==2 || n==3)
            return false;
        if(n%2==0||n%3==0)
            return true;
        for(int i=5; i*i<=n; i+=6)
        {
            if(n%i==0||n%(i+2)==0)
                return true;
        }
        return true;
    }

    public static void main(String[] agrs) {
        int a=25;
        boolean flag=isPrime(a);
        if(flag==true)
            System.out.println("not prime");
        else
            System.out.println("prime");
    }
}
