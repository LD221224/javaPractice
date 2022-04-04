import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.*;

public class CalendarExam{
    public String hundredDaysAfter(){
        //���ú��� 100�� ���� ��¥�� "2016��1��1��"�� �������� return�ϼ���.
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 100);
        int yyyy = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;      // ���� 0���� �����մϴ�.
        int date = cal.get(Calendar.DATE);
        int hour = cal.get(Calendar.HOUR_OF_DAY);     // �Ϸ縦 24�ð����� ǥ���� �ð�
        int minute = cal.get(Calendar.MINUTE);
        String str = yyyy + "��" + month + "��" + date + "��";
        return str;
    }
    public static void main(String[] args){
		Date date = new Date();
		System.out.println(date.toString());
		SimpleDateFormat ft =  new SimpleDateFormat ("yyyy.MM.dd 'at' hh:mm:ss a zzz");     
		System.out.println(ft.format(date));  
		
		CalendarExam calEx = new CalendarExam();
		System.out.println(calEx.hundredDaysAfter());
		 
		LocalDateTime timePoint = LocalDateTime.now(); // ������ ��¥�� �ð�
		LocalDate theDate = timePoint.toLocalDate();
		Month month = timePoint.getMonth();
		int day = timePoint.getDayOfMonth();
		int hour = timePoint.getHour();
		int minute = timePoint.getMinute();
		int second = timePoint.getSecond();
		// ���� ���ڷ� ����Ѵ� 1���� 1���� �����ϴ� ���� �� �� �ֽ��ϴ�. 
		System.out.println(month.getValue() + "/" + day + "  " + hour + ":" + minute + ":" + second);

    }
}