
public class Main {


    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("amiko");
        customer.setSurname("esadze");

        Customer customer1 = new Customer();
        customer.setName("amiko");
        customer.setSurname("esadze2");


        CustomerDatabase.getInstance().RegisterCustomer(customer);
        CustomerDatabase.getInstance().RegisterCustomer(customer1);

        System.out.println(CustomerDatabase.getInstance().searchCustomerByName("amiko"));
        BookStorage.getInstance();

    }
}