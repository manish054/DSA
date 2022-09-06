public class SieveofEratosthenes {
    static void sieveofEratosthenes(int n){
        boolean array[]= new boolean[n+1];
        for(int i=0; i<=n; i++){
            array[i]=true;
        }

        for(int j=2; j*j<=n; j++){ //important logic is applied here
            if(array[j]==true){
                for(int i=j*j; i<=n; i+=j){
                    array[i]=false;
                }
            }
        }

        for(int i=2; i<=n; i++){
            if(array[i]==true)
                System.out.print(i+" ");
        }
    }

    public static void main(String[] agrs) {
        int a=13;
        sieveofEratosthenes(a);
    }
}
