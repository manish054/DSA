public class ComputationPower {
    static int product(int x, int y){
        if(y==0)
            return 1;
        if(y%2==0)
            return product(x, y/2)*product(x, y/2);
        return x*product(x, y/2)*product(x, y/2);  // time complexity O(log n)
    }

    public static void main(String[] args) {
        int a=2, b=5;
        System.out.println(product(a, b));
    }
}
