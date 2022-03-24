package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONArray jsonArray;

    public JSONBookMetadataFormatter() throws IOException {
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
        String authors = String.join("|",b.getAuthors());

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
