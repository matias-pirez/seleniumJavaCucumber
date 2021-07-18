package pages;

//import java.util.List;

public class MeliHome extends BasePage{
    private String searchBar = "//header/div[1]/form[1]/input[1]";
    private String searchBtn = "//header/div[1]/form[1]/button[1]";
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

    /*public List getSuggestionList(String criteria){
        return getList(suggestionsList);
    }*/
}
