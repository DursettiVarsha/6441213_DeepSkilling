import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, Customer> customerData = new HashMap<>();

    public CustomerRepositoryImpl() {
        // Mock database
        customerData.put("C001", new Customer("C001", "Ajay", "ajay@example.com"));
        customerData.put("C002", new Customer("C002", "Vijay", "vijj@example.com"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return customerData.get(id);
    }
}
