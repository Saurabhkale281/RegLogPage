package Code_Crafter.RegLogPage.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Code_Crafter.RegLogPage.DTO.RegisterDTO;
import Code_Crafter.RegLogPage.DTO.loginDTO;
import Code_Crafter.RegLogPage.Entity.userDetails;
import Code_Crafter.RegLogPage.Repository.UserRepository;
import Code_Crafter.RegLogPage.ResponseModel.addUserResponse;
import Code_Crafter.RegLogPage.ResponseModel.loginResponse;

@Service
public class userServiceImp{
	
	@Autowired 
	private UserRepository userrepository;
	
//	 @Autowired
//	 private PasswordEncoder passwordEncoder;  // Inject the password encoder



	 public addUserResponse addUser(RegisterDTO registerdto) {
			addUserResponse response = new addUserResponse();
			try {
				
				//check if user already exists
				Optional<userDetails> existingUser = userrepository.findByEmailId(registerdto.emailId());
	            if (existingUser.isPresent()) {
	                response.setMessage("User already exists");
	            }else {
				userDetails user = new userDetails();
				user.setEmail_id(registerdto.emailId());
				user.setPassword(registerdto.password());
				user.setFirst_name(registerdto.firstName());
				user.setLast_name(registerdto.lastName());
				user.setMobile_no(registerdto.mobileNo());
				user.setGender(registerdto.gender());
				userrepository.save(user);
				if(user.getEmail_id() != null) {
					response.setMessage("Registered successfully");
				}
				else {
					response.setMessage("Registration failed");
				}
	            }
			}catch(Exception e) {
				response.setMessage(e.getMessage());
			}
			return response;
		}


	public loginResponse loginUser(loginDTO login) {
		loginResponse response = new loginResponse();
		Optional<userDetails> user = userrepository.findByEmailId(login.getEmail_id());
//		System.out.println(user);
		if(user.isPresent()) {
			String password = login.getPassword();
			String storedPassword = user.get().getPassword();
			boolean isPasswordMatch = password.equals(storedPassword);
			if(isPasswordMatch) {
					 response.setMessage("Login Success");
				}else {
				response.setMessage("Password not matched");
			}
			
		}else {
			 response.setMessage("Email not exits");
		}
		return response;
	}

}
