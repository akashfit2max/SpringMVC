package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContackController {

	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonData(Model model) {
		model.addAttribute("title", "learCodeWith Akash");
		model.addAttribute("desc", "welcome to the page");
	}

	@RequestMapping("/cont")
	public String showContact() {
		System.out.println("contact page");
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String printConctact(@ModelAttribute User user, Model m) {
		System.out.println(user);
		if (user.getUserName().isBlank()) {
			return "redirect:/cont";
		}
		int createUser = this.userService.createUser(user);
		m.addAttribute("msg", "user create with id = " + createUser);
		return "newpage";
	}

//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String printConctact(@RequestParam("emial") String userMail, @RequestParam("userName") String usrName,
//			@RequestParam("userPassword") String usrPassword, Model model) {
//
//		System.out.println("email " + userMail);
//		System.out.println("name " + usrName);
//		System.out.println("password " + usrPassword);
//
//		User user = new User(userMail, usrName, usrPassword);
//		System.out.println(user);
//
//		model.addAttribute("mail", userMail);
//		model.addAttribute("name", usrName);
//		model.addAttribute("pswd", usrPassword);
//
//		model.addAttribute("user", user);
//
//		return "newpage";
//	}

}
