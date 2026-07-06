package testSuite;

import io.restassured.response.Response;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.google.i18n.phonenumbers.AsYouTypeFormatter;

import properties.bookStoreProperties;
import entities.books;
import entities.getBooksResponse;

import static io.restassured.RestAssured.given;

import java.util.List;

public class getBooksTest extends baseTest {

    @Test(groups = {"testTag"})
    public void getAllBooksData() {
        Response resp = given().
                contentType("application/json").
                when().
                get(bookStoreProperties.getAllBooks);
        System.out.println(resp.asString());
        getBooksResponse getBooksResponse = resp.as(entities.getBooksResponse.class);
        
    }
    
    
    @Test
    public void assertbookscount() {
    	Response resp = given().
                contentType("application/json").
                when().
                get(bookStoreProperties.getAllBooks);
    	getBooksResponse getBooksResponse = resp.as(entities.getBooksResponse.class);
    	List<books> book= getBooksResponse.getBooks();
    	System.out.println(book.size());
    	
  //  	books books = new books();
    	
    	int count =0;
    	for(int i=0;i<book.size();i++) {
    	
    		String title= book.get(i).getTitle();
    		if(title.contains("Java")) {
    			System.out.println(title);
    			count++;
    		}
    	}
    	
    	System.out.println("Java books : " + count);
    	
    	
    }
}
