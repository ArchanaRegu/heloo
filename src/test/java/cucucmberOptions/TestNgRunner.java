package cucucmberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue="stepDefination",monochrome=true,tags="@SmokeTest or @RegressionTest",plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json"})
public class TestNgRunner extends AbstractTestNGCucumberTests{
//dryRun=true,
}
