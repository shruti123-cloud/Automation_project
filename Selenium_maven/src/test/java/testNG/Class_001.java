package testNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class_001 {
  @Test
  public void a() {
	  System.out.println("hii testing");
 }
  @Test
  public void b() {
	  System.out.println("hii testing");
  }
  @Test
  public void c() {
	  System.out.println("hii testing");
}
  @BeforeSuite
  public void x() {
	  System.out.println("x");

  }
}
