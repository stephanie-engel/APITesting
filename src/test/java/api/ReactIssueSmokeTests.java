package api;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.baseURI;

public class ReactIssueSmokeTests {

    
    @Test
    public void getIssue() {
    	baseURI = "https://api.github.com";
    	
    			given().
    				contentType("application/json").
    				pathParam("number", "8850").
    			when().
    				get("repos/facebook/react/issues/{number}").
    			then().
    				statusCode(200);
    }
    
    @Test
    public void getIssueBadUrl() {
    	baseURI = "https://api.github.com";
    	
    			given().
    				contentType("application/json").
    				pathParam("number", "8850").
    			when().
    				get("repos/facebook/react/issues//{number}").
    			then().
    				statusCode(404);
    }
    
    @Test
    public void getIssueNotExists() {
    	baseURI = "https://api.github.com";
    	
    			given().
    				contentType("application/json").
    				pathParam("number", "0000").
    			when().
    				get("repos/facebook/react/issues/{number}").
    			then().
    				statusCode(404);
    }
    
    @Test
    public void getSeveralIssues() {
    	baseURI = "https://api.github.com";
    	
    			given().
    				contentType("application/json").
    			when().
    				get("repos/facebook/react/issues").
    			then().
    				assertThat().
    				statusCode(200);
    				
    }
    
    @Test
    public void getSeveralIssuesBadUrl() {
    	baseURI = "https://api.github.com";
    			given().
    				contentType("application/json").
    			
    			when().
    				get("repos/facebook/react/issues/").
    			then().
    				assertThat().
    				statusCode(404);
    				
    }
}
