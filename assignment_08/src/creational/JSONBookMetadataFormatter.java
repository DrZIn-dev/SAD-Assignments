package creational;

import org.apache.commons.lang3.StringUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONArray jsonArray;

    public JSONBookMetadataFormatter() {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        jsonArray = new JSONArray();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        ArrayList<String> authors = new ArrayList<String>();
        for (String author : b.getAuthors()) {
            authors.add(author);
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ISBN", b.getISBN());
        jsonObject.put("Title", b.getTitle());
        jsonObject.put("Publisher", b.getPublisher());
        jsonObject.put("Authors", authors);

        jsonArray.add(jsonObject);
        return this;
    }

    @Override
    public String getMetadataString() {
        return jsonArray.toJSONString();
    }
}
