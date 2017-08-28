package com.wiselong.cos.booking.order;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JSMTest {

	public static void main(String[] args) {
		
		 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 try{
		 long timeStart=sdf.parse("2016-08-24 01:22:00").getTime();
		 System.out.println(timeStart);
		 Date date = new Date(timeStart);
		 long time1=(long) 1471972920000.0;
		 				   
		 System.out.println("time1:"+sdf.format(time1));
		 }catch(Exception e){
			 System.out.println(e);
		 }
	}

}
