package chapter3;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.UnsupportedTemporalTypeException;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

import static lib.TextElements.*;

@SuppressWarnings("all")
public class DateAndTime {

	static TextElements tx;

	public static void main(String[] args) {

		// Local Dates
		{
			System.out.println(LocalDate.now());
			System.out.println(LocalTime.now());
			System.out.println(LocalDateTime.now());

			// LocalDate d = new LocalDate(); // DOES NOT COMPILE
		}

		System.out.println(tx.SEPARATOR);

		// Still Local Dates...
		{
			System.out.println(LocalDate.of(2015, Month.JANUARY, 20));
			System.out.println(LocalDate.of(2015, 1, 20));

		}

		System.out.println(tx.SEPARATOR);

		// Local Time
		{
			System.out.println(LocalTime.of(6, 15)); // hour + minute
			System.out.println(LocalTime.of(6, 15, 30)); // hour + minute +
															// seconds
			System.out.println(LocalTime.of(6, 15, 30, 200)); // hour + minute +
																// seconds +
																// nanoseconds
		}

		System.out.println(tx.SEPARATOR);

		// Local DateTime
		{
			LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
			LocalTime time1 = LocalTime.of(6, 15); // hour + minute

			System.out.println(LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15,
					30, 200));
			System.out.println(LocalDateTime.of(date1, time1));
		}

		System.out.println(tx.SEPARATOR);

		/*
		 * Lets create a date on January, 1th, 2015 @ 12:30
		 */
		{
			// Before Java 8
			{
				Calendar c = Calendar.getInstance();
				c.set(2015, Calendar.JANUARY, 1, 12, 30, 0);

				Date date = c.getTime();

				System.out.println("Java 7-: " + date);
			}

			System.out.println(tx.MINISEPARATOR);

			// With Java 8
			{
				LocalDateTime date = LocalDateTime.of(2015, Month.JANUARY, 1,
						12, 30);

				System.out.println("Java 8: " + date);

			}
		}

		System.out.println(tx.SEPARATOR);

		// Manipulating Dates and Times
		{
			LocalDateTime date = LocalDateTime
					.of(1990, Month.JANUARY, 1, 10, 0);

			date = date.plusYears(26L);

			date = date.plusMonths(7L);

			date = date.plusDays(18L);

			date = date.plusHours(9);

			System.out.println(date);

			date = date.minusMonths(4);

			date = date.plusDays(11);

			date = date.minusYears(25L);

			System.out.println(date);
		}

		System.out.println(tx.SEPARATOR);

		// Periods
		{
			Period monthly = Period.ofMonths(12);
			Period weekly = Period.ofWeeks(2);

			LocalDate start = LocalDate.of(2016, Month.JANUARY, 1);
			LocalDate current = start;

			int count = 0;

			while (current.isBefore(start.plus(monthly))) {
				System.out.println("W" + ++count + " " + current);

				current = current.plus(weekly);
			}
		}

		System.out.println(tx.SEPARATOR);

		// Duration
		{
			Duration halfDay = Duration.ofHours(12);
			Duration hourly = Duration.ofHours(1);

			LocalTime start = LocalTime.of(00, 00);

			LocalTime current = start;

			while (current.isBefore(start.plus(halfDay))) {
				System.out.println("H " + current);

				current = current.plus(hourly);

			}
		}

		System.out.println(tx.SEPARATOR);

		// Formating Dates and Times
		{
			LocalDate date = LocalDate.of(1991, Month.AUGUST, 19);
			LocalTime time = LocalTime.of(19, 0, 0);

			LocalDateTime dateTime = LocalDateTime.of(date, time);

			System.out.println(date.getDayOfWeek());
			System.out.println(date.getMonth());
			System.out.println(date.getYear());
			System.out.println(date.getDayOfMonth());
			System.out.println(date.getDayOfYear());

			// Using DateTimeFormatter
			System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));

			System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));

			System.out.println(dateTime
					.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

		}

		System.out.println(tx.SEPARATOR);

		// More formatting
		{

			LocalDate date = LocalDate.of(1991, Month.AUGUST, 19);
			LocalTime time = LocalTime.of(19, 0, 0);

			LocalDateTime dateTime = LocalDateTime.of(date, time);

			DateTimeFormatter fShort = DateTimeFormatter
					.ofLocalizedDate(FormatStyle.SHORT);
			DateTimeFormatter fMedium = DateTimeFormatter
					.ofLocalizedDate(FormatStyle.MEDIUM);
			DateTimeFormatter fCustom = DateTimeFormatter
					.ofPattern("yyyy-MMM-dd - hh-mm-ss");

			// Predefined formater styles: SHORT
			System.out.println(fShort.format(dateTime));
			System.out.println(fShort.format(date));
			
			// Predefined formater styles: MEDIUM
			System.out.println(fShort.format(dateTime));
			System.out.println(fShort.format(date));

			// Predefined formater styles: CUSTOMIZED
			System.out.println(fCustom.format(dateTime));
//			System.out.println(fCustom.format(date));

//			try {
//				System.out.println(fShort.format(time));
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
		}

	}

}
