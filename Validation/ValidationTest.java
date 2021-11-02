package Validation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidationTest implements ValidateUserDetails{

	@Test
	public  static void givenFirstName_WhenProper_ShouldReturnTrue() {
		boolean result= ValidateUserDetails.validateFirstName("Smruti");
		Assertions.assertTrue(result);

	}

	@Test
	public void givenFirstLetterSmall_CheckForValidation_ReturnFalse() {
		boolean result = ValidateUserDetails.validateFirstName("chiku");
		Assertions.assertFalse(result);
	}

	@Test
	public void givenTwoLetters_CheckForValidation_ReturnFalse() {
		boolean result = ValidateUserDetails.validateFirstName("Sr");
		Assertions.assertFalse(result);
	}

	@Test
	void givenLasrName_CheckForValidationForLName_ReturnTrue() {
		boolean result = ValidateUserDetails.validateLastName("Lenk");
		Assertions.assertTrue(result);
	}

	@Test
	void givenTwoSmalls_CheckForValidationForLName_RetrunFalse() {
		boolean result = ValidateUserDetails.validateLastName("lenka");
		Assertions.assertFalse(result);
	}

	@Test
	void givenEmail_CheckForValidationForEmail_RetrunTrue() {
		boolean result = ValidateUserDetails.validateEmails("rty.rec@bl.com");
		Assertions.assertTrue(result);
	}

	@Test
	void givenEmail_CheckForValidationForEmail_RetrunFalse() {
		boolean result =ValidateUserDetails.validateEmails("rew.gdg@bl");
		Assertions.assertFalse(result);
	}

	@Test
	void givenEmail_CheckForValidationForMobile_RetrunTrue() {
		boolean result = ValidateUserDetails.validateMobile("91 7504614661");
		Assertions.assertTrue(result);
	}

	@Test
	void WithoutSpace_CheckForValidationForMobile_RetrunFalse() {
		boolean result = ValidateUserDetails.validateMobile("918917341747");
		Assertions.assertFalse(result);
	}

	@Test
	void givenPassword_CheckForValidationForPasswordRule4_RetrunTrue() {
		boolean result =ValidateUserDetails.validatePassword("Slenka@123");
		Assertions.assertTrue(result);
	}

	@Test
	void withoutRule4_CheckForValidationForPasswordRule4_ReturnFalse() {
		boolean result =ValidateUserDetails.validatePassword("Sygrxewuexeu");
		Assertions.assertFalse(result);
	}
}
	
	 
	
	

  
	


