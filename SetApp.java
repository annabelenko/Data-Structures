//SetApp class is an application with the main method

public class SetApp {
    public static void main(String [] args) {
        Set s = new Set(5);
        System.out.println("=== Testing a Set");
        System.out.println();
        System.out.println("capacity: " + s.getCapacity());
        System.out.println("size: " + s.size());
        System.out.println("s: " + s.toString());

        System.out.println();
        System.out.println("Filling up the set");

        for (int i = 1; i <= s.getCapacity(); i++) {
            s.add(i * 10);
            System.out.println("Added " + (i*10) + " -> " + s.toString());
        }

        System.out.println();
        System.out.println("Adding the same numbers again");

        for (int i = 1; i <= s.getCapacity(); i++) {
            s.add(i * 10);
            System.out.println("Added " + (i*10) + " -> " + s.toString());
        }
        System.out.println();
        System.out.println();
        Set s2 = new Set(10);
        System.out.println("=== Testing a Set");
        System.out.println();
        System.out.println("capacity: " + s2.getCapacity());
        System.out.println("size: " + s2.size());
        System.out.println("s: " + s2.toString());

        System.out.println();
        System.out.println("Filling up the set");

        for (int i = 1; i <= s2.getCapacity(); i++) {
            s2.add(i * 10);
            System.out.println("Added " + (i*10) + " -> " + s2.toString());
        }

        System.out.println();
        System.out.println("Adding the same numbers again");

        for (int i = 1; i <= s2.getCapacity(); i++) {
            s2.add(i * 10);
            System.out.println("Added " + (i*10) + " -> " + s2.toString());
        }
    }
}