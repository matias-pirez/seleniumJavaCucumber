package pages;

public class GooglePage extends BasePage {
    private String searchButton = "//input[@value='Buscar con Google']";
    private String searchTextField = "//input[@title='Buscar']";


    public GooglePage(){
        super(driver);
    }


    public void navigateToGoogle(){
        navigateTo("https://www.google.com");
    }

    public void enterSearchCriteria(String criteria){
        writeText(searchTextField, criteria);
    }

    public void clickSearchButton(){
        clickElement(searchButton);
    }
}
