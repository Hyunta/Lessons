package me.hyunta.java8to11.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App {

	public static void main(String[] args) throws InterruptedException {
		Date date = new Date();
		Calendar calendar = new GregorianCalendar();
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		long time = date.getTime();
		System.out.println(date);
		System.out.println(time);

		// Thread.sleep(1000 * 3);
		// Date after3Seconds = new Date();
		// System.out.println(after3Seconds);
		// after3Seconds.setTime(time);
		// System.out.println(after3Seconds);

		Calendar hyuntaeBirthDay = new GregorianCalendar(1995, Calendar.FEBRUARY, 3);
		System.out.println(hyuntaeBirthDay.getTime());
	}
}
