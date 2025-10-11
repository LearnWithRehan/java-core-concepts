public class swaptwonowithoutthirdvar {
    public static void main(String[] args) {
        int a= 10,b=20;
        System.out.println("original value of a:- " + a + " and original value of b:- " + b);
        //swap = a = 20, b = 10;
        //condition a = a + b = 10 + 20 = 30
        // b = a - b = 30-20 = 10
        //  a = a - b = 30 - 10 = 20
        // a=20, b = 10;

        a = a + b;
        b = a-b;
        a = a-b;
        System.out.println("After swap");
        System.out.println("a:- " + a + " b:- " + b);
    }
}
