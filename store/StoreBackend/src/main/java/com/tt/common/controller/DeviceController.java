package com.tt.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tt.common.model.Device;

@Controller
@RequestMapping("device/status")
public class DeviceController {
	
	@RequestMapping(value = "{deviceid}", method = RequestMethod.GET)
	public @ResponseBody 	
	Device getDeviceDataJSON(@PathVariable String deviceid) {
		Device device = new Device();
		device.setDeviceid(deviceid);
		device.setDeviceInfo(new String[] {"STATUS:ON","RUNNINGSINCE:36HRS","CONSUMPTION:300KW"});
		return device;
	}

}
