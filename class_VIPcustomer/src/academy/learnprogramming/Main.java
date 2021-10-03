package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VipCustomer sal = new VipCustomer();
        VipCustomer sally = new VipCustomer("sally", 200000, "sally@email.com");
        VipCustomer bob = new VipCustomer("bob", 10000);
        System.out.println("Name: "+sal.getName()+" CreditLine: "+sal.getCreditLine()+" emalAddress: "+sal.getEmailAddress());
        System.out.println("Name: "+sally.getName()+" CreditLine: "+sally.getCreditLine()+" emalAddress: "+sally.getEmailAddress());
        System.out.println("Name: "+bob.getName()+" CreditLine: "+bob.getCreditLine()+" emalAddress: "+bob.getEmailAddress());

    }
}
