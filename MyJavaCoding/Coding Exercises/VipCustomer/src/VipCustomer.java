public class VipCustomer {
    private String name;
    private String creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default name", "5555", "default@email.com")
    }

    public VipCustomer(String name, String creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, String creditLimit) {
        this(name, creditLimit, "unknown");
    }

    public String getName() {
        return name;
    }
    public String getCreditLimit() {
        return creditLimit;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
}
