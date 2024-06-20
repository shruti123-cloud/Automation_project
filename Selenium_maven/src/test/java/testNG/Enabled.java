package testNG;

import org.testng.annotations.Test;

public class Enabled {
  @Test
  public void f() {
	  System.out.println("f");
  }
  @Test(enabled = true)
  public void g() {
	  System.out.println("f");
  }
  @Test(enabled = false)
  public void j() {
	  System.out.println("j");
  } 
 
}
