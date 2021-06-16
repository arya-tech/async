package com.asy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asy.service.NotificationService;

@RestController
@RequestMapping("/notify")
public class NotificationController {
	
	@Autowired
	private NotificationService notificationService;
	
	@GetMapping(value = "/send/{mobileNo}")
	public String sendNotification(@PathVariable("mobileNo")String mobileNo) {
		notificationService.sendMsg(mobileNo);
		String msg="message send successfully to "+mobileNo+" controller thread name= "+Thread.currentThread().getName();
		return msg;
	}

}
