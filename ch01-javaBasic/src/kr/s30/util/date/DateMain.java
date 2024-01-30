package kr.s30.util.date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateMain {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.toString());
		//toString이 Object에 있는거니까 Date에서 재정의를 한거
		System.out.println("-----------------");
		
		//deprecated 되어 사용하지 않음
		System.out.println(now.toLocaleString());
		System.out.println("-----------------");
		DateFormat df = DateFormat.getInstance();
		String today=df.format(now);
		System.out.println(today);
		System.out.println("-----------------");
		
		df=DateFormat.getDateTimeInstance();
		today=df.format(now);
		System.out.println(today);
		System.out.println("-----------------");
		
		df=DateFormat.getDateInstance();
		today=df.format(now);
		System.out.println(today);
		System.out.println("-----------------");
		
		df=DateFormat.getTimeInstance();
		today=df.format(now);
		System.out.println(today);
		System.out.println("-----------------");
		
		SimpleDateFormat sf=new SimpleDateFormat("yyyy년MM월dd일 (E) a hh:mm:ss");
		today = sf.format(now);
		System.out.println(today);
	}
}
