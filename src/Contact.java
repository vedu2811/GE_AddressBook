public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String phoneNumber;
    private String email;
    private String zipcode;

    public Contact(String firstName, String lastName, String address, String city, String state, String phoneNumber, String email, String zipcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", pin=" + zipcode +
                '}';
    }
}
