package th.ac.ku.shopperAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.shopperAPI.model.CustomerOrdered;

@Repository
public interface CustomerOrderedRepository extends JpaRepository<CustomerOrdered, String> {
}


