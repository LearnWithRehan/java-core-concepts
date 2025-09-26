public class MindTrick {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a++ + ++a + a-- + --a);
    }
}

//explain
/*
a = 5
a++ => uses 5, then a becomes 6
++a => increments a to 7, uses 7
a-- => uses 7, then a becomes 6
--a => decrements a to 5, uses 5
calculation: 5 + 7 + 7+ 5  = 24




 */