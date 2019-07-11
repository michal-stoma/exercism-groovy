import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond {
	static long GIGASECOND = 10**9

    static LocalDateTime add(LocalDate date) {
    	date.atStartOfDay().plusSeconds(GIGASECOND)
    }

    static LocalDateTime add(LocalDateTime date) {
    	date.plusSeconds(GIGASECOND)
    }

}
