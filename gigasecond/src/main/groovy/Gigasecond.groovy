import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond {
	static final int GIGASECOND = 10**9

    static LocalDateTime add(LocalDate date) {
    	add(date.atStartOfDay())
    }

    static LocalDateTime add(LocalDateTime date) {
    	date + GIGASECOND
    }

}
