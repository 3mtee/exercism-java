import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Gigasecond {
    private final LocalDateTime dateTime;

    public Gigasecond(LocalDate moment) {
        this.dateTime = addGigasecond(moment.atStartOfDay());
    }

    public Gigasecond(LocalDateTime moment) {
        this.dateTime = addGigasecond(moment);
    }

    private LocalDateTime addGigasecond(LocalDateTime moment) {
        return moment.plus((long) Math.pow(10, 9), ChronoUnit.SECONDS);
    }

    public LocalDateTime getDateTime() {
        return this.dateTime;
    }
}
