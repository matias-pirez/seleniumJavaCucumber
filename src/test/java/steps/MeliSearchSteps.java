package steps;

import java.util.List;
//import org.junit.Assert;
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
        public void validateSearchResults() throws AssertionError{
            List<String> list = home.getSearchResults();
            /*for (String e: list){
                boolean textIsThere = e.contains("Teclado");
                Assert.assertTrue(textIsThere);
            }*/
            for (int i = 0; i < 3; i++){
                boolean textIsThere = list.get(i).contains("Teclado");
                if(textIsThere){
                    System.out.println("PASSED: The search criteria was found in the first 3 results.");
                } else {
                    throw new Error("FAILED: The search criteria wasn't found in the first 3 results.");
                    }
                }
            }
    }
