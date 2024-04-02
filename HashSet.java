import java.util.Random;
import java.util.HashSet;

public class HashSet {

    public static void main(String[] args) {
        SetApp<Integer> s = new SetApp<>();
        System.out.println("=== Basic Functionality ===");
        System.out.println();
        System.out.println("--- Creating a Set<Integer> and printing it and its initial stats ---");
        System.out.println(s + " (" + s.size() + ")");
        System.out.println();
        System.out.println("--- Loading it up to 10 with add ---");

        for (int i = 0; i < 10; i++) {
            s.add(i * 10);
            System.out.println("Adding " + (i ) + " -> " + s + " (" + s.size() + ")");
        }

        System.out.println();
        System.out.println("--- Loading it up with the same elements  ---");

        for (int i = 0; i < s.size(); i++) {
            s.add(i * 10);
            System.out.println("Adding " + (i) + " -> " + s + " (" + s.size() + ")");
        }

        System.out.println();
        System.out.println("--- Membership checking  ---");

        for (int i = -5; i <= 14; i++) {
            if (s.contains(i * 10)) {
                System.out.println("set contains " + (i * 10));
            } else {
                System.out.println("set does not contain " + (i * 10));
            }
        }

        System.out.println();
        System.out.println("=== Generics ===");
        System.out.println();
        System.out.println("--- Set<Double> ---");

        SetApp<Double> s1 = new SetApp<>();
        for (double i = 0.0; i <= 9.0; i++) {
            s1.add(i);
        }
        System.out.println(s1);
        System.out.println();

        System.out.println("--- Set<String> ---");
        SetApp<String> s2 = new SetApp<>();
        for (int i = 0; i < 7; i++) {
            s2.add("Str" + i);
        }
        System.out.println(s2);
        System.out.println();
        System.out.println();
        System.out.println("=== Element Order ===");
        System.out.println();
        System.out.println("--- Adding 10 random values to a Set<Integer> using a Random object with seed=12345 ---");

        SetApp<Integer> s10 = new SetApp<>();
        Random random = new Random(12345);
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100);
            s10.add(num);
            System.out.println("adding " + num + " -> " + s10);
        }
        System.out.println(s10);
    }
}