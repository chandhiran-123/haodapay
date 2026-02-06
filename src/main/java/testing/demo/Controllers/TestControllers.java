package testing.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllers {
	
	@GetMapping("/index")
	private String pubilc() {
		return "hlo world";
	}
}
