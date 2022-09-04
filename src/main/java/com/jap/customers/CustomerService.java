package com.jap.customers;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomerService {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(1101,"Tara","Female",true,"Austin"));
        customerList.add(new Customer(5242,"Sam","Male",false,"Denver"));
        customerList.add(new Customer(8965,"Abbie","Female",false,"Chicago"));
        customerList.add(new Customer(3354,"Michelle","Female",false,"Portland"));
        customerList.add(new Customer(2212,"Mary","Female",true,"New Orleans"));
        customerList.add(new Customer(4542,"John","Male",false,"Seattle"));
        customerList.add(new Customer(1119,"Trevor","Male",false,"Boston"));

    }

    // This method will return the names of the customers in sorted alphabetical order.
public List<String> getListOfCustomersSortedByName(List<Customer> customerList) {
    List<String> list = new ArrayList<>();
    Collections.sort(customerList);
    Iterator<Customer> iterator = customerList.iterator();
    while (iterator.hasNext()) {
        list.add(iterator.next().getCustomerName());
    }
    return list;

}



}
