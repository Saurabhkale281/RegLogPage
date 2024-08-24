package Code_Crafter.RegLogPage.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Code_Crafter.RegLogPage.DTO.RegisterDTO;
import Code_Crafter.RegLogPage.DTO.loginDTO;
import Code_Crafter.RegLogPage.Entity.userDetails;
import Code_Crafter.RegLogPage.ResponseModel.addUserResponse;
import Code_Crafter.RegLogPage.ResponseModel.loginResponse;
import Code_Crafter.RegLogPage.Service.userServiceImp;

@RestController
public class userController {
	
	@Autowired 
	private userServiceImp userservice;
	
	@PostMapping("/register")
	public addUserResponse register(@RequestBody RegisterDTO registerdto) {
		return userservice.addUser(registerdto);
	
	}
	
	@PostMapping("/login")
	public loginResponse login(@RequestBody loginDTO login) {	
		return userservice.loginUser(login);
		
	}
}
