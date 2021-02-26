package timeofday_oop;

/**
 * Each instance of this class represents a time of day.
 * 
 * @invar | 0 <= getHours() && getHours() <= 23
 * @invar | 0 <= getMinutes() && getMinutes() <= 59
 */
public class TimeOfDay {
	
	/**
	 * @invar | 0 <= minutesSinceMidnight
	 * @invar | minutesSinceMidnight < 24 * 60
	 */
	private int minutesSinceMidnight;
	
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
	
	/**
	 * Sets this object's hours to the given hours.
	 * 
	 * @mutates | this
	 * 
	 * @pre | 0 <= newHours && newHours <= 23
	 * 
	 * @post | getHours() == newHours
	 * @post | getMinutes() == old(getMinutes())
	 */
	public void setHours(int newHours) {
		minutesSinceMidnight = 60 * newHours + getMinutes();
	}
	
	/**
	 * Sets this object's minutes to the given minutes.
	 * 
	 * @mutates | this
	 * 
	 * @pre | 0 <= newMinutes && newMinutes <= 59
	 * 
	 * @post | getHours() == old(getHours())
	 * @post | getMinutes() == newMinutes
	 */
	public void setMinutes(int newMinutes) {
		minutesSinceMidnight = getHours() * 60 + newMinutes;
	}
	
}
