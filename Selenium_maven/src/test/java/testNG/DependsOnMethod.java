package testNG;

import org.testng.annotations.Test;

public class DependsOnMethod {
@Test(dependsOnMethods = "b")
  public void a() {
	  System.out.println("a method");
  }
  @Test
  public void b() {
	  System.out.println("g method");
  }
  @Test(dependsOnMethods = "d" )
  public void c() {
	  System.out.println("h method");
  }
@Test
public void d() {
	System.out.println("i method");
}
}
