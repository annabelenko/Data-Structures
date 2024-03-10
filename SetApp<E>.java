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
        	if (i%(s2.getCapacity()/2) == 0){
        		//System.out.println(i);
	        	System.out.print(s2.toString()+ " ");
	        	System.out.println("(" + s2.size() + "/" + s2.getCapacity() + ")");
        	}
        }
    }
}