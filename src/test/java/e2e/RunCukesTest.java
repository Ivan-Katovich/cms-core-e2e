package e2e;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class RunCukesTest {

    @BeforeClass
    public static void SetupTest(){
        Browser.Start();
    }

    @AfterClass
    public static void TeardownTest(){
        Browser.Close();
    }
}
