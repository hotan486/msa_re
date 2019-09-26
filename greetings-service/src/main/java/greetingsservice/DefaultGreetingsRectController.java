package greetingsservice;

import java.util.Collections;
import java.util.Map;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Profile({"default", "insecure"})
@RestController
@RequestMapping(method = RequestMethod.GET, value = "/greet/{name}")
public class DefaultGreetingsRectController {

	@RequestMapping
	Map<String, String> hi(@PathVariable String name){
		
		return Collections.singletonMap("greeting", "Hello, " + name + "!");
	}
}
