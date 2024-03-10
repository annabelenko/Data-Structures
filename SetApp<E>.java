import java.util.Random;
public class SetApp<E> {
    public static void main(String [] args) {
        Set<Integer> s = new Set<Integer>();
        System.out.println("=== Basic Functionality ===");
        System.out.println();
        System.out.println("--- Creating a Set<Integer> and printing it and its initial stats ---");
        System.out.print(s.toString()+ " ");
        System.out.println("(" + s.size() + "/" + s.getCapacity() + ")");

        System.out.println();
        System.out.println("--- Loading it up to capacity with add ---");

        for (int i = 0; i < s.getCapacity(); i++) {
            s.add(i*10);
            System.out.print("Adding " + (i) + " -> " + s.toString());
            System.out.println(" (" + s.size() + "/" + s.getCapacity() + ")");
        }

        System.out.println();
        System.out.println("--- Loading it up with the same elements ---");

        for (int i = 0; i < s.getCapacity(); i++) {
            s.add(i*10);
            System.out.print("Adding " + (i) + " -> " + s.toString());
            System.out.println(" (" + s.size() + "/" + s.getCapacity() + ")");
        }

        System.out.println();
        System.out.println();
        System.out.println("--- Membership checking ---");

        for (int i =-5;i <= 14; i++){
            if (s.contains(i*10)){
                System.out.println("set contains "+(i*10));
            }
            else {
                System.out.println("set does not contain "+(i*10));
            }
        }
        System.out.println();
        System.out.println("=== Capacity Management ===");
        System.out.println();
        System.out.println("--- Creating a Set<Double> and loading it up with 1,000 elements ---");
        Set<Double> s2 = new Set<Double>();
        for (int i = 0; i <= 1000; i++){
            s2.add((double)i);
            if (i%(s2.getCapacity()/2) == 0 && i!=5){
                //System.out.println(i);
                System.out.print(s2.toString()+ " ");
                System.out.println("(" + s2.size() + "/" + s2.getCapacity() + ")");
            }
        }
        System.out.print(s2.toString()+ " ");
        System.out.println("(" + (s2.size()-1) + "/" + s2.getCapacity() + ")");
        System.out.println();
        System.out.println("=== Generics ===");
        System.out.println();
        System.out.println("--- Set<Double> ---");

        Set<Double> s3 = new Set<Double>();
        for (double i = 0.0; i < 10.0; i++){
            s3.add(i);
        }
        System.out.println(s3);
        System.out.println();
        System.out.println("--- Set<String> ---");
        Set<String> s4 = new Set<String>();
        s4.add("Str0");
        s4.add("Str1");
        s4.add("Str2");
        s4.add("Str3");
        s4.add("Str4");
        s4.add("Str5");
        s4.add("Str6");
        System.out.println(s4);
        System.out.println();
        System.out.println("--- Set<Set<Integer>> ---");

        Set<Set<Integer>> sets = new Set<>();
        sets.add(new Set<>());
        for (int i = 0; i <= 3; i++) {
            Set<Integer> set = new Set<>();
            for (int j = 0; j <= i; j++) {
                set.add(j);
            }
            sets.add(set);
        }

        System.out.println(sets);
        System.out.println();
        System.out.println("=== Element Order ===");
        System.out.println();
        System.out.println("--- Adding 10 random values to a Set<Integer> using a Random object with seed=12345 ---");

        Set<Integer> s10 = new Set<Integer>();

        Random random = new Random();
        random.setSeed(12345L);
        for (int i = 0; i < 10; i++){

            int num = random.nextInt(100);
            s10.add(num);
            System.out.println("adding "+num+" -> "+s10);
        }
        System.out.println(s10);
    }
}
