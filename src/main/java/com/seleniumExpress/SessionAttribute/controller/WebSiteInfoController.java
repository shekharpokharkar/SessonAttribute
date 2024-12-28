package com.seleniumExpress.SessionAttribute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.seleniumExpress.SessionAttribute.DTO.WebSiteInfoDTO;

@Controller
@ControllerAdvice(basePackages = "com")
@SessionAttributes("WEBSITE")
public class WebSiteInfoController {
	/*
	 * Using @ModelAttribute Annottaion this method get exicuted first and the
	 * object return by method is available to all method
	 */
	@ModelAttribute("WEBSITE")
	public WebSiteInfoDTO showInfo(Model model) {
		System.out.println("******+++++++++++++++++++++*****");
		System.out.println("inside WebsiteInfoDTO");
		WebSiteInfoDTO dto = new WebSiteInfoDTO();
		dto.setWebSiteName("SeleniumExpress");
		dto.setWebDomain("Education");
		System.out.println("*******+++++++++++++++++++*******");
		return dto;

	}

	@RequestMapping("/show1")
	public String showInfoProcess(@ModelAttribute("WEBSITE") WebSiteInfoDTO dto) {
		/*
		 * public String showInfoProcess(Model model) {@ModelAttribute("WEBSITE")
		 * WebSiteInfoDTO dto
		 */
		System.out.println("Inside showInfoProcess");

		String name = dto.getWebSiteName() + ".com";
		System.out.println("name:" + name);
		dto.setWebSiteName(name);
		System.out.println(dto);
		return "Info";
	}

	@RequestMapping("/WithoutModelAttribute2")
	public String showInfoDetail1(@ModelAttribute("WEBSITE") WebSiteInfoDTO dto) {
		/* public String showInfoDetail1(Model model) { */
		System.out.println("++++++++++++++++++");

		System.out.println("showInfoDetail WithoutModelAttribute2");
		System.out.println("++++++++++++++++++");

		return "Info";
	}

	@RequestMapping("/WithModelAttribute2")
	public String showInfoDetail(@ModelAttribute("WEBSITE") WebSiteInfoDTO dto) {
		System.out.println("==================");

		String webDomain = dto.getWebDomain();
		String webSiteName = dto.getWebSiteName();
		System.out.println("SiteName" + webSiteName);
		System.out.println("webDomain" + webDomain);
		System.out.println("==================");
		return "Info";
	}

}
