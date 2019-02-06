/**
 * 
 */
package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Person;
import service.ClientPersonService;

/**
 * @author Magda
 *
 */

@Controller
public class ClientPersonController {
	
	
	private ClientPersonService personService = new ClientPersonService();
	
	 @RequestMapping("/")
	public String getData(Model model) {
		List<Person> list = personService.getAll();
		model.addAttribute("list", list);
		return "welcome";
	}
	 
	 @RequestMapping(value = "/", method = RequestMethod.POST)
		public String addCompetition(Model model,  Person person) {
		 	personService.addPerson(person);
			List<Person> list = personService.getAll();
			model.addAttribute("list", list);
			return "welcome";
		}


}