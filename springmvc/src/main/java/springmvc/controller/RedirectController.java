package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

//	@RequestMapping("/one")
//	public String one() {
//		System.out.println("first");
//		return "redirect:two";
//	}

	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("first");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("two");
//		redirectView.setUrl("https://www.google.co.in/webhp");
		return redirectView;
	}

	@RequestMapping("/two")
	public String two() {
		System.out.println("second handler");
		return "contact";
	}
}
