package com.seleniumExpress.SessionAttribute.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebSiteInfoIninitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr[] = { WebSiteInfoConfig.class };
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String str[] = { "/" };
		return str;
	}

}
