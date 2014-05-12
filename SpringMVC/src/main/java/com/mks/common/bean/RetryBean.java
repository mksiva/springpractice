/**
 * 
 */
package com.mks.common.bean;

import java.util.List;

import org.codehaus.jackson.annotate.JsonAutoDetect;


/**
 * @author ski8cob
 * <!-- WORKONARCHIV-393 -->
 */
@JsonAutoDetect
public class RetryBean {
	
	String projectKey;
	
	String[] issuesList;

	
	public String getProjectKey() {
		return projectKey;
	}

	public void setProjectKey(String projectKey) {
		this.projectKey = projectKey;
	}


	public String[] getIssuesList() {
		return issuesList;
	}

	public void setIssuesList(String[] issuesList) {
		this.issuesList = issuesList;
	}
	
    
}
