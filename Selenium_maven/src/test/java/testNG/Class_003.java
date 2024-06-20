package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class Class_003 {
  @Test
  public void c() {
	  System.out.println("c");
}
  @Test
  public void a() {
	  System.out.println("a");
 }
  @Test
  public void b() {
	  System.out.println("b");
 }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
}
  

}
