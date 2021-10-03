package academy.learnprogramming;

public class VipCustomer {
    private String name;
    private int creditLine;
    private String emailAddress;

    public VipCustomer(String name, int creditLine, String emailAddress) {
        this.name = name;
        this.creditLine = creditLine;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(){
        this("XYZ", 0000,"xyz@email.com");
    }

    public VipCustomer(String name, int creditLine) {
        this(name,creditLine,"xyz@gemail.com");
    }

    public String getName() {
        return name;
    }

    public int getCreditLine() {
        return creditLine;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
