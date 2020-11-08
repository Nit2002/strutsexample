package com.strutsP07ExecAndWaitInterceptor.model;

import java.util.Calendar;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LongProcess extends ActionSupport {

	private int pTime;
	private String processingTime;

	public String getProcessingTime() {
		return processingTime;
	}

	public void setProcessingTime(String processingTime) {
		this.processingTime = processingTime;
	}

	public int getpTime() {
		return pTime;
	}

	public void setpTime(int pTime) {
		this.pTime = pTime;
	}
	
	public String execute() {
		Calendar calendar = Calendar.getInstance();
		Date startTime = calendar.getTime();
		process();
		calendar = Calendar.getInstance();
		Date endTime = calendar.getTime();
		long totalTime = endTime.getTime() - startTime.getTime();
		long sec = totalTime /  1000 % 60;
		long min = totalTime / ( 60 * 1000 ) % 60;
		long hrs = totalTime / ( 60 * 60 * 1000 ) % 60;
		System.out.println( hrs +" hrs "+ min + " min "+sec+" sec");
		setProcessingTime( hrs +" hrs "+ min + " min "+sec+" sec");
		return SUCCESS;
	}
	
	public void process() {
		System.out.println("Time to process :"+pTime);
		for(int i =0; i<1000000; i++){
			System.out.println(i);
		}
	}
}
