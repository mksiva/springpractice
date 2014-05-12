package com.thillai.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.thillai.common.model.Device;

@Controller
@RequestMapping("main")
public class StoreController {
	
	@RequestMapping(value = "/status/{deviceid}", method = RequestMethod.GET)
	public @ResponseBody 	
	Device getStatus(@PathVariable String deviceid) {
		Device device = new Device();
		device.setDeviceid(deviceid);
		device.setDeviceInfo(new String[] {"STATUS:ON","RUNNINGSINCE:36HRS","CONSUMPTION:300KW"});
		return device;
	}
	@RequestMapping(value = "/go", method = RequestMethod.GET)
	public String showLogin() {
	    String loginUrl = "http://localhost:9090/storebackend/rest/loginme";	    
	    RestTemplate restTemplate = new RestTemplate();
		return "login";
	}
	
	   @RequestMapping(value = "/login", method = RequestMethod.POST)
	   public String enterToSystem(@RequestParam("username") String username,
	        @RequestParam("password") String password, ModelMap modelMap) {
	        //String loginUrl = "http://localhost:9090/storebackend/rest/loginme";        
	        //RestTemplate restTemplate = new RestTemplate();
	       // restTemplate.p
	       if(!username.isEmpty() && !password.isEmpty() && username.equals("admin") && password.equals("admin")){
	            return "index";
	        }
	       modelMap.addAttribute("loginMsg", "Login failure! Please try again.");
	        return "login";
	    }

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String testURL(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World by Siva");
		return "welcome";

	}
}
