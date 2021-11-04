package th.ac.ku.shopperAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.shopperAPI.model.CheckOutOrder;

@Repository
public interface CheckOutOrderRepository extends JpaRepository<CheckOutOrder, String> {
}


