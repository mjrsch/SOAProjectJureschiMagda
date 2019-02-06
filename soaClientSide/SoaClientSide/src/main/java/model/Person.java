/**
 * 
 */
package model;

/**
 * @author Magda
 *
 */
public class Person {
	
	private String id;
	private String name;
	private String email;
	private String street;
	private String suite;
	private String city;
	private String zipcode;
	
	/**
	 * Default constructor
	 */
	public Person() {}
	
	/**
	 * Constructor with args
	 * @param id
	 * the id
	 * @param name
	 * the name of the person
	 * @param email
	 * the email of the person
	 * @param street
	 * the street name
	 * @param suite
	 * the suite
	 * @param city
	 * the city name
	 * @param zipcode
	 * the zipcode
	 */
	public Person(String id, String name, String email, String street, String suite, String city, String zipcode) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.street = street;
		this.suite = suite;
		this.city = city;
		this.zipcode = zipcode;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the suite
	 */
	public String getSuite() {
		return suite;
	}

	/**
	 * @param suite the suite to set
	 */
	public void setSuite(String suite) {
		this.suite = suite;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}


}
