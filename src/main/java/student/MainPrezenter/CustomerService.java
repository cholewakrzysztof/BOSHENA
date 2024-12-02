package student.MainPrezenter;

import student.CustomerModel;
import student.ICustomerClient;
import student.ICustomerModel;

public class CustomerService implements ICustomerClient {
    @Override
    public ICustomerModel GetCustomer(int customerId) {
        System.out.println("Get customer success");
        return new CustomerModel();
    }
}