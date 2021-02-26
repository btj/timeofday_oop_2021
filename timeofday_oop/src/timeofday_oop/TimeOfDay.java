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
	 * @basic
	 */
	public int getHours() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @basic
	 */
	public int getMinutes() { throw new RuntimeException("Not yet implemented"); }

	/**
	 * @post | result == getHours() * 60 + getMinutes()
	 */
	public int getMinutesSinceMidnight() { throw new RuntimeException("Not yet implemented"); }

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
		throw new RuntimeException("Not yet implemented");
	}
	
}
