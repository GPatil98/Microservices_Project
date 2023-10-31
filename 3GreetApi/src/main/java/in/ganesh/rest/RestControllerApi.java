package in.ganesh.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerApi {

	@Autowired
	private Environment env;
	
	@GetMapping("/greet")
	public String GetMappingApi() {
		
		String port = env.getProperty("server.port");
		return "Welcome To GreetApi (" + port+ ") ";
	}
}
