package com.seleniumExpress.SessionAttribute.DTO;

public class WebSiteInfoDTO {

	private String webSiteName;
	private String webDomain;

	public WebSiteInfoDTO() {
		System.out.println("++++++Inside ebSite Constructor+++++");
	}

	public String getWebSiteName() {
		return webSiteName;
	}

	public void setWebSiteName(String webSiteName) {
		this.webSiteName = webSiteName;
	}

	public String getWebDomain() {
		return webDomain;
	}

	public void setWebDomain(String webDomain) {
		this.webDomain = webDomain;
	}

	@Override
	public String toString() {
		return "WebSiteInfoDTO [webSiteName=" + webSiteName + ", webDomain=" + webDomain + "]";
	}

}
