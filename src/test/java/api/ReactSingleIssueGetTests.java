package api;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.baseURI;
import static org.hamcrest.Matchers.equalTo;

public class ReactSingleIssueGetTests {
    
	String issueNumber = "8850";
	int userId = 1619545;
	
    @Test
    public void getRepoUrl() {
    	baseURI = "https://api.github.com";
    	
    		given().
    			contentType("application/json").
    			pathParam("number", issueNumber).
    		when().
    			get("repos/facebook/react/issues/{number}").
    		then().
    			body("repository_url", equalTo("https://api.github.com/repos/facebook/react"));
    }
    
    @Test
    public void getLabelsUrl() {
    	baseURI = "https://api.github.com";
    	
			given().
				contentType("application/json").
				pathParam("number", issueNumber).
			when().
				get("repos/facebook/react/issues/{number}").
			then().
				body("labels_url", equalTo("https://api.github.com/repos/facebook/react/issues/"+issueNumber+"/labels{/name}"));
    }
    
    @Test
    public void getUserId() {
    	baseURI = "https://api.github.com";
    	
			given().
				contentType("application/json").
				pathParam("number", issueNumber).
			when().
				get("repos/facebook/react/issues/{number}").
			then().
				body("user.id", equalTo(userId));
    }

}
