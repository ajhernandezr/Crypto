package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class stepDef {

    @Given("^a client creates a market \"([^\"]*)\" order$")
    public void a_client_creates_a_market_order(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Implement code here, printing the parameter from the Scenario " + arg1);
    }

    @Then("^the order is set to INITIALIZED$")
    public void the_order_is_set_to_INITIALIZED() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Implement code here");
    }

    @Then("^the order is executed at market price$")
    public void the_order_is_executed_at_market_price() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Implement code here");
    }

    @Given("^a client creates a \"([^\"]*)\" limit order$")
    public void a_client_creates_a_limit_order(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Implement code here, printing the parameter from the Scenario " + arg1);
    }

    @Given("^the limit is set to (\\d+)$")
    public void the_limit_is_set_to(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Implement code here, printing the parameter from the Scenario " + arg1);
    }

    @Then("^the transaction is hold until the price limit is met$")
    public void the_transaction_is_hold_until_the_price_limit_is_met() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Implement code here");
    }

    @Given("^a client creates a \"([^\"]*)\" stop limit order$")
    public void a_client_creates_a_stop_limit_order(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Implement code here, printing the parameter from the Scenario " + arg1);
    }

    @Given("^the stop  is set to (\\d+)$")
    public void the_stop_is_set_to(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Implement code here, printing the parameter from the Scenario " + arg1);
    }

    @When("^the (\\d+) is hit$")
    public void the_is_hit(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Implement code here, printing the parameter from the Scenario " + arg1);
    }

    @When("^the (\\d+) is reached or higher$")
    public void the_is_reached_or_higher(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Implement code here, printing the parameter from the Scenario " + arg1);
    }

    @Then("^the transaction is executed$")
    public void the_transaction_is_executed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Implement code here");
    }

    @Then("^a second transaction for journal purposes is created$")
    public void a_second_transaction_for_journal_purposes_is_created() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Implement code here");
    }

    @When("^the (\\d+) is not reached$")
    public void the_is_not_reached(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Implement code here, printing the parameter from the Scenario " + arg1);
    }

    @Then("^the transaction is not executed$")
    public void the_transaction_is_not_executed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Implement code here");
    }
}
