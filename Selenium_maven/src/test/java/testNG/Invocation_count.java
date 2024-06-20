package testNG;

import org.testng.annotations.Test;

public class Invocation_count {
    @Test(invocationCount = 2)
    public void f() {
    	System.out.println("f method");
    }

}
