public class TrailingZerosEfficient {
    static int efficientMethod(int n){
        int count=0;
        for(int i=5;i<=n;i=i*5){
            count=count+n/i;
        }
        return count;
    }
    public static void main(String[] agrs){
        int a=251;
        System.out.println("no. of trailing zeros: "+efficientMethod(a));
    }
}
