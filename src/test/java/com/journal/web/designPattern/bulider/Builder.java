package com.journal.web.designPattern.bulider;

import java.util.ArrayList;
import java.util.List;

public class Builder {

	public List<Sender> senders = new ArrayList<Sender>();
	
	public void produceMailSender(int count){
		for (int i = 0; i < count; i++) {
			senders.add(new MailSender());
		}
	}
	public void produceSmsSender(int count){
		for (int i = 0; i < count; i++) {
			senders.add(new SmsSender());
		}
	}
	
	public List<Sender> getSenders(){
		return this.senders;
	}
}
