public class primeFactor {
    /* static void prime(int n){
        for(int i=2; i*i<=n; i++){
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
        }
        if(n>1)
            System.out.println(n);
    } */

    static void prime(int n){
        while(n%2==0){
            System.out.println(2);
            n=n/2;
        }
        while(n%3==0){
            System.out.println(3);
            n=n/3;
        }
        for(int i=5; i*i<=n; i+=6){
            while(n%i==0)
              { System.out.println(5);
                n=n/5;
            }
            while(n%(i+2)==0){
                System.out.println(i+2);
                n=n/(i+2);
            }
        }
        if(n>3)
            System.out.println(n);
    }

    public static void main(String[] args) {
        int a=450;
        prime(a);
    }
}
