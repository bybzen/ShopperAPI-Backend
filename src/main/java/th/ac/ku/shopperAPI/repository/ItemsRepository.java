package th.ac.ku.shopperAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import th.ac.ku.shopperAPI.model.Items;

import java.util.UUID;

public interface ItemsRepository extends JpaRepository <Items,UUID>{
}
