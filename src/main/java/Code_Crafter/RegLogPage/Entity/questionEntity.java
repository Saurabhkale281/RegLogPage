package Code_Crafter.RegLogPage.Entity;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class questionEntity {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String technology;
	    private String proficiencyLevel;

	    private String questionText;

	    @ElementCollection
	    private List<String> options;

	    private String correctOption; // New field for the correct option

	    // Getters and Setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getTechnology() {
	        return technology;
	    }

	    public void setTechnology(String technology) {
	        this.technology = technology;
	    }

	    public String getProficiencyLevel() {
	        return proficiencyLevel;
	    }

	    public void setProficiencyLevel(String proficiencyLevel) {
	        this.proficiencyLevel = proficiencyLevel;
	    }

	    public String getQuestionText() {
	        return questionText;
	    }

	    public void setQuestionText(String questionText) {
	        this.questionText = questionText;
	    }

	    public List<String> getOptions() {
	        return options;
	    }

	    public void setOptions(List<String> options) {
	        this.options = options;
	    }

	    public String getCorrectOption() {
	        return correctOption;
	    }

	    public void setCorrectOption(String correctOption) {
	        this.correctOption = correctOption;
	    }
}
