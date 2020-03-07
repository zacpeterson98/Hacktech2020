package Item;

public class WebSearch {
    private static String key = "604781d0ade44c9cafc69fcbda20675a"; // Spoonacular API key:
    private String ingredients; // string,string,string
    private int numResults;     // number of result to display: 0-100
    private boolean license;    // true for open license
    private int rank;                   // Sort results: 1 for current ingredients, 2 for missing ingredients
    private boolean ignoreCommonIngred; // True: ignore common items such as water, salt, etc.

    // CONSTRUCTORS
    public WebSearch(String initIngred, int initNumResults, int initRank, boolean initIgnore){
        this.ingredients = initIngred;
        this.numResults = initNumResults;
        this.license = true;
        this.rank = initRank;
        this.ignoreCommonIngred = initIgnore;
    }

    public WebSearch(String initIngred, int initNumResults, int initRank){
        this (initIngred, initNumResults, initRank, true);
    }

    public WebSearch(String initIngred, int initNumResults){
        this (initIngred, initNumResults, 1, true);
    }

    public WebSearch(String initIngred){
        this (initIngred, 5, 1, true);
    }

    public String getKey() {return key;}
    public void SetKey(String newKey) {this.key = newKey;}

    public String GetIngredients() {return ingredients;}
    public void SetIngredients(String newIngred) {this.ingredients = newIngred;}

    public int GetResults() {return numResults;}
    public void SetResults(int newResults) {this.numResults = newResults;}

    public boolean GetLicense() {return license;}
    public void SetLicense (boolean newLicense) {this.license = newLicense;}

    public int GetRank() {return rank;}
    public void SetRank(int newRank) {this.rank = newRank;}

    public boolean GetIgnore() {return ignoreCommonIngred;}
    public void SetIgnore(boolean newIgnore) {this.ignoreCommonIngred = newIgnore;}

    // method to search web

    public void PrintData(){    // Print class attributes
        System.out.println("Key: " + key);
        System.out.println("Ingredients: " + ingredients);
        System.out.println("Number of results: " + numResults);
        System.out.println("Print open-source images? " + license);
        System.out.println("Rank of results: " + rank);
        System.out.println("Ignore common ingredients? " + ignoreCommonIngred);
    }

    // TODO: method to utilize spoon API with JSON to perform search. method to display/collate results
    //

    // method to "GET https://api.spoonacular.com/recipes/findByIngredients"

    // https://api.spoonacular.com/recipes/findByIngredients <--- sample query

    // https://api.spoonacular.com/recipes/findByIngredients?ingredients=apples,+flour,+sugar&number=2 <--- query with args

}
