package uwu.restfulservicespring5.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uwu.restfulservicespring5.demo.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
