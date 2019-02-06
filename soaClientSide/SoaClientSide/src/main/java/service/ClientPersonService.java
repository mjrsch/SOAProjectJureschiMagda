/**
 * 
 */
package service;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import model.Person;

/**
 * @author Magda
 *
 */

/*
@CrossOrigin
@RestController
@RequestMapping("/persons")
*/
public class ClientPersonService {
	
	
	private static final String URL="http://localhost:8080/persons/all";
	private RestTemplate rest = new RestTemplate();

	/**
	 * Gets all the stored persons
	 * 
	 * @return a list containing all the stored persons
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/all")
	public ArrayList<Person> getAll() {
		System.out.println("Calling serverSide...");
		return rest.getForObject(URL, ArrayList.class);
	}
	
	/**
	 * Add new person
	 * @param person
	 * the new person to be added
	 * @return
	 * the newly added person
	 */
	public Person addPerson(Person person){
		return rest.postForObject(URL,person, Person.class);
	}

	
}
