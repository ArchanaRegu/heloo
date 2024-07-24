package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	@Before("@NetBanking")
    public void NetBankingSetup()
    {
    	System.out.println("*******************");
    	System.out.println("setup the entries in NetBanking database");
    }
    @After
    public void tearDown()
    {
    	System.out.println("clear all entries");
    }
    @Before("@Mortgage")
    public void mortgage() {
    	System.out.println("setup the entries in mortgage database");
    }
    
}
