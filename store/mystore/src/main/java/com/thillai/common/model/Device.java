/**
 * 
 */
package com.thillai.common.model;

/**
 * @author ski8cob
 *
 */
public class Device {

	String deviceid;
	String deviceInfo[];
	
	public Device(){
		
	}

	public String getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}

	public String[] getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(String[] deviceInfo) {
		this.deviceInfo = deviceInfo;
	}
	
}
