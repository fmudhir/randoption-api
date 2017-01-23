package ws.randoption;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RandResultJson {
    public String pid;
    public LocalDateTime time;

    public RandResultJson() {} // JAXB needs this

    public RandResultJson(String profileId) {
        this.pid = profileId;
        this.time = LocalDateTime.now();
    }
}