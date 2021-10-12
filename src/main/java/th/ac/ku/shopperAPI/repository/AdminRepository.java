package th.ac.ku.shopperAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ac.ku.shopperAPI.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
}                                           //<Type Of Data, Type Primary Key>


