import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        System.out.println("Queue: " + numbers);
        System.out.println("Head: " + numbers.peek());
        System.out.println("Removed: " + numbers.poll());
        System.out.println("After Removal: " + numbers);
    }
}
