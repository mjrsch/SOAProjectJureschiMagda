/**
 * 
 */
package service;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import model.Person;

/**
 * @author Magda
 *
 */
@Service
public class PersonMapper {

	private static final String ID = "id";
	private static final String NAME = "name";
	private static final String EMAIL = "email";
	private static final String ADDRESS = "address";
	private static final String STREET = "street";
	private static final String SUITE = "suite";
	private static final String CITY = "city" ;
	private static final String ZIPCODE = "zipcode";
	

	public Person convertFromJSONObjectToPersonObject(JSONObject object)
			throws NumberFormatException, JSONException {
		Person person = null;

		if (null != object) {
			String id= Integer.toString(object.getInt(ID));
			String name = object.getString(NAME);
			String email = object.getString(EMAIL);
			String street = object.getJSONObject(ADDRESS).getString(STREET);
			String suite = object.getJSONObject(ADDRESS).getString(SUITE);
			String city = object.getJSONObject(ADDRESS).getString(CITY);
			String zipcode= object.getJSONObject(ADDRESS).getString(ZIPCODE);
			person = new Person(id, name, email, street, suite, city, zipcode);
		}
		return person;
	}

}
