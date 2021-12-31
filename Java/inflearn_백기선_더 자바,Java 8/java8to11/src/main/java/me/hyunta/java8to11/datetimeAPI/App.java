package me.hyunta.java8to11.datetimeAPI;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;

public class App {
	public static void main(String[] args) {
		/**
		 * 기계시간 Instant , 사람시간 LocalDateTime
		 */
		Instant instant = Instant.now();
		System.out.println(instant); // 기준시 GMT 를 반환한다.
		System.out.println(instant.atZone(ZoneId.of("GMT")));

		ZoneId zone = ZoneId.systemDefault();
		System.out.println(zone);
		ZonedDateTime zonedDateTime = instant.atZone(zone);
		System.out.println(zonedDateTime);

		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		LocalDateTime birthDay = LocalDateTime.of(1995, Month.FEBRUARY, 3, 10, 30, 0);
		ZonedDateTime nowInKorea = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(nowInKorea);

		/**
		 * 기간
		 */
		LocalDate today = LocalDate.now();
		LocalDate thisYearBirthday = LocalDate.of(2022, Month.FEBRUARY, 3);

		Period period = Period.between(today, thisYearBirthday);
		System.out.println(period.getDays());

		Period until = today.until(thisYearBirthday);
		System.out.println(period.get(ChronoUnit.DAYS));

		Instant now1 = Instant.now();
		Instant plus = now1.plus(10, ChronoUnit.SECONDS);
		Duration between = Duration.between(now1, plus);
		System.out.println(between.getSeconds());

		LocalDateTime beforeFormat = LocalDateTime.now();

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		System.out.println(beforeFormat.format(dateTimeFormatter));

		LocalDate parse = LocalDate.parse("02/03/1995", dateTimeFormatter);
		System.out.println(parse);

		Date date = new Date();
		Instant instant1 = date.toInstant();
		Date from = Date.from(instant1);

		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		ZonedDateTime zonedDateTime1 = gregorianCalendar.toInstant().atZone(ZoneId.systemDefault());
		GregorianCalendar from1 = GregorianCalendar.from(zonedDateTime1);
		System.out.println(zonedDateTime1);
		System.out.println(from1);
	}
}
