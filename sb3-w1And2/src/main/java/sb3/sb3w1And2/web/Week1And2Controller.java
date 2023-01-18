package sb3.sb3w1And2.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Week1And2Controller {
	
	//Week 1 tehtävä 1
	@RequestMapping("index")
	@ResponseBody
	public String returnIndexPage() {
		return "This is index page!";
	}
	
	//Week 1 tehtävä 1	
	@RequestMapping("contact")
	@ResponseBody
	public String returnContactPage() {
		return "This is contact page!";
	}
	
	//Week 1 tehtävä 2
	@RequestMapping("hello")
	@ResponseBody
	public String returnHelloPage(@RequestParam(name="nimesi", required=false, defaultValue="Muumi") String name
			, @RequestParam(name="ika", required=false, defaultValue="100") int age) {
		return "Heippa " + name + ", " + age + " vuotta!";
	}
	
	@RequestMapping("/hello2")
	public String welcomeMessage(@RequestParam("name") String name, @RequestParam("age") int age, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "welcome";
	}
}
