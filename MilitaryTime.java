public class MilitaryTime implements Time {

    private int time;
    int hours, minutes;

    public MilitaryTime(String timeStr) {
        set(timeStr);
    }

    @Override
    public void set(String timeStr) {
        // TODO Auto-generated method stub
        String[] split = timeStr.split(":");
        hours = Integer.parseInt(split[0]);
        minutes = Integer.parseInt(split[1].substring(0, 2));
        if (timeStr.contains("pm") && hours != 12) {
            hours += 12;
        } else if (timeStr.contains("am") && hours == 12) {
            hours = 0;
        }
    }

    @Override
    public int get12Hour() {
        // TODO Auto-generated method stub
        int hours12 = hours % 12;
        if (hours12 == 0) {
            hours12 = 12;
        }
        return hours12;
    }

    @Override
    public int get24Hour() {
        // TODO Auto-generated method stub
        return hours;
    }

    @Override
    public int getMinute() {
        // TODO Auto-generated method stub
        return minutes;
    }

    @Override
    public void tick() {
        // TODO Auto-generated method stub
        minutes++;
        if (minutes == 60) {
            minutes = 0;
            hours++;
            if (hours == 24) {
                hours = 0;
            }
        }
    }

    public String toString() {
        String amPm = (hours < 12) ? "am" : "pm";
        int hour12 = get12Hour();
        return String.format("%02d:%02d%s", hour12, minutes, amPm);
    }
}