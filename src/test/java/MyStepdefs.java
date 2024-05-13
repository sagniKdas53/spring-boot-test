import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("I start testing")
    public void iStartTesting() {
        System.out.printf("Started testing\n");
    }

    @When("Test goes well")
    public void testGoesWell() {
        System.out.printf("Test went well\n");
    }

    @Then("Test is done")
    public void testIsDone() {
        System.out.printf("Test is done\n");
    }
}
