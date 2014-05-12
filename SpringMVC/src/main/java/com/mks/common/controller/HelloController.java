package com.mks.common.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mks.common.bean.RetryBean;

@Controller
public class HelloController {

	static int counter = 0;
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World by Siva");
		return "testB";

	}
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String testURL(ModelMap model) {
        List<String> projectList = new ArrayList<String>();
        projectList.add("RBGA");
        projectList.add("RBGA2");
        projectList.add("RBGA3");
        
        List<String> projectIssueList = new ArrayList<String>();
        projectIssueList.add("RBGAIS1");
        projectIssueList.add("RBGAIS2");
        projectIssueList.add("RBGAdsIS3");
        projectIssueList.add("RBGAIS2");
        projectIssueList.add("RBGAIS3");
        projectIssueList.add("RsdsdBGAIS2");
        projectIssueList.add("RBGAIS3");
        projectIssueList.add("RBGAIS2");
        projectIssueList.add("RBGAISs3");
        projectIssueList.add("RBGAIS2");
        projectIssueList.add("RBGAIS3");
        projectIssueList.add("RBGAIsdsS2");
        projectIssueList.add("RBGAIS3");
        projectIssueList.add("RBGAIS2");
        projectIssueList.add("RBGAIS3");
        projectIssueList.add("RBGAIS2");
        projectIssueList.add("RBGdsdAIS3");
        projectIssueList.add("RBGAIS2");
        projectIssueList.add("RBGAIS3");
		model.addAttribute("projects", projectList);
		model.addAttribute("projectIssues", projectIssueList);
		model.addAttribute("retryBean", new RetryBean());
		return "test";

	}
	
	@RequestMapping(value = "/selecttoretry/{project}", method = RequestMethod.GET)
	@ResponseBody
	public RetryBean getDeviceDataJSON(@PathVariable("project") String project) {
		String[] issues = new String[3];
		issues[0] = "sdfdfd";
		issues[1] = "wqewqe";
		issues[2] = "wedsff";
		RetryBean retryBean = new RetryBean();
		retryBean.setProjectKey(project);
		retryBean.setIssuesList(issues);
		return retryBean;
	}
	
	/*
	List<String> projectList = new ArrayList<String>();
    projectList.add("RBGA");
    projectList.add("RBGA2");
    projectList.add("RBGA3");
    
    List<String> projectIssueList = new ArrayList<String>();
    if(projectkey.equals("RBGA2")){
    	 projectIssueList.add("HHSH" + projectkey);
         projectIssueList.add("WWEW");
         projectIssueList.add("QQWQ");
    }else{
    projectIssueList.add("RBGAIS1" + projectkey);
    projectIssueList.add("RBGAIS2");
    projectIssueList.add("RBGAIS3");    
    }
	model.addAttribute("projects", projectList);
	model.addAttribute("projectIssues", projectIssueList);
	*/ 
	
	@RequestMapping(value = "/selecttoretry",method = RequestMethod.GET)
	 public @ResponseBody RetryBean selectToRetry(ModelMap model,@RequestParam("project") String projectkey) {			
		String[] issues = new String[3];
		issues[0] = "sdfdfd";
		issues[1] = "wqewqe";
		issues[2] = "wedsff";
		RetryBean retryBean = new RetryBean();
		retryBean.setProjectKey(projectkey);
		retryBean.setIssuesList(issues);
      return retryBean; 
  }
	
	@RequestMapping(value = "/doretry", method = RequestMethod.POST)
	@ResponseBody
	public String retryPDF(@ModelAttribute RetryBean retryBean){	
		counter++;
		//RetryBean retryBean = (RetryBean)model.get("retryBean");
		String percentage = counter + "0";
		
		return percentage;
	}
}