package Code_Crafter.RegLogPage.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Code_Crafter.RegLogPage.Entity.questionEntity;

public interface questionRepository extends JpaRepository<questionEntity, Long>{
    List<questionEntity> findByTechnologyAndProficiencyLevel(String technology, String proficiencyLevel);

}
