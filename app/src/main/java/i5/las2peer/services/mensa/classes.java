package i5.las2peer.services.mensa;

import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.ParseException;

public class classes {

    class DishRating {

    public DishRating() {}
    
    private int rating;

    public void setrating(int setValue) {
        this.rating = setValue;
    }

    public int getrating() {
        return this.rating;
    }

    public JSONObject toJSON() {

        JSONObject jo = new JSONObject();
        jo.put("rating", this.rating); 

        return jo;
    }

    public void fromJSON(String jsonString) throws ParseException {
        JSONObject jsonObject = (JSONObject) JSONValue.parseWithException(jsonString);
        this.rating = ((Long) jsonObject.get("rating")).intValue(); 

    }

}

    
}
