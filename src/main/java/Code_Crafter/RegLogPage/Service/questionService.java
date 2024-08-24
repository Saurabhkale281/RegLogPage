package Code_Crafter.RegLogPage.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Code_Crafter.RegLogPage.Entity.questionEntity;
import Code_Crafter.RegLogPage.Repository.questionRepository;
@Service
public class questionService {
	
	@Autowired
	private questionRepository questionRepo;
	
	public questionEntity addQuestion(questionEntity questions) {
        return questionRepo.save(questions);
    }

	 public List<questionEntity> getQuestionsByTechnologyAndProficiencyLevel(String technology, String proficiencyLevel) {
	        return questionRepo.findByTechnologyAndProficiencyLevel(technology, proficiencyLevel);
	    }
}
