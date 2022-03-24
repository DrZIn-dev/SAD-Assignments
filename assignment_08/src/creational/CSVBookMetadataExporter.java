package creational;

import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter {

    @Override
    public BookMetadataFormatter createFormatter() {
        try {
            return  new CSVBookMetadataFormatter();
        }catch (IOException ioException){
            ioException.printStackTrace();
            return null;
        }
    }
}
