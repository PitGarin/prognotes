package oopractice.time;

public class Time {
	private int second, minute, hour;

	public void setSecond(int second) {
		if (second >= 0 && second <= 59) {
			this.second = second;
		} else {
			this.second = 0; // Set to 0 and print error message
			System.out.println("error: invalid second");
		}
	}

	public void setMinute(int minute) {
		if (minute >= 0 && minute <= 59) {
			this.minute = minute;
		} else {
			throw new IllegalArgumentException("Invalid minute!");
		}
	}

	public void setHour(int hour) {
		if (hour >= 0 && hour <= 23) {
			this.hour = hour;
		} else {
			throw new IllegalArgumentException("Invalid hour!");
		}
	}

	/**
	 * @return the second
	 */
	public int getSecond() {
		return second;
	}

	/**
	 * @return the minute
	 */
	public int getMinute() {
		return minute;
	}

	/**
	 * @return the hour
	 */
	public int getHour() {
		return hour;
	}

	public Time() {
		super();
	}

	public Time(int second, int minute, int hour) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d.", hour, minute, second);
	}

	public void setTime(int second, int minute, int hour) {
		this.setSecond(this.second = second);
		this.setMinute(minute);
		this.setHour(hour);
	}

	public Time nextSecond() {
		++second;
		if (second >= 60) {
			second = 0;
			++minute;
			if (minute >= 60) {
				minute = 0;
				++hour;
				if (hour >= 24) {
					hour = 0;
				}
			}
		}
		return this; // Return "this" instance, to support chaining
						// e.g., t1.nextSecond().nextSecond()
	}

}
