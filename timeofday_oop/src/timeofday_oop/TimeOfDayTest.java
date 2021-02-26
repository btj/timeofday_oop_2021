package timeofday_oop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay myTimeOfDay = new TimeOfDay(11, 24);
		assertEquals(11, myTimeOfDay.getHours());
		assertEquals(24, myTimeOfDay.getMinutes());
		assertEquals(11 * 60 + 24, myTimeOfDay.getMinutesSinceMidnight());
	}

}
