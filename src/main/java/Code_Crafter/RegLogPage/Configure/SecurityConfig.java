//package Code_Crafter.RegLogPage.Configure;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig{
//	
//	
////	 	@Bean
////	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
////	        http
////	            .authorizeHttpRequests(authz -> authz
////	                .requestMatchers("/", "/html/home.html", "/html/Registration.html", "/html/Login.html", "/html/feedback.html").permitAll() // Public pages
////	                .requestMatchers("/html/adminpage.html**").hasRole("ADMIN") // Admin pages
////	                .anyRequest().authenticated() // Other pages require authentication
////	            )
////	            .formLogin(form -> form
////	                .loginPage("/html/Login.html")
////	                .defaultSuccessUrl("/html/home.html", true)
////	                .permitAll()
////	            )
////	            .logout(logout -> logout
////	                .permitAll()
////	            );
////
////	        return http.build();
////	    }
//
//	    @Bean
//	    public PasswordEncoder passwordEncoder() {
//	        return new BCryptPasswordEncoder();
//	    }
//    
//    
//    
//}