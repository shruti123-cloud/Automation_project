package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Class_002 {
  @Test
  public void f() {
	  System.out.println("f method");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test method");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suit method");

  }
  @BeforeClass
  public void beforeclass() {
	  System.out.println("before class method");

  }

}
