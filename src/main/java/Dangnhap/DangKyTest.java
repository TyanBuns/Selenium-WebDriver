package Dangnhap;

public class DangKyTest {
	

	  public static void main(String[] args) {
	        testRegisterWithExistingUsername();
	        testRegisterWithWeakPassword();
	        testSuccessfulRegistration();
	    }

	    public static void testRegisterWithExistingUsername() {
	        String username = "existingUser";
	        String password = "ValidPass1";
	        boolean result = registerUser(username, password);
	        if (!result) {
	            System.out.println("Test Passed: Registration failed with existing username.");
	        } else {
	            System.out.println("Test Failed: Registration succeeded with existing username.");
	        }
	    }

	    public static void testRegisterWithWeakPassword() {
	        String username = "newUser";
	        String password = "weak";
	        boolean result = registerUser(username, password);
	        if (!result) {
	            System.out.println("Test Passed: Registration failed with weak password.");
	        } else {
	            System.out.println("Test Failed: Registration succeeded with weak password.");
	        }
	    }

	    public static void testSuccessfulRegistration() {
	        String username = "newUser";
	        String password = "StrongPass1";
	        boolean result = registerUser(username, password);
	        if (result) {
	            System.out.println("Test Passed: Registration succeeded with valid data.");
	        } else {
	            System.out.println("Test Failed: Registration failed with valid data.");
	        }
	    }

	    // Phương thức giả lập đăng ký
	    private static boolean registerUser(String username, String password) {
	        if (username.equals("existingUser")) return false;
	        if (password.length() < 8 || !password.matches(".*[A-Z].*")) return false;
	        return true;
	    }
	}
