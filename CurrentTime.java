package bookpractice;

public class CurrentTime {

	public static void main(String[] args) {
		long totalMilliSeconds = System.currentTimeMillis();
		System.out.println(totalMilliSeconds);
		long totalSeconds = totalMilliSeconds/1000;
		System.out.println(totalSeconds);
		long currentSecond = totalSeconds%60;
		System.out.println(currentSecond);
		long totalMinute = totalSeconds/60;
		System.out.println(totalMinute);
		long currentMinute = totalSeconds%60;
		System.out.println(currentMinute);
		long totalHour = totalMinute/60;
		System.out.println(totalHour);
		long currentHour = totalHour%24;
		System.out.println(currentHour);
		System.out.println("current Hour "+currentHour+"current minutes "+currentMinute+"current seconds "+currentSecond);
		
	}

}
