/**
 * 
 */
package controller;

import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import service.PersonService;
import model.Person;

/**
 * @author Magda
 *
 */

@CrossOrigin
@RestController
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	PersonService personService;

	/**
	 * Gets all the stored persons
	 * 
	 * @return a list containing all the stored persons
	 * @throws JSONException 
	 * @throws IOException 
	 */
	@RequestMapping("/all")
	public ArrayList<Person> getAll() throws IOException, JSONException {
		return personService.getAll();
	}

	/**
	 * Returns the corresponding entity for the given id
	 * 
	 * @param id
	 *            the given id
	 * @return the corresponding entity
	 */
	@RequestMapping("{id}")
	public Person getPerson(@PathVariable("id") String id) {
		return personService.getPersonById(id);
	}

	/**
	 * Gets all the provided data from the api
	 * 
	 * @return a list containing all the provided persons by the api
	 * @throws IOException
	 * @throws JSONException
	 */
	@RequestMapping("/allServer")
	public ArrayList<Person> getAllFromSrv() throws IOException, JSONException {
		return personService.getAllFromServer();
	}
	
	/**
	 * Adds a new person
	 * @param person
	 * the new person to be added
	 * @return
	 * the newly added person if successful, new empty Person object otherwise
	 */
	@RequestMapping(method=RequestMethod.POST, consumes="application/json", produces="application/json")
	public Person addPerson(@RequestBody Person person){
		Person p=new Person();
		if(person!=null){
			p= personService.addPerson(person);
		}
		return p;
	}

}
