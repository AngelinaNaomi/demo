package uwu.restfulservicespring5.demo.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uwu.restfulservicespring5.demo.domain.Customer;
import uwu.restfulservicespring5.demo.repositories.CustomerRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    @Autowired
    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Customer c1 = Customer.builder()
                .firstName("Heinrich")
                .lastName("Muller")
                .build();
        customerRepository.save(c1);

        Customer c2 = Customer.builder()
                .firstName("Friedrich")
                .lastName("Huber")
                .build();
        customerRepository.save(c2);

        Customer c3 = Customer.builder()
                .firstName("Caspin")
                .lastName("Victoire")
                .build();
        customerRepository.save(c3);

        System.out.println("Number of Customers :" + customerRepository.count());
    }
}
