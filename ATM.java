import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        int balance = 20000;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Your Balance: " + balance);
                    break;
                case 2:
                    System.out.println("Enter Amount: ");
                    int amt = sc.nextInt();  //20000
                    if (amt <= balance){
                        balance -= amt;  //balance = balance - amt
                        System.out.println("Withdrawal Successfull! New balance: " + balance);
                    }else {
                        System.out.println("Insufficient Balance");
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using ATM");
                    return;
                default:
                    System.out.println("Invalid option");

            }

        }

    }
}
