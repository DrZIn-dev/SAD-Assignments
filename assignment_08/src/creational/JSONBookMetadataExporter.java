package creational;

import java.io.IOException;

public class JSONBookMetadataExporter extends BookMetadataExporter{

    @Override
    public BookMetadataFormatter createFormatter() {
        return new JSONBookMetadataFormatter();
    }
}
