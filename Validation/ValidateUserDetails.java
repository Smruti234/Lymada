package Validation;

import java.util.function.Predicate;

public interface ValidateUserDetails {
	
	 public static boolean validateFirstName(String fname) {
			
			boolean isValid = isValid( fname,
					(String info) -> {
						String regx = "^([A-Z]{1}[a-z]{2,})";
						return info.matches(regx);
					});
			   
			return isValid;
			
		}
		    public static  boolean validateLastName(String lname) {
		    	boolean isValid = isValid( lname,
		    			(String info) -> {
		    				String regxLast= "^([A-Z]{1}[a-z]{2,})";
		    				return info.matches(regxLast);
		    			});
		    	   
		    	return isValid;
		    	
			}
		    
		    public  static boolean isValid(String data, Predicate<String> predicate) {
				return predicate.test(data);	
			}
		    
		    public static  boolean validateMobile(String mobile){
		    	boolean isValid = isValid(mobile,
		    			(String info) -> {
		    				String regxMobile=  "^(\\d{2})( )([7-9]{1})(\\d{9})";
		    				return info.matches(regxMobile);
		    			});
		    	   
		    	return isValid;
		    	
		    }
		    
		    public static boolean validatePassword(String password){
		    	boolean isValid = isValid(password,
		    			(String info) -> {
		    				String regxPassword=  "^([A-Z]{1}[a-zA-Z]{8,}[@#$%^&+=]{1}[0-9]{1})";
		    				return info.matches(regxPassword);
		    			});
		    	   
		    	return isValid;
		    	
		    }
		 
		 public static  boolean validateEmails(String email) {
				
			 boolean isValid = isValid( email,
		 			(String info) -> {
		 				String regxemail="^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		 				return info.matches(regxemail);
		 			});
		 	   
		 	return isValid;
			}  
}
