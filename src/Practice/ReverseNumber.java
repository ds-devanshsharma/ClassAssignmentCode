package Practice;
class ReverseCode{
    public static int reverse(int number){
        int ans=0;
        int count = (int)Math.log10(number)+1;
//        System.out.println(count);
        while(count>0){
            ans = ans*10 + (number%10);
            number/=10;
            count--;
        }
        return ans;
    }
}
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(ReverseCode.reverse(123));
    }
}
