import clock.Clock;
import clock.BRLClock;
import clock.USClock;

public class Main {
    public static void main(String[] args) {
        Clock brlClock = new BRLClock();
        
        brlClock.setSecond(0);
        brlClock.setMinute(0);
        brlClock.setHour(23);
        
        Clock usClock = new USClock();
        usClock.setSecond(0);
        usClock.setMinute(0);
        usClock.setHour(23);

        System.out.println(brlClock.getTime());
        System.out.println(usClock.getTime());
        System.out.println(new BRLClock().convert(usClock).getTime());
        System.out.println(new USClock().convert(brlClock).getTime());
    }
}
