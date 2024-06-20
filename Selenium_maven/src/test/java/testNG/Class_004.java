package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class_004 {
  @Test
  public void a() {
	  System.out.println("a");
  }
  @Test
  public void b() {
	  System.out.println("b");

  }
  @Test
  public void c() {
	  System.out.println("c");

  }
  @AfterMethod
  public void f() {
	  System.out.println("after method");

  }
  @AfterClass
  public void g() {
	  System.out.println("after class");
}
  @AfterTest
  public void j() {
	  System.out.println("after test");
}
  @AfterSuite
  public void k() {
	  System.out.println("after suit");
}           
          
   
  
}
