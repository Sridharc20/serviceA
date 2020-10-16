/**
 * 
 */
package com.example.serviceA;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sridhar
 *
 */
@RestController
public class ServiceAConrroller {

	@GetMapping("servicea")
	public String home() {
		return "service a home";
	}
}
