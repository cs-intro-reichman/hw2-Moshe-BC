public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int hours = 0, minutes = 0;
        //transfer string digits to int variables:
        hours = (Integer.parseInt(time.charAt(0) + "") * 10 + Integer.parseInt(time.charAt(1) + ""));
        minutes = (Integer.parseInt(time.charAt(3) + "") * 10 + Integer.parseInt(time.charAt(4) + ""));

        int newTime = hours * 60 + minutes;
        int addedTime = Integer.parseInt(args [1]);
        //recalculate time:
        newTime = newTime + addedTime;
        minutes = newTime % 60;
        hours = newTime / 60;
        hours = hours % 24; //reset daily hour limit

        System.out.printf("%02d:%02d", hours, minutes);

    }
}
