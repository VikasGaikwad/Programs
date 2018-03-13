/**
 * 
 */
package com.bridgeit.dto;

import com.bridgeit.interfce.MessagingInterface;

/**
 * @author vikas gaikwad
 *
 */
public class CommunicationBean {
	private MessagingInterface messaging;

	public void setMessaging(MessagingInterface messaging) {
		this.messaging = messaging;
	}
	public void communicate() {
		
		
		
		messaging.sendMessage();
	}

}
