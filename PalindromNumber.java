public class PalindromNumber {
    static boolean palindrom(int n){
        int sum=0;
        int temp=n;
        while(temp!=0){
            sum=sum*10+temp%10;
            temp=temp/10;
        }
         /*   if(sum==temp){
                flag=true;
                return flag;
        } */
        return (sum==n);
    }
    public static void main(String[] agrs) {
        int a=1231;
        if(palindrom(a)==true){
            System.out.println("palindrom");
        }
        else{
            System.out.println("Not Palindrom");
        }
    }
}
