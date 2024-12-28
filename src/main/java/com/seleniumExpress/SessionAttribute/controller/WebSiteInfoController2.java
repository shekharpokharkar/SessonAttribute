package com.seleniumExpress.SessionAttribute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumExpress.SessionAttribute.DTO.WebSiteInfoDTO;

@Controller
public class WebSiteInfoController2 {

	@RequestMapping("/show2")
	public String showInfoProcess2(Model model) {

		System.out.println("Inside showInfoProcess2");
		WebSiteInfoDTO dto = (WebSiteInfoDTO) model.getAttribute("WEBSITE");
		String name = dto.getWebSiteName() + ".com";
		System.out.println("name:" + name);
		dto.setWebSiteName(name);
		System.out.println(dto);
		return "Info";
	}

	@RequestMapping("/show3")
	public String showInfoDetail2(Model model) {
		System.out.println("showInfoDetail");
		return "Info";
	}

}
