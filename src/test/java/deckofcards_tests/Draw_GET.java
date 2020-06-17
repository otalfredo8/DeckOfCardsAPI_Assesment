package deckofcards_tests;

import configs.DeckOfCardsEndPoints;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class Draw_GET extends BaseTest{

    private static Response response;
    private static String deckIDstr;


    @BeforeMethod
    public void deskIDSetUp(){
        Response responseDeck = RestAssured.given().get(DeckOfCardsEndPoints.NEW_DECK);
        deckIDstr = responseDeck.jsonPath().get("deck_id");
    }

    @Test
    public void drawOne(){
        int numOfCards = 1;
        response = RestAssured.given().queryParam("count", Integer.toString(numOfCards))
                .when().get(deckIDstr+ "/" +DeckOfCardsEndPoints.DRAW);

        response.prettyPrint();

        assertThat(response.jsonPath().get("remaining"), is(52));
    }
}
