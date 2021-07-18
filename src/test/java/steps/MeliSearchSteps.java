package steps;

import cucumber.api.java.en.*;
import pages.MeliHome;

public class MeliSearchSteps {
    
    MeliHome home = new MeliHome();



    @Given("^the user is in the homepage$")
        public void navigateToHomepage(){
            home.navigateToMeli();
        }
    

    @When("^the user enters a search criteria in the search bar$")
        public void enterSearchCriteria(){
            home.enterSearchCriteria("Teclado");
        }
    

    @And("^submits the search$")
        public void submitSearch(){
            home.submitSearch();
        }
    

    @Then("^the user sees the products matching the search criteria$")
        public void validateResults() throws Throwable{

        }
    

}
