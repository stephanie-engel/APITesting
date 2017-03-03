package api;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.baseURI;
import static org.hamcrest.Matchers.equalTo;

public class ReactMultipleIssueGetTests {
	
    @Test
    public void getMultipleRepoUrl() {
    	baseURI = "https://api.github.com";
    	
    		given().
    			contentType("application/json").
    		when().
    			get("repos/facebook/react/issues").
    		then().
    			body("repository_url[0]", equalTo("https://api.github.com/repos/facebook/react")).
    			and().body("repository_url[1]", equalTo("https://api.github.com/repos/facebook/react"));
    }
    
    @Test
    public void getMultipleState() {
    	baseURI = "https://api.github.com";
    	
			given().
				contentType("application/json").
			when().
				get("repos/facebook/react/issues").
			then().
				body("state[0]", equalTo("open")).
				and().body("state[1]", equalTo("open"));
    }


}

