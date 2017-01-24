package ws.randoption;

import java.time.ZonedDateTime;
import java.time.ZoneOffset;

public class Timestamp {

    public static long nowLong() {
        ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
        return utc.toEpochSecond() * 1000;
    }

    public static String nowString() {
        ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);
        long epochtime = utc.toEpochSecond() * 1000;
        return Long.toString(epochtime);
    }
}