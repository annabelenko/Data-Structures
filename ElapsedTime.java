public class ElapsedTime implements Time {

    private int totalMinutesSinceMidnight = 1425; // Default time 11:45 PM

    public void set(String inputTime) {
        int hour = Integer.parseInt(inputTime.split(":")[0]);
        int minute = Integer.parseInt(inputTime.split(":")[1].substring(0, 2));
        boolean isAM = inputTime.endsWith("am");

        if (!isAM && hour != 12) {
            hour += 12; // Convert PM times to 24-hour format
        } else if (isAM && hour == 12) {
            hour = 0; // Convert 12 AM to 00
        }

        this.totalMinutesSinceMidnight = hour * 60 + minute;
    }

    public int get12Hour() {
        int hour = (totalMinutesSinceMidnight / 60) % 12;
        return hour == 0 ? 12 : hour; // Adjust for 12-hour format
    }

    public int get24Hour() {
        return totalMinutesSinceMidnight / 60;
    }

    public int getMinute() {
        return totalMinutesSinceMidnight % 60;
    }

    public void tick() {
        totalMinutesSinceMidnight = (totalMinutesSinceMidnight + 1) % (24 * 60); // Wrap around after 23:59
    }


    public String toString() {
        int hour = get24Hour();
        int minute = getMinute();
        boolean isAM = totalMinutesSinceMidnight < 720; // AM if before 12:00 PM

        if (hour == 0 || hour == 12) {
            hour = 12; // Adjust for 12-hour format
        } else {
            hour %= 12;
        }

        return String.format("%02d:%02d%s", hour, minute, isAM ? "am" : "pm");
    }
}
