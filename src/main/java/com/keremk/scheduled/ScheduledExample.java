package com.keremk.scheduled;

import org.springframework.stereotype.Component;

@Component
public class ScheduledExample {
	
//	@Scheduled(cron="*/2 * * * * *")
	public void write1to10() {
		for(int i = 0;i<=10;i++) {
			System.out.print(i+" ");
			
		}
	}

}
