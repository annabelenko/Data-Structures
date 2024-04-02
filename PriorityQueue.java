import java.util.*;

public class PriorityQueue {
    public static void main(String [] args) {
        System.out.println("========== PriorityQueue ==========");
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        System.out.println(priorityQueue + " (" + priorityQueue.isEmpty() + ")");
        System.out.println();

        System.out.println("Adding");
        System.out.println("------");
        int[] nums = {251, 80, 241, 828, 55, 84, 375, 802, 501, 389};
        for (int i = 0; i < 10; i++) {
                System.out.print("Str" + (nums[i]) + " -> "); 
                priorityQueue.add("Str" + (nums[i]));
                System.out.println(priorityQueue + " (" + priorityQueue.isEmpty() + ")");
        }

        System.out.println();
        System.out.println("Removing");
        System.out.println("--------");

        while (!priorityQueue.isEmpty()) {
                System.out.print(priorityQueue + " (" + priorityQueue.isEmpty() + ")");
                System.out.println(" -> " + priorityQueue.remove());
        }
        System.out.println(priorityQueue + " (" + priorityQueue.isEmpty() + ")");

    }
}