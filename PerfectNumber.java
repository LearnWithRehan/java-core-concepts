import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt(), sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0) sum+=i;
        }
        System.out.println(n + (sum==n ? " is perfect" : " is not perfect"));
    }
}