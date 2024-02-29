public class Contact {
    //Create contact class attributes
    private String contactId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    // Constructor for initializing objects
    public Contact(String contactId, String firstName, String lastName, String phone, String address){
        // Create Null and String length conditions
        if (contactId == null || contactId.length() > 10) {
            throw new IllegalArgumentException("Invalid Contact Id");
        }
        // set objects after conditions passed
        this.contactId = contactId;
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setAddress(address);
    }

    // Establish setters and getters
    public String getContactId(){
        return contactId;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        if (firstName == null || firstName.length() > 10){
            throw new IllegalArgumentException("Invalid First Name");
        }
        this.firstName = firstName;
    }
    public String getLastName(){
        return  lastName;
    }
    public void setLastName(String lastName){
        if (lastName == null || lastName.length() > 10){
            throw new IllegalArgumentException("Invalid Last Name");
        }
        this.lastName = lastName;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        if (phone == null || phone.length() != 10){
            throw new IllegalArgumentException("Invalid Phone Number");
        }
        for (int i = 0; i < phone.length(); i++){
            if (!Character.isDigit(phone.charAt(i))) {
                throw new IllegalArgumentException("Invalid phone number");
            }
        }

        this.phone = phone;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        if (address == null || address.length() > 30){
            throw new IllegalArgumentException("Invalid Address");
        }
        this.address = address;
    }
}
