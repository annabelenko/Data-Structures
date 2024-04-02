public class ElapsedTimeApp {
    public static void main (String[] args) {

		ElapsedTime time = new ElapsedTime(); // Use the default constructor
		time.set("11:45pm"); // Initialize the time
        System.out.println("Should be receiving time of 11:45pm");
        System.out.println(time);
        System.out.println("12 hour: " + time.get12Hour());
        System.out.println("24 hour: " + time.get24Hour());
        System.out.println("minute: " + time.getMinute());

        System.out.println();

        System.out.println("Setting time to 12:58am");

        time.set("12:58am");
        System.out.println(time);

        System.out.println();

        System.out.println("Bunch of ticking");
        System.out.println();

        for (int h = 0; h < 24; h++) {
            for (int m = 1; m <= 3; m++) {
                time.tick();
                System.out.println(time);
            }
            for (int m = 1; m <= 57; m++) 
                time.tick();
            System.out.println();
        }
    }
}
