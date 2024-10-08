package Code_Crafter.RegLogPage.Configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
	
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")									// Configures Cross Origin Resource Sharing for all ends points 
                .allowedOrigins("https://code-crafter.vercel.app")			//allowed origins to access resources
                .allowedMethods("GET", "POST", "PUT", "DELETE")		//HTTP methods that are allowed for CORS requests
                .allowedHeaders("*")
                .allowCredentials(true);							//browser should include credentials likes cookies, HTTP authentication in CORS requests we make true
    }
}