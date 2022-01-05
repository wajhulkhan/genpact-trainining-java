package com.org.genpact.day6;

import java.util.Arrays;
import java.util.List;

public class RegistrationService {
	
	public void validateEmail(String email) {
		if(!isDomainValid(email)) {
			throw new DomainNotValidateException("Invalid Domain");
			
		}
	}
	
	private boolean isDomainValid(String email) {
		List<String> validDomain = Arrays.asList("gmail.com", "yahoo.com","outlook.com");
		if(validDomain.contains(email.substring(email.indexOf("@")+1)))
				return true;
				
		return true;
	}

}
