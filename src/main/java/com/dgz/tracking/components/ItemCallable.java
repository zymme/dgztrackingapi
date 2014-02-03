package com.dgz.tracking.components;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;
import org.springframework.stereotype.Component;

import com.dgz.tracking.dto.Item;

@Component
public class ItemCallable implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		
		
		MuleMessage message = eventContext.getMessage();
		
		Item item = (Item) message.getPayload();
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime()));
		
		String currentTime = dateFormat.format(cal.getTime());
		item.setCreateDateTime(currentTime);
		message.setPayload(item);
		
		return message;
	}

}
