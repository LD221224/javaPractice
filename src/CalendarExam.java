import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.*;

public class CalendarExam{
    public String hundredDaysAfter(){
        //오늘부터 100일 뒤의 날짜를 "2016년1월1일"의 형식으로 return하세요.
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 100);
        int yyyy = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;      // 월은 0부터 시작합니다.
        int date = cal.get(Calendar.DATE);
        int hour = cal.get(Calendar.HOUR_OF_DAY);     // 하루를 24시간으로 표현한 시각
        int minute = cal.get(Calendar.MINUTE);
        String str = yyyy + "년" + month + "월" + date + "일";
        return str;
    }
    public static void main(String[] args){
		Date date = new Date();
		System.out.println(date.toString());
		SimpleDateFormat ft =  new SimpleDateFormat ("yyyy.MM.dd 'at' hh:mm:ss a zzz");     
		System.out.println(ft.format(date));  
		
		CalendarExam calEx = new CalendarExam();
		System.out.println(calEx.hundredDaysAfter());
		 
		LocalDateTime timePoint = LocalDateTime.now(); // 현재의 날짜와 시간
		LocalDate theDate = timePoint.toLocalDate();
		Month month = timePoint.getMonth();
		int day = timePoint.getDayOfMonth();
		int hour = timePoint.getHour();
		int minute = timePoint.getMinute();
		int second = timePoint.getSecond();
		// 달을 숫자로 출력한다 1월도 1부터 시작하는 것을 알 수 있습니다. 
		System.out.println(month.getValue() + "/" + day + "  " + hour + ":" + minute + ":" + second);

    }
}