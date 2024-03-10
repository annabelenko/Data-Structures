import java.util.HashSet;
import java.util.Random;

public class HashSetApp {
    public static void main(String [] args) {
        HashSet<Integer> s = new HashSet<Integer>();
        System.out.println("=== Basic Functionality ===");
        System.out.println();
        System.out.println("--- Creating a HashSet<Integer> and printing it and its initial stats ---");
        System.out.print(s +" ("+ s.size()+")");
        System.out.println();
        System.out.println();
        System.out.println("--- Loading it up to 10 with add ---");

        for (int i = 0; i < 10; i++) {
            s.add(i*10);
            System.out.println("Adding " + (i) + " -> " + s +" ("+ s.size()+")");
        }
        System.out.println();
        System.out.println("--- Loading it up with the same elements ---");

        for (int i = 0; i < s.size(); i++) {
	            s.add(i*10);
            	System.out.println("Adding " + (i) + " -> " + s +" ("+ s.size()+")");
        }
        
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
        System.out.println("=== Generics ===");
        System.out.println();
        System.out.println("--- HashSet<Double> ---");

        HashSet<Double> s1 = new HashSet<Double>();
        s1.add(0.0);
        s1.add(1.0);
        s1.add(2.0);
        s1.add(4.0);
        s1.add(8.0);
        s1.add(9.0);
        s1.add(3.0);
        s1.add(6.0);
        s1.add(7.0);
        System.out.println(s1);
		System.out.println();

        System.out.println("--- HashSet<String> ---");
        HashSet<String> s2 = new HashSet<String>();
        s2.add("Str6");
        s2.add("Str5");
        s2.add("Str4");
        s2.add("Str");
        s2.add("Str2");
        s2.add("Str1");
        s2.add("Str0");
        System.out.println(s2);
        System.out.println();

        System.out.println("--- HashSet<HashSet<Integer>> ---");


        HashSet<HashSet<Integer>> sets = new HashSet<>();

        sets.add(new HashSet<>());

        for (int i = 0; i <= 3; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j <= i; j++) {
                set.add(j);
            }
            sets.add(set);
        }

        System.out.println(sets);
        System.out.println();

        System.out.println("=== Element Order ===");
        System.out.println();
        System.out.println("--- Adding 10 random values to a HashSet<Integer> using a Random object with seed=12345 ---");

		HashSet<Integer> s10 = new HashSet<Integer>();

        Random random = new Random();
		random.setSeed(12345L);
		for (int i = 0; i < 10; i++){
			
			int num = random.nextInt();
            s10.add(num);
			System.out.println("adding "+num+"->"+s10);
		}
        System.out.println(s10);
    }
}