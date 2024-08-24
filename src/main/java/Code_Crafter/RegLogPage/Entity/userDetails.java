package Code_Crafter.RegLogPage.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="user_details")
public class userDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="emailId")
	private String emailId;
	
	@Column(name="password")
	private String password;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="mobile_no")
	private long mobile_no;
	
	@Column(name="gender")
	private String gender;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getEmail_id() {
		return emailId;
	}



	public void setEmail_id(String EmailId) {
		this.emailId = EmailId;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getFirst_name() {
		return first_name;
	}



	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}



	public String getLast_name() {
		return last_name;
	}



	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}



	public long getMobile_no() {
		return mobile_no;
	}



	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "userDetails [id=" + id + ", email_id=" + emailId+ ", password=" + password + ", first_name="
				+ first_name + ", last_name=" + last_name + ", mobile_no=" + mobile_no + ", gender=" + gender + "]";
	}

}
