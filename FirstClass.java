

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class FirstClass {
	
	private static Date lastDataUpdate;

	public static void main(String args[]) {
		Calendar calendar = Calendar.getInstance();
	     calendar.setTime(new Date());
	     calendar.add(Calendar.SECOND, 40/2);
	     System.out.println("calendar " +calendar.getTime().getTime());
	     
	     String s=" ";
	     System.out.println("s is "+s.trim().isEmpty());
	     
	     Date today = new Date();
	  //   Date scheduled =new Date(2022,06,02);
	//     boolean a = scheduled.before(today);
	     long ls=1654584514768L;
	 //    long ltodays=1654273353805L;
	     
	     long lsday=1654584514768L;
	   //  System.out.println("Converted date from long value is "+new Date (lsday));
	     
	   
	     
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DAY_OF_YEAR, 0);
			System.out.println("cal.getTime() "+cal.getTime());
		//	lastDataUpdate=cal.getTime();;1654582546735L
			lastDataUpdate=new Date(1654747349969L);
			System.out.println("lastDataUpdate before === "+lastDataUpdate);
			if (lastDataUpdate == null || lastDataUpdate.before(cal.getTime())) {
				lastDataUpdate = new Date();
			}
			System.out.println(" lastDataUpdate after === "+lastDataUpdate);
			
			
			 Timestamp ts = new Timestamp(1654747349969L);
             String time = new SimpleDateFormat("MM/dd/yyyy hh:mm a").format(ts);
             System.out.println(" lastDataUpdate after SDF format === "+ts);

	 //    System.out.println(" Valid schedule "+ (ltodays-ls));
	     
	//     DateTime time = DateTime.UtcNow.ToTimeZoneTime("Pacific Standard Time");
	     
			Instant instant = Instant.now();
			System.out.println(instant.toString());
	     
	}
	

	
	
	
	
	

	/// Returns TimeZone adjusted time for a given from a Utc or local time.
	/// Date is first converted to UTC then adjusted.
/*
	public static DateTime ToTimeZoneTime(DateTime time, string timeZoneId = "Pacific Standard Time")
	{
	    TimeZoneInfo tzi = TimeZoneInfo.FindSystemTimeZoneById(timeZoneId);
	    return time.ToTimeZoneTime(tzi);
	}


	/// Returns TimeZone adjusted time for a given from a Utc or local time.
	/// Date is first converted to UTC then adjusted.
	
	public static DateTime ToTimeZoneTime(DateTime time, TimeZoneInfo tzi)
	{
	    return TimeZoneInfo.ConvertTimeFromUtc(time, tzi);
	}
	
	
	DateTime time = DateTime.UtcNow.ToTimeZoneTime("Pacific Standard Time");
	var tz = TimeZoneInfo.FindSystemTimeZoneById("Pacific Standard Time");
	DateTime time2 = DateTime.UtcNow.ToTimeZoneTime(tz);
	
*/
}
