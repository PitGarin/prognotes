package enumset;

import java.util.EnumSet;

public class Start {

	public static void main(String[] args) {

		EnumSet<WeekDays> holidays = EnumSet.of(WeekDays.SATURDAY, WeekDays.SUNDAY);

		EnumSet<WeekDays> workingDays = EnumSet.of(WeekDays.FRIDAY, WeekDays.MONDAY, WeekDays.TUESDAY,
				WeekDays.WEDNESDAY, WeekDays.THURSDAY);
	}

}
