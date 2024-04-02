public class CivilianTime implements Time {
    private int hours12, minutes;
    private String amPm;

    public CivilianTime(String timeStr) {
        set(timeStr);
    }

    public void set(String timeStr) {
        String[] split = timeStr.split(":");
        hours12 = Integer.parseInt(split[0]);
        minutes = Integer.parseInt(split[1].substring(0, 2));
        amPm = split[1].substring(2).toLowerCase();
    }

    @Override
    public int get12Hour() {
        return hours12;
    }

    @Override
    public int get24Hour() {
        if (amPm.equals("am")) {
            if (hours12 == 12) {
                return 0;
            }
            return hours12;
        } else {
            if (hours12 == 12) {
                return 12;
            }
            return hours12 + 12;
        }
    }

    @Override
    public int getMinute() {
        return minutes;
    }

    @Override
    public void tick() {
        minutes++;
        if (minutes == 60) {
            minutes = 0;
            hours12++;
            if (hours12 == 12) {
                if (amPm.equals("am")) {
                    amPm = "pm";
                } else {
                    amPm = "am";
                }
            } else if (hours12 == 13) {
                hours12 = 1;
            }
        }
    }

    public String toString() {
        return String.format("%02d:%02d%s", hours12, minutes, amPm);

    }
}