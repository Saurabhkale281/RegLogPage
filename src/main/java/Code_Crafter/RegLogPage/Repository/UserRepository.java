package Code_Crafter.RegLogPage.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import Code_Crafter.RegLogPage.Entity.userDetails;

public interface UserRepository extends JpaRepository<userDetails, Integer>{
	
	 Optional<userDetails> findByPassword(String password);
	 Optional<userDetails> findByEmailId(String emailId);
}
