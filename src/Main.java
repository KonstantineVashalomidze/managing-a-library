import java.util.Set;

public class Main {


    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("amiko");
        customer.setSurname("esadze");

        Customer customer1 = new Customer();
        customer1.setName("amiko");
        customer1.setSurname("esadze2");


        CustomerDatabase.getInstance().RegisterCustomer(customer);
        CustomerDatabase.getInstance().RegisterCustomer(customer1);
        System.out.println(CustomerDatabase.getInstance().searchCustomerByName("amiko"));





    }
}