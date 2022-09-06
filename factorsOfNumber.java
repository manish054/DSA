public class factorsOfNumber {
    static void factors(int n){
        int i;
        for(i=1; i*i<=n; i++ ){
            if(n%i==0)
                System.out.println(i);
        }
        for(;i>=1;i--){
            if(n%i==0){
                if(n/i!=i)
                    System.out.println(n/i);
            }
        }    
    }

    public static void main(String[] args) {
        int a=100;
        factors(a);
    }
}
