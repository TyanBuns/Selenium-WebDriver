package Dangnhap;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class LoginDN {
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Pre-condition");
  }
// Testcase
  
  @Test
  public void TC_01() {
	  System.out.println("Test case 01");
  }
  @Test
  public void TC_02() {
	  System.out.println("Test case 02");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Post-condition");
  }

}
