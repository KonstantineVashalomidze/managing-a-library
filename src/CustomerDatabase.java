import java.util.HashSet;
import java.util.Set;

public class CustomerDatabase {
    // set of customers registered
    private Set<Customer> customers;

    // create singleton instance of CustomerDatabase
    private static CustomerDatabase customerDatabaseInstance;

    // customer database constructor
    private CustomerDatabase(){
        this.customers = new HashSet<>();
    }

    // register customer
    public void RegisterCustomer(Customer customer){
        this.customers.add(customer);
    }

    // unregister customer
    public void UnregisterCustomer(Customer customer){
        this.customers.remove(customer);
    }

    // search customer by name
    public Set<Customer> searchCustomerByName(String name){
        Set<Customer> customersWithSameName = new HashSet<>();
        for(Customer customer : this.customers){
            String rame = customer.getName();
            if (name.equals(rame)){
                customersWithSameName.add(customer);
            }
        }
        return customersWithSameName;
    }

    // search customer by surname
    public Set<Customer> searchCustomerBySurname(String name){
        Set<Customer> customersWithSameSurname = new HashSet<>();
        for(Customer customer : this.customers){
            if (name.equals(customer.getSurname())){
                customersWithSameSurname.add(customer);
            }
        }
        return customersWithSameSurname;
    }

    // get single instance of CustomerDatabase
    public static CustomerDatabase getInstance(){
        if (customerDatabaseInstance == null){
            customerDatabaseInstance = new CustomerDatabase();
        }
        return customerDatabaseInstance;
    }

}
