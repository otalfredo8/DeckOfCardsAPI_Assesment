package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Deck {

    @SerializedName("shuffled")
    private String shuffled;

    @SerializedName("remaining")
    private String remaining;

    @SerializedName("deck_id")
    private String deckId;

    @SerializedName("success")
    private String success;

    public String getShuffled() {
        return shuffled;
    }

    public void setShuffled(String shuffled) {
        this.shuffled = shuffled;
    }

    public String getRemaining() {
        return remaining;
    }

    public void setRemaining(String remaining) {
        this.remaining = remaining;
    }

    public String getDeckId() {
        return deckId;
    }

    public void setDeckId(String deckId) {
        this.deckId = deckId;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }
}
