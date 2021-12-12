package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContackController {

	@RequestMapping("/contact")
	public String showcontact() {
		return "contact";
	}

}
