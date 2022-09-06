public class PrimeFactors {
    static boolean isPrime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    static void primeFactor(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                if(isPrime(i)){
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        int a=100;
        primeFactor(a);
    }
}
