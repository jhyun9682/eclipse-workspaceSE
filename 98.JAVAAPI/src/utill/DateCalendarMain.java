package utill;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCalendarMain {

	public static void main(String[] args) throws Exception {
		/*
		 * java.utill.Date
		 * - The class Date represents a specific instant in time, with millisecond precision.
		 */
		Date now=new Date();
		/*
		 * real os의 현재시간을 가짐
		 */
		String nowString=now.toString();
		System.out.println(nowString);
		String kornowString=now.toLocaleString();
		System.out.println(kornowString);
		System.out.println("--시간저장형식--");
		long currentTimeMillis1=now.getTime();
		System.out.println(currentTimeMillis1);
		/*
		 * Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT
		 represented by this date 
		 */
		long currentTimeMillis2= new Date().getTime();
		System.out.println(currentTimeMillis2);
		long duration=currentTimeMillis2-currentTimeMillis1;
		System.out.println(duration+"ms took.. ");
		
		System.out.println("-------SimpleDateFormat [Date->String]------");
		/*
		 * SimpleDateFormat : Data객체의 시간을 문자열로 변경해주는 클래스
		 */
		Date today=new Date();
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy 년 MM 월 dd 일");
		String formatStr1=sdf1.format(today);
		System.out.println(formatStr1);
		
		sdf1.applyPattern("yyyy/MM/dd HH:mm:ss.SSSS");
		String formatStr2=sdf1.format(today);
		System.out.println(formatStr2);
		
		sdf1.applyPattern("yyyy");
		String yearStr=sdf1.format(today);
		System.out.println(yearStr);
		
		System.out.println("-------SimpleDateFormat [String->Date]------");
		SimpleDateFormat sdf2=new SimpleDateFormat();
		sdf2.applyPattern("yyyy-MM-dd");
		Date myBirthDay=sdf2.parse("2000-06-12");
		System.out.println(myBirthDay.toString());
		System.out.println("myBirthDay:"+myBirthDay.getTime());
		
		sdf2.applyPattern("yyyy/MM/dd HH:mm:ss");
		Date yourBirthDay=sdf2.parse("2000/03/03 04:24:19");
		System.out.println(yourBirthDay.toString());
		System.out.println("yourBirthday:"+yourBirthDay.getTime());
		
		System.out.println("-----Date객체메소드-----");
		Date date1=new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-10");
		Date date2=new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-10");
		Date date3=new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-11");
		
		
		
		
		
		
	}

}
