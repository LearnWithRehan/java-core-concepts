import java.util.TreeSet;

public class TreeSetExamp {
    public static void main(String[] args) {
        TreeSet<Integer> evenNumbers = new TreeSet<>();

        //using the add() method
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println("TreeSet: " + evenNumbers);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);

        //using the addAll() method
        numbers.addAll(evenNumbers);
        System.out.println("New TreeSet: " + numbers);
    }
}
