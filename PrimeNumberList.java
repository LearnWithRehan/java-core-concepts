import java.util.Scanner;

public class PrimeNumberList {
    public static void main(String[] args) {
        //from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Find Prime Number List Up to:-");
        int primenumber = sc.nextInt();
        int temp = 0;
        for (int num = 1; num<=primenumber; num++){
            for (int i = 2; i<=num-1; i++){
                if (num % i == 0){
                    temp = temp + 1;
                }
            }
            if (temp == 0){
                System.out.println(num);
            }else {
                temp = 0;
            }
        }
    }
}
