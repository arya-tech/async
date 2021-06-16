package com.asy.service;

import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
	
	
	@Async
	public void sendMsg(String mobileNo) {
		sleep(10);
		System.out.println("Notification send to :-"+mobileNo+"  thread name= "+Thread.currentThread().getName());
		
	}
	
	private void sleep(int args) {
		try {
			TimeUnit.SECONDS.sleep(args);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
