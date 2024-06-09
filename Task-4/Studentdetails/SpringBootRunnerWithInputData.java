package com.samples.appexample.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class SpringBootRunnerWithInputData implements CommandLineRunner {
	
	@Value("${my.info.student.id}")
	private int stdid;
	
	@Value("${my.info.student.sec}")
	private String stdsec;
	
	@Value("${my.info.student.cgpa}")
	private double stdcgpa;
	
	@Value("${my.info.student.backlogs}")
	private boolean isback;
	
	@Value("${my.info.student.surname}")
	private char stusur;
	
	//instead of setter getter methods
	//let us print using toString
	@Override
	public String toString() {
		return "SpringBootRunnerWithInputData [stdid=" + stdid + ",stdsec=" + stdsec + ",stdcgpa=" + stdcgpa + ",isback=" + isback + ",stusur=" + stusur + "]";
	}
	
	//override the run method
	public void run(String...args) throws Exception {
		System.out.println(this);
	}
	
	


}
