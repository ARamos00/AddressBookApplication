package address.data;

public class AddressEntry {

    /**
     * Declaration of firstName member variable.
     */
    private String firstName;
    /**
     * Declaration of lastName member variable.
     */
    private String lastName;
    /**
     * Declaration of street member variable.
     */
    private String street;
    /**
     * Declaration of city member variable.
     */
    private String city;
    /**
     * Declaration of state member variable.
     */
    private String state;
    /**
     * Declaration of zip member variable.
     */
    private Integer zip;
    /**
     * Declaration of phone member variable.
     */
    private String phone;
    /**
     * Declaration of email member variable.
     */
    private String email;


    /**
     * Default constructor for AddressEntry
     */
     public AddressEntry(){
        firstName = "";
        lastName = "";
        street = " ";
        city = " ";
        state = " ";
        zip = 0;
        phone = " ";
        email = " ";
    }

    /**
     * constructor for AddressEntry
     * @param firstName
     * @param lastName
     * @param street
     * @param city
     * @param state
     * @param zip
     * @param phone
     * @param email
     */
    public AddressEntry(String firstName,String lastName, String street, String city, String state, Integer zip, String phone, String email){
        //Initializing class variables.
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;

    }

    /**
     * toString returns information
     * @return information
     */
    @Override
    public String toString() {
        return "AddressEntry{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    /**
     * setter for FirstName
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * getter for firstName
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * setter for lastName
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * getter for lastName
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * setter for street
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * getter for street
     * @return street
     */
    public String getStreet() {
        return street;
    }

    /**
     * setter for city
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * getter for  city
     * @return  city
     */
    public String getCity() {
        return city;
    }

    /**
     * setter for state
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * getter for  state
     * @return  state
     */
    public String getState() {
        return state;
    }

    /**
     * setter for zip
     * @param zip
     */
    public void setZip(Integer zip) {
        this.zip = zip;
    }

    /**
     * getter for  zip
     * @return  zip
     */
    public Integer getZip() {
        return zip;
    }

    /**
     * setter for phone
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * getter for  phone
     * @return  phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * setter for email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * getter for  email
     * @return  email
     */
    public String getEmail() {
        return email;
    }



}
