package POJO;

import java.util.List;

public class Courses {
	private List<Webautomation> webAutomation; // Create a list because it contains multiple elements
	private List<APIcourses> api; // Create a list because it contains multiple elements
	private List<Mobile> mobile; // Create a list because it contains multiple elements

	public List<Webautomation> getWebAutomation() {
		return webAutomation;
	}

	public void setWebAutomation(List<Webautomation> webAutomation) {
		this.webAutomation = webAutomation;
	}

	public List<APIcourses> getApi() {
		return api;
	}

	public void setApi(List<APIcourses> api) {
		this.api = api;
	}

	public List<Mobile> getMobile() {
		return mobile;
	}

	public void setMobile(List<Mobile> mobile) {
		this.mobile = mobile;
	}

}
