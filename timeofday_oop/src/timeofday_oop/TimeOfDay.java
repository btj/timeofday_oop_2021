package timeofday_oop;

/**
 * Each instance of this class represents a time of day.
 * 
 * @invar | 0 <= getHours() && getHours() <= 23
 * @invar | 0 <= getMinutes() && getMinutes() <= 59
 * 
 * @immutable
 */
public class TimeOfDay {
	
	/**
	 * @invar | 0 <= minutesSinceMidnight
	 * @invar | minutesSinceMidnight < 24 * 60
	 */
	private final int minutesSinceMidnight;
	
	/**
	 * @basic
	 */
	public int getHours() { return minutesSinceMidnight / 60; }
	
	/**
	 * @basic
	 */
	public int getMinutes() { return minutesSinceMidnight % 60; }

	/**
	 * @post | result == getHours() * 60 + getMinutes()
	 */
	public int getMinutesSinceMidnight() {
		return minutesSinceMidnight;
	}

	/**
	 * Initializes this object so that it represents the time of day given by the given hours and minutes.
	 * 
	 * @throws IllegalArgumentException | hours < 0 || 23 < hours
	 * @throws IllegalArgumentException | minutes < 0 || 59 < minutes
	 * 
	 * @post | getHours() == hours
	 * @post | getMinutes() == minutes
	 */
	public TimeOfDay(int hours, int minutes) {
		if (hours < 0 || 23 < hours)
			throw new IllegalArgumentException("`hours` is invalid");
		if (minutes < 0 || 59 < minutes)
			throw new IllegalArgumentException("`minutes` is invalid");
		
		this.minutesSinceMidnight = hours * 60 + minutes;
	}
	
}
