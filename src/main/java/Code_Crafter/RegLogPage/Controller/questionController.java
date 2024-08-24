package Code_Crafter.RegLogPage.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Code_Crafter.RegLogPage.Entity.questionEntity;
import Code_Crafter.RegLogPage.Service.questionService;

@RestController
@RequestMapping("/api/questions")
public class questionController {
	
	@Autowired
    private questionService questionservice;

	@PostMapping("/add")
    public ResponseEntity<questionEntity> addQuestion(@RequestBody questionEntity questions) {
    	questionEntity savedQuestion = questionservice.addQuestion(questions);
        return ResponseEntity.ok(savedQuestion);
    }
   
    @GetMapping("/by-criteria")
    public ResponseEntity<List<questionEntity>> getQuestionsByCriteria(
        @RequestParam String technology,
        @RequestParam String proficiencyLevel) {
        List<questionEntity> questions = questionservice.getQuestionsByTechnologyAndProficiencyLevel(technology, proficiencyLevel);
        return ResponseEntity.ok(questions);
    }
}
