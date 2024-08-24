package Code_Crafter.RegLogPage.DTO;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class loginDTO {
	
	private String email_id;
	
	private String password;

	public loginDTO(String email_id, String password) {
		super();
		this.email_id = email_id;
		this.password = password;
	}
	
	public loginDTO() {
	}
	

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "loginDTO [email_id=" + email_id + ", password=" + password + "]";
	}
	
}
