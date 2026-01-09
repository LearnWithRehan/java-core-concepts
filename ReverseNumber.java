public class ReverseNumber {
    public static void main(String[] args) {
        int num = 54321;
        int rev = 0 ;
        for (int i = num-1; i>=0; i--){
            rev += i;
        }
        System.out.println(rev);
    }
}
