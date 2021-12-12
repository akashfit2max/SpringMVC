package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("home page");
		model.addAttribute("name", "Ajay kumar sahoo");

		List<String> friends = new ArrayList<String>();
		friends.add("Ashihs");
		friends.add("ajay");
		friends.add("mamata");

		model.addAttribute("f", friends);
		System.out.println(friends);
		return "index";
	}

//	using model and view

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("using model and view");
//		creating object
		ModelAndView modelAndView = new ModelAndView();

//		setting data
		modelAndView.addObject("name", "naga");
		modelAndView.addObject("rollnum", 1234);

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		modelAndView.addObject("time", dateTime);
		
		List<String> fr = new ArrayList<String>();
		fr.add("Ashihs");
		fr.add("ajay");
		fr.add("mamata");

		modelAndView.addObject("frnds", fr);

//		seding data to view
		modelAndView.setViewName("help");

		return modelAndView;
		
		
		

	}
}
