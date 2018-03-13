package com.bridgeit.dto;

import com.bridgeit.intrface.Encryption;

public class SampleBean {
	//the sample bean has dependancy on Encryption
	private Encryption encryption;

	
	public SampleBean(Encryption encryption) {
		
		this.encryption = encryption;
	}


	public void communicate() {
		encryption.encryptData();
	}

}
