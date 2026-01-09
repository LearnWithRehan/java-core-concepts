import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(50);
        pq.add(100);
        pq.add(200);
        pq.add(500);
        System.out.println("Head: " + pq.peek());
        System.out.println("Removed: " + pq.poll());
        System.out.println("After Poll: " + pq);
    }

}
