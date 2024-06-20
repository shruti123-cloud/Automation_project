package testNG;

import org.testng.annotations.Test;

public class Prioroty {
	@Test(priority = 1)
	  public void xy() {
		  System.out.println("xy");
	  }
	@Test(priority = 2)
	  public void cd() {
		  System.out.println("cd");
	  }
	@Test(priority = 3)
	  public void ef() {
		  System.out.println("ef");
	  }
	@Test(priority = 4)
	  public void gh() {
		  System.out.println("gh");
	  }
	@Test(priority = 5)
	  public void ij() {
		  System.out.println("ij");
	  }
	@Test(priority = 6)
	  public void kl() {
		  System.out.println("kl");
	  }

		

}
