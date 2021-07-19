package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;


public class MeliHome extends BasePage{
    private String searchBar = "//header/div[1]/form[1]/input[1]";
    private String searchBtn = "//header/div[1]/form[1]/button[1]";
    private String searchResults = "ui-search-item__group--title";
    //private String suggestionsList = "//body/div[@id='sb-suggestions-1']/div[1]/ul[1]";

    public MeliHome(){
        super(driver);
    }

    public void navigateToMeli(){
        navigateTo("https://www.mercadolibre.com.uy");
    }

    public void enterSearchCriteria(String criteria){
        writeText(searchBar, criteria);
    }

    public void submitSearch(){
        clickElement(searchBtn);
    }

    public List<String> getSearchResults(){
        List<WebElement> list = getAllElements(searchResults);
        List<String> stringsFromList = new ArrayList<String>();
        for(WebElement e: list){
            stringsFromList.add(e.getText());
        }
        return stringsFromList;
    }
}
