package Day12.Ex01_Time;

import java.time.LocalDateTime;

public class DateTimeOperation {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("현재 시간 : " + now);
		
		// 날짜, 시간 추가하기
		// +1년 +1개월 +1일 -3시간 -15분 -25초
		LocalDateTime targetTime = now.plusYears(1)		// 반환하는게 객체 return : LocalDateTime 을 반환
									  .plusMonths(1)
									  .plusDays(1)
									  .plusHours(-3)
									  .plusMinutes(-15)
									  .plusSeconds(-25);	// (메소드 체이닝),빌더패턴	밑에것 대신 이렇게 사용할수있음.
		//		targetTime = targetTime.plusMonths(1);
		
		System.out.println("변경 시간 : " + targetTime);
		
		
		
		
	}
}
