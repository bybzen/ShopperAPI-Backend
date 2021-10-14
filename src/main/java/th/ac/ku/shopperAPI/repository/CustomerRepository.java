package th.ac.ku.shopperAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.shopperAPI.model.Customer;

import java.util.UUID;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
