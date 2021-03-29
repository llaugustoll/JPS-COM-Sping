package edu.curso;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PetController {
	
	@GetMapping("/pets")
	public String boasVindas() {
		return "welcome";	
	}
	
	@GetMapping("/lista")
	public String boasVindasComDados() {
//	public ModelAndView boasVindasComDados() {
//		ModelAndView mv = new ModelAndView("welcome");
//		mv.addObject("Cachorro","Totó");
//		mv.addObject("Hamister","Rex");
//		mv.addObject("Peixe","Dourado");
		return "lista";
	}
	
	

}
